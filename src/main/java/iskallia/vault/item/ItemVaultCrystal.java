package iskallia.vault.item;

import iskallia.vault.block.VaultPortalSize;
import iskallia.vault.init.ModItems;
import iskallia.vault.init.ModSounds;

import iskallia.vault.util.VaultRarity;
import iskallia.vault.world.raid.modifier.*;
import iskallia.vault.config.*;
import jdk.nashorn.internal.ir.ReturnNode;
import iskallia.vault.world.raid.VaultRaid;
import iskallia.vault.init.ModConfigs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.Constants;

import net.minecraft.server.*;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.UUID;

import javax.lang.model.util.ElementScanner6;

import java.util.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemVaultCrystal extends Item {

    private VaultRarity vaultRarity;
    public Set<VaultModifier> modifiers = new HashSet<>();

    public ItemVaultCrystal(ItemGroup group, ResourceLocation id, VaultRarity vaultRarity) {
        super(new Properties()
                .group(group)
                .maxStackSize(1));

        this.setRegistryName(id);
        this.vaultRarity = vaultRarity;
    }

    public static ItemStack getRandomCrystal() {
        return getCrystal(VaultRarity.getWeightedRandom());
    }

    public static ItemStack getCrystal(VaultRarity rarity) {
        switch(rarity) {
            case COMMON:
                return new ItemStack(ModItems.VAULT_CRYSTAL_NORMAL);
            case RARE:
                return new ItemStack(ModItems.VAULT_CRYSTAL_RARE);
            case EPIC:
                return new ItemStack(ModItems.VAULT_CRYSTAL_EPIC);
            case OMEGA:
                return new ItemStack(ModItems.VAULT_CRYSTAL_OMEGA);
        }

        return new ItemStack(ModItems.VAULT_CRYSTAL_NORMAL);
    }

    public static ItemStack getCrystalModified(VaultRarity rarity, Random random, int level) {

        int randRarity = MathHelper.nextInt(random, 1, 28);
        int randModifierNum = MathHelper.nextInt(random, 0, 1);
        int amountOfUnstableModifiers = MathHelper.nextInt(random, 1, 2);
        
        ItemStack item = new ItemStack(ModItems.VAULT_CRYSTAL_NORMAL);
        if (randRarity <= 1)
                {
                    item = new ItemStack(ModItems.VAULT_CRYSTAL_OMEGA);
                    randModifierNum = MathHelper.nextInt(random, 1, 2);
                }
        if (randRarity <= 5 && randRarity > 1)
                {
                    item = new ItemStack(ModItems.VAULT_CRYSTAL_EPIC);
                    randModifierNum = MathHelper.nextInt(random, 0, 2);
                }
        if (randRarity <= 13 && randRarity > 5)
                {
                    item = new ItemStack(ModItems.VAULT_CRYSTAL_RARE);
                    randModifierNum = MathHelper.nextInt(random, 0, 1);
                }
        if (randRarity <= 28 && randRarity > 13)
                {
                    item = new ItemStack(ModItems.VAULT_CRYSTAL_NORMAL);
                    randModifierNum = MathHelper.nextInt(random, 0, 1);
                }    
        if(level >= 20)
        {        
            for(int i = 0; i < randModifierNum; i++) 
            {
                List<VaultModifier> a = ModConfigs.VAULT_MODIFIERS.getAll();
                int randomModifier = MathHelper.nextInt(random, 0, a.size());
                ItemVaultCrystal.getData(item).addModifier(a.get(randomModifier).getName(), CrystalData.Modifier.Operation.ADD, 1.0F);
            }
            
        }

        return item;
    }

    public static ItemStack getCrystalWithBoss(String playerBossName) {
        ItemStack stack = ItemVaultCrystal.getRandomCrystal();
        stack.getOrCreateTag().putString("playerBossName", playerBossName);
        return stack;
    }

    public static ItemStack getCrystalWithBoss(VaultRarity rarity, String playerBossName) {
        ItemStack stack = ItemVaultCrystal.getCrystal(rarity);
        stack.getOrCreateTag().putString("playerBossName", playerBossName);
        return stack;
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if(context.getWorld().isRemote)return super.onItemUse(context);

        ItemStack stack = context.getPlayer().getHeldItemMainhand();
        Item item = stack.getItem();

        if(item instanceof ItemVaultCrystal) {
            ItemVaultCrystal crystal = (ItemVaultCrystal) item;

            String playerBossName = "";
            CompoundNBT tag = stack.getOrCreateTag();
            if (tag.keySet().contains("playerBossName")) {
                playerBossName = tag.getString("playerBossName");
            }

            BlockPos pos = context.getPos();
            if (tryCreatePortal(stack, context.getWorld(), pos, context.getFace(), playerBossName, getData(stack))) {
                context.getWorld().playSound(null,
                        pos.getX(),
                        pos.getY(),
                        pos.getZ(),
                        ModSounds.VAULT_PORTAL_OPEN,
                        SoundCategory.BLOCKS,
                        1f, 1f
                );

                context.getItem().shrink(1);

                IFormattableTextComponent text = new StringTextComponent("");
                text.append(new StringTextComponent(context.getPlayer().getName().getString()).mergeStyle(TextFormatting.GREEN));
                text.append(new StringTextComponent(" has created a "));
                for(CrystalData.Modifier modifier: getData(stack).modifiers) {
                    StringTextComponent name = new StringTextComponent(modifier.name);
                        text.append(new StringTextComponent(modifier.name).setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName(modifier.name).getColor()))))
                        .append(new StringTextComponent(", "));
        
                }
                if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") > 0)
                {
                    if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") == 1)
                        text.append(new StringTextComponent("").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") == 2)
                        text.append(new StringTextComponent("Greatly ").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") == 3)
                        text.append(new StringTextComponent("Exceedingly ").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") == 4)
                        text.append(new StringTextComponent("Enormously ").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") == 5)
                        text.append(new StringTextComponent("Immensely ").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    if(stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied") == 6)
                        text.append(new StringTextComponent("Beyond ").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    text.append(new StringTextComponent("Unstable").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_53008E))));
                    text.append(new StringTextComponent(", "));
                }
                String rarityName = crystal.getRarity().name().toLowerCase();
                rarityName = rarityName.substring(0, 1).toUpperCase() + rarityName.substring(1);

                text.append(new StringTextComponent(rarityName).mergeStyle(crystal.getRarity().color));
                text.append(new StringTextComponent(" Vault!"));

                context.getWorld().getServer().getPlayerList().func_232641_a_(
                        text, ChatType.CHAT, context.getPlayer().getUniqueID()
                );

                return ActionResultType.SUCCESS;
            }

        }
        return super.onItemUse(context);
    }

    private boolean tryCreatePortal(ItemStack crystal, World world, BlockPos pos, Direction facing, String playerBossName, CrystalData data) {
        Optional<VaultPortalSize> optional = VaultPortalSize.getPortalSize(world, pos.offset(facing), Direction.Axis.X);
        ItemStack tempCopy = crystal.copy();
        ItemVaultCrystal crystalCopy = (ItemVaultCrystal) tempCopy.getItem();
        CrystalData tempData = ItemVaultCrystal.getData(tempCopy);

        CompoundNBT nbt = tempCopy.getOrCreateTag();

        

        if (optional.isPresent()) {

            if(nbt.getInt("CrystalAmountOfUnstableCoresApplied") > 0)
            {
                for(int i = nbt.getInt("CrystalAmountOfUnstableCoresApplied"); i > 0; i--)
                {
                    Random random = world.getRandom();
                    List<VaultModifier> a = ModConfigs.VAULT_MODIFIERS.getAll();
                    int randomModifier = MathHelper.nextInt(random, 0, a.size());

                    
                    tempData.addModifier(a.get(randomModifier).getName(), CrystalData.Modifier.Operation.ADD, 1.0F);
                }
            }
            
            optional.get().placePortalBlocks(crystalCopy, playerBossName, tempData);
            return true;
        }
        return false;
    }

    @Override
    public ITextComponent getDisplayName(ItemStack stack) {
        if (stack.getItem() instanceof ItemVaultCrystal) {
            ItemVaultCrystal item = (ItemVaultCrystal) stack.getItem();

            CompoundNBT tag = stack.getOrCreateTag();
            if (tag.keySet().contains("playerBossName")) {
                return new StringTextComponent(item.getRarity().color + "Vault Crystal (" + tag.getString("playerBossName") + ")");
            }

            switch (item.getRarity()) {
                case COMMON:
                    return new StringTextComponent(item.getRarity().color + "Vault Crystal (common)");
                case RARE:
                    return new StringTextComponent(item.getRarity().color + "Vault Crystal (rare)");
                case EPIC:
                    return new StringTextComponent(item.getRarity().color + "Vault Crystal (epic)");
                case OMEGA:
                    return new StringTextComponent(item.getRarity().color + "Vault crystal (omega)");
            }
        }

        return super.getDisplayName(stack);
    }

    public VaultRarity getRarity() {
        return vaultRarity;
    }

    public static CrystalData getData(ItemStack stack) {
        return new CrystalData(stack);
    }

    public static void updateTexture(ItemStack stack) {
        int amountOfCores = stack.getOrCreateTag().getInt("CrystalAmountOfVoidCores");
        int amountOfUnstableModifiers = stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCores");
        int amountOfUnstableModifiersApplied = stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied");
        int amountOfCoresApplied = stack.getOrCreateTag().getInt("CrystalAmountOfVoidCoresApplied");
        
        if(amountOfCores >= 1 && amountOfUnstableModifiers < 1)
        {
            
            if(amountOfCoresApplied >= 1)
            {
                stack.getOrCreateTag().putInt("CustomModelData", 5);
            }
            else
            {
                stack.getOrCreateTag().putInt("CustomModelData", 1);
            }
        }
        else if(amountOfCores < 1 && amountOfUnstableModifiers >= 1)
        {
            if(amountOfUnstableModifiersApplied >= 1)
            {
                stack.getOrCreateTag().putInt("CustomModelData", 4);
            }
            else
            {
                stack.getOrCreateTag().putInt("CustomModelData", 2);
            }
        }
        else if(amountOfCores >= 1 && amountOfUnstableModifiers >= 1)
        {
            

            if(amountOfUnstableModifiersApplied >= 1 && amountOfCoresApplied >= 1)
            {
                stack.getOrCreateTag().putInt("CustomModelData", 8);
            }
            else if(amountOfUnstableModifiersApplied < 1 && amountOfCoresApplied >= 1)
            {
                stack.getOrCreateTag().putInt("CustomModelData", 7);
            }
            else if(amountOfUnstableModifiersApplied >= 1 && amountOfCoresApplied < 1)
            {
                stack.getOrCreateTag().putInt("CustomModelData", 6);
            }
            else if(amountOfUnstableModifiersApplied < 1 && amountOfCoresApplied < 1)
            {
                stack.getOrCreateTag().putInt("CustomModelData", 3);
            }
        }
    }
    
	static ITextComponent tooltipDots(int amount, TextFormatting formatting) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            text.append("\u2b22 ");
        }
        return new StringTextComponent(text.toString())
                .mergeStyle(formatting);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        getData(stack).addInformation(world, tooltip, flag);
        super.addInformation(stack, world, tooltip, flag);

        

		if(stack.getOrCreateTag().contains("CrystalCoresEngraved"))
        {
            if(stack.getOrCreateTag().getInt("CrystalCoresEngraved") > 0)
            {
                Random random = world.getRandom();
                int amountOfCores = MathHelper.nextInt(random, 0, 2);
                int amountOfUnstableModifiers = MathHelper.nextInt(random, 0, 5);
                int amountOfUnstableModifiersApplied = 0;
                int amountOfCoresApplied = 0;
                
                amountOfCores = stack.getOrCreateTag().getInt("CrystalAmountOfVoidCores");
                amountOfCoresApplied = stack.getOrCreateTag().getInt("CrystalAmountOfVoidCoresApplied");
                amountOfUnstableModifiers = stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCores");
                amountOfUnstableModifiersApplied = stack.getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied");

                ItemVaultCrystal.updateTexture(stack);

                tooltip.add(new StringTextComponent(""));

                tooltip.add(new StringTextComponent("- ")
                        .append(new StringTextComponent("Void Cores").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_A8A8A8))))
                        .append(new StringTextComponent("-")));

                if(amountOfCores > 0)
                {
                tooltip.add(new StringTextComponent("  - ").append(tooltipDots(amountOfCoresApplied, TextFormatting.DARK_PURPLE))
                    .append(tooltipDots(amountOfCores - amountOfCoresApplied, TextFormatting.GRAY))
                    .append(new StringTextComponent("-")));
                }else{
                    tooltip.add(new StringTextComponent("- ")
                    .append(new StringTextComponent("NONE").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_870B00))))
                    .append(new StringTextComponent(" -")));
                }
                



                tooltip.add(new StringTextComponent(""));

                tooltip.add(new StringTextComponent("- ")
                    .append(new StringTextComponent("Unstable Cores").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_A8A8A8))))
                    .append(new StringTextComponent(" -")));

                

                if(amountOfUnstableModifiers > 0)
                {
                    tooltip.add(new StringTextComponent("  - ").append(tooltipDots(amountOfUnstableModifiersApplied, TextFormatting.DARK_PURPLE))
                    .append(tooltipDots(amountOfUnstableModifiers - amountOfUnstableModifiersApplied, TextFormatting.GRAY))
                    .append(new StringTextComponent("-")));
                }else{
                    tooltip.add(new StringTextComponent("- ")
                    .append(new StringTextComponent("NONE").setStyle(Style.EMPTY.setColor(Color.fromInt(0xFF_870B00))))
                    .append(new StringTextComponent(" -")));
                }
            }
		}
    }

}
