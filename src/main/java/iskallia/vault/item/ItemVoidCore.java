package iskallia.vault.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import java.util.Random;

import iskallia.vault.world.raid.modifier.VaultModifiers;
import iskallia.vault.item.CrystalData;
import iskallia.vault.Vault;
import iskallia.vault.util.MathUtilities;
import iskallia.vault.world.data.VaultRaidData;
import iskallia.vault.world.raid.VaultRaid;
import iskallia.vault.init.ModConfigs;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import javax.annotation.Nullable;
import java.util.List;
import java.time.LocalTime;

public class ItemVoidCore extends Item {

    private int selectedModifier;

    public ItemVoidCore(ItemGroup group, ResourceLocation id) {
        super(new Properties()
                .group(group)
                .maxStackSize(1));

        this.setRegistryName(id);

        //Random random = new Random();
        //int rand = MathHelper.nextInt(random, 1, 11);
        //this.getOrCreateChildTag("selectedModifier");
        //this.getOrCreateTag().put("selectedModifier",rand);
        this.selectedModifier = 0;
    }

    public int getSelectedModifier() {
        return this.selectedModifier;

        
    }

    public void setSelectedModifier(int modifier) {
        this.selectedModifier = modifier;

        
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        
        int modifierTag;
        int modifierTag1;
        int modifierTag2;
        StringTextComponent coreData = new StringTextComponent("");;
        
        if(stack.hasTag())
        {
            if(stack.getTag().contains("VoidCoreAmountOfModifiers"))
            {
                
                modifierTag = stack.getTag().getInt("VoidCoreAmountOfModifiers");
                modifierTag1 = stack.getTag().getInt("VoidCoreModifier1");
                modifierTag2 = stack.getTag().getInt("VoidCoreModifier2");


                if(modifierTag1 == 1)
                    {coreData = new StringTextComponent("- Silent");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Silent").getColor()))));}
                if(modifierTag1 == 2)
                    {coreData = new StringTextComponent("- Lonely");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Lonely").getColor()))));}
                if(modifierTag1 == 3)
                    {coreData = new StringTextComponent("- Crowded");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Crowded").getColor()))));}
                if(modifierTag1 == 4)
                    {coreData = new StringTextComponent("- Easy");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Easy").getColor()))));}
                if(modifierTag1 == 5)
                    {coreData = new StringTextComponent("- Fast");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Fast").getColor()))));}
                if(modifierTag1 == 6)
                    {coreData = new StringTextComponent("- Rush");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Rush").getColor()))));}
                if(modifierTag1 == 7)
                    {coreData = new StringTextComponent("- Hard");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hard").getColor()))));}
                if(modifierTag1 == 8)
                    {coreData = new StringTextComponent("- Treasure");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Treasure").getColor()))));}
                if(modifierTag1 == 9)
                    {coreData = new StringTextComponent("- Unlucky");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Unlucky").getColor()))));}
                if(modifierTag1 == 10)
                    {coreData = new StringTextComponent("- Locked");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Locked").getColor()))));}
                if(modifierTag1 == 11)
                    {coreData = new StringTextComponent("- Hoarder");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hoarder").getColor()))));}
                if(modifierTag1 == 12)
                    {coreData = new StringTextComponent("- Lazy");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Lazy").getColor()))));}
                if(modifierTag1 == 13)
                    {coreData = new StringTextComponent("- Hops");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hops").getColor()))));}
                if(modifierTag1 == 14)
                    {coreData = new StringTextComponent("- Stronk");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Stronk").getColor()))));}
                if(modifierTag1 == 15)
                    {coreData = new StringTextComponent("- Godlike");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Godlike").getColor()))));}
                if(modifierTag1 == 16)
                    {coreData = new StringTextComponent("- Rapidhanded");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Rapidhanded").getColor()))));
                    }
                if(modifierTag1 == 17)
                    {coreData = new StringTextComponent("- Swiftfooted");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Swiftfooted").getColor()))));}
                if(modifierTag1 == 18)
                    {coreData = new StringTextComponent("- Crackedout");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Crackedout").getColor()))));}
                if(modifierTag1 == 19)
                    {coreData = new StringTextComponent("- Thick-Skinned");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Thick-Skinned").getColor()))));}
                if(modifierTag1 == 20)
                    {coreData = new StringTextComponent("- Rejuvenative");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Rejuvenative").getColor()))));}
                if(modifierTag1 == 21)
                    {coreData = new StringTextComponent("- Aquatic");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Aquatic").getColor()))));}
                if(modifierTag1 == 22)
                    {coreData = new StringTextComponent("- Hellborn");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hellborn").getColor()))));}
                if(modifierTag1 == 23)
                    {coreData = new StringTextComponent("- Dulled");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Dulled").getColor()))));}
                if(modifierTag1 == 24)
                    {coreData = new StringTextComponent("- Swampbooted");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Swampbooted").getColor()))));}
                if(modifierTag1 == 25)
                    {coreData = new StringTextComponent("- Butterfingered");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Butterfingered").getColor()))));}
                if(modifierTag1 == 26)
                    {coreData = new StringTextComponent("- Hungry");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hungry").getColor()))));}
                if(modifierTag1 == 27)
                    {coreData = new StringTextComponent("- Chaotic");
                    tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Chaotic").getColor()))));}


                    //             
                if(modifierTag >=2)
                {
                    if(modifierTag2 == 1)
                        {coreData = new StringTextComponent("- Silent");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Silent").getColor()))));}
                    if(modifierTag2 == 2)
                        {coreData = new StringTextComponent("- Lonely");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Lonely").getColor()))));}
                    if(modifierTag2 == 3)
                        {coreData = new StringTextComponent("- Crowded");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Crowded").getColor()))));}
                    if(modifierTag2 == 4)
                        {coreData = new StringTextComponent("- Easy");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Easy").getColor()))));}
                    if(modifierTag2 == 5)
                        {coreData = new StringTextComponent("- Fast");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Fast").getColor()))));}
                    if(modifierTag2 == 6)
                        {coreData = new StringTextComponent("- Rush");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Rush").getColor()))));}
                    if(modifierTag2 == 7)
                        {coreData = new StringTextComponent("- Hard");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hard").getColor()))));}
                    if(modifierTag2 == 8)
                        {coreData = new StringTextComponent("- Treasure");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Treasure").getColor()))));}
                    if(modifierTag2 == 9)
                        {coreData = new StringTextComponent("- Unlucky");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Unlucky").getColor()))));}
                    if(modifierTag2 == 10)
                        {coreData = new StringTextComponent("- Locked");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Locked").getColor()))));}
                    if(modifierTag2 == 11)
                        {coreData = new StringTextComponent("- Hoarder");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hoarder").getColor()))));}
                    if(modifierTag2 == 12)
                        {coreData = new StringTextComponent("- Lazy");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Lazy").getColor()))));}
                    if(modifierTag2 == 13)
                        {coreData = new StringTextComponent("- Hops");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hops").getColor()))));}
                    if(modifierTag2 == 14)
                        {coreData = new StringTextComponent("- Stronk");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Stronk").getColor()))));}
                    if(modifierTag2 == 15)
                        {coreData = new StringTextComponent("- Godlike");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Godlike").getColor()))));}
                    if(modifierTag2 == 16)
                        {coreData = new StringTextComponent("- Rapidhanded");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Rapidhanded").getColor()))));
                        }
                    if(modifierTag2 == 17)
                        {coreData = new StringTextComponent("- Swiftfooted");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Swiftfooted").getColor()))));}
                    if(modifierTag2 == 18)
                        {coreData = new StringTextComponent("- Crackedout");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Crackedout").getColor()))));}
                    if(modifierTag2 == 19)
                        {coreData = new StringTextComponent("- Thick-Skinned");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Thick-Skinned").getColor()))));}
                    if(modifierTag2 == 20)
                        {coreData = new StringTextComponent("- Rejuvenative");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Rejuvenative").getColor()))));}
                    if(modifierTag2 == 21)
                        {coreData = new StringTextComponent("- Aquatic");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Aquatic").getColor()))));}
                    if(modifierTag2 == 22)
                        {coreData = new StringTextComponent("- Hellborn");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hellborn").getColor()))));}
                    if(modifierTag2 == 23)
                        {coreData = new StringTextComponent("- Dulled");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Dulled").getColor()))));}
                    if(modifierTag2 == 24)
                        {coreData = new StringTextComponent("- Swampbooted");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Swampbooted").getColor()))));}
                    if(modifierTag2 == 25)
                        {coreData = new StringTextComponent("- Butterfingered");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Butterfingered").getColor()))));}
                    if(modifierTag2 == 26)
                        {coreData = new StringTextComponent("- Hungry");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Hungry").getColor()))));}
                    if(modifierTag2 == 27)
                        {coreData = new StringTextComponent("- Chaotic");
                        tooltip.add(coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(ModConfigs.VAULT_MODIFIERS.getByName("Chaotic").getColor()))));}
                }

            }
        }
        else
        {
            coreData = new StringTextComponent("- Add to an anvil to generate modifier");
            tooltip.add(coreData.mergeStyle(TextFormatting.GOLD));

            //coreData.setStyle(Style.EMPTY.setColor(Color.fromInt(0x00_FF0000)).setItalic(true));
    
            StringTextComponent comp = new StringTextComponent("[!] Add to a Vault Crystal for a random modifier [!]");
            comp.setStyle(Style.EMPTY.setColor(Color.fromInt(0x00_FF0000)).setItalic(true));
            tooltip.add(comp);
        }

        
        tooltip.add(new StringTextComponent(""));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
    

    

}
