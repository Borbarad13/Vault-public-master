package iskallia.vault.event;

import iskallia.vault.Vault;
import iskallia.vault.config.entry.EnchantedBookEntry;
import iskallia.vault.init.ModAttributes;
import iskallia.vault.init.ModConfigs;
import iskallia.vault.init.ModItems;
import iskallia.vault.util.VaultRarity;
import iskallia.vault.item.CrystalData;
import iskallia.vault.item.ItemVaultCrystal;
import iskallia.vault.item.ItemVoidCore;
import iskallia.vault.item.gear.VaultArmorItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.advancements.Advancement;
import iskallia.vault.item.gear.VaultGear;
import iskallia.vault.util.OverlevelEnchantHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.util.math.MathHelper;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import net.minecraftforge.common.util.Constants;
import java.time.LocalTime;
import java.lang.Math;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AnvilEvents {

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event) {
        ItemStack equipment = event.getLeft();
        ItemStack enchantedBook = event.getRight();

        if (equipment.getItem() == Items.ENCHANTED_BOOK) return;
        if (enchantedBook.getItem() != Items.ENCHANTED_BOOK) return;

        ItemStack upgradedEquipment = equipment.copy();

        Map<Enchantment, Integer> equipmentEnchantments = OverlevelEnchantHelper.getEnchantments(equipment);
        Map<Enchantment, Integer> bookEnchantments = OverlevelEnchantHelper.getEnchantments(enchantedBook);
        int overlevels = OverlevelEnchantHelper.getOverlevels(enchantedBook);
        if(event.getLeft().getItem() instanceof VaultGear<?>) {
            for (Enchantment bookEnchantment : bookEnchantments.keySet()) {
                if(bookEnchantment instanceof MendingEnchantment || bookEnchantment instanceof UnbreakingEnchantment)
                {
                    event.setOutput(ItemStack.EMPTY);
                    event.setCanceled(true);
                    return;
                }
            }
        }
        
        if (overlevels == -1) return; // No over-levels, let vanilla do its thing

        Map<Enchantment, Integer> enchantmentsToApply = new HashMap<>(equipmentEnchantments);

        for (Enchantment bookEnchantment : bookEnchantments.keySet()) {
            if (!equipmentEnchantments.containsKey(bookEnchantment)) continue;
            int currentLevel = equipmentEnchantments.getOrDefault(bookEnchantment, 0);
            int bookLevel = bookEnchantments.get(bookEnchantment);
            int nextLevel = currentLevel == bookLevel ? currentLevel + 1 : Math.max(currentLevel, bookLevel);
            enchantmentsToApply.put(bookEnchantment, nextLevel);
        }

        EnchantmentHelper.setEnchantments(enchantmentsToApply, upgradedEquipment);

        if (upgradedEquipment.equals(equipment, true)) {
            event.setCanceled(true);
        } else {
            EnchantedBookEntry bookTier = ModConfigs.OVERLEVEL_ENCHANT.getTier(overlevels);
            event.setOutput(upgradedEquipment);
            event.setCost(bookTier == null ? 1 : bookTier.getLevelNeeded());
        }
    }

    @SubscribeEvent
    public static void onUnlockCrystal(AnvilUpdateEvent event) {
        if(event.getLeft().getItem() instanceof ItemVaultCrystal && event.getRight().getItem() == ModItems.VOID_CORE) {
            ItemStack output = event.getLeft().copy();
            
            LocalTime time = java.time.LocalTime.now();

            int numOfModifiers = 27;

            Random random = new Random(time.getNano());
            Random random2 = new Random(time.getSecond());
            Random random3 = new Random(time.getNano());
            int rand = MathHelper.nextInt(random, 1, 10);
            int rand2 = MathHelper.nextInt(random2, 1, numOfModifiers);
            int rand3 = MathHelper.nextInt(random3, 1, numOfModifiers);;
            int amountOfModifiers = 0;
            boolean isNegative = false;
            

            while(rand2 == rand3)
            {
                rand3 = MathHelper.nextInt(random3, 1, numOfModifiers);
            }
            CompoundNBT nbt = event.getRight().getOrCreateTag();

            CompoundNBT nbtCrystal = event.getLeft().getOrCreateTag();


            if(nbtCrystal.getInt("CrystalAmountOfVoidCoresApplied") < nbtCrystal.getInt("CrystalAmountOfVoidCores"))
            {
                output.getOrCreateTag().putInt("CrystalAmountOfVoidCoresApplied", nbtCrystal.getInt("CrystalAmountOfVoidCoresApplied") + 1);
            }
            else
            {
                return;
            }

            if(nbt.getInt("VoidCoreAmountOfModifiers") == 0)
            {
                nbt.putInt("VoidCoreAmountOfModifiers", 1);
                amountOfModifiers = 1;

                nbt.putInt("VoidCoreModifier1", rand2);
                nbt.putInt("VoidCoreModifier2", rand3);

                if(rand2 == 1)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Silent", CrystalData.Modifier.Operation.ADD, 1.0F);
                }
                if(rand2 == 2)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Lonely", CrystalData.Modifier.Operation.ADD, 1.0F);
                }
                if(rand2 == 3)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Crowded", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers++;
                }
                if(rand2 == 4)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Easy", CrystalData.Modifier.Operation.ADD, 1.0F);
                }
                if(rand2 == 5)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Fast", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                }
                if(rand2 == 6)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Rush", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                }
                if(rand2 == 7)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Hard", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                }
                if(rand2 == 8)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Treasure", CrystalData.Modifier.Operation.ADD, 1.0F);
                }
                if(rand2 == 9)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Unlucky", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                }
                if(rand2 == 10)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Locked", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                }
                if(rand2 == 11)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Hoarder", CrystalData.Modifier.Operation.ADD, 1.0F);
                }
                if(rand2 == 12)
                {
                    //ItemVaultCrystal.getData(output).addModifier("Lazy", CrystalData.Modifier.Operation.ADD, 1.0F);
                }
                if(rand2 == 13)
                    //ItemVaultCrystal.getData(output).addModifier("Hops", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 14)
                    //ItemVaultCrystal.getData(output).addModifier("Stronk", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 15)
                    //ItemVaultCrystal.getData(output).addModifier("Godlike", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 16)
                    //ItemVaultCrystal.getData(output).addModifier("Rapidhanded", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 17)
                    //ItemVaultCrystal.getData(output).addModifier("Swiftfooted", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 18)
                    //ItemVaultCrystal.getData(output).addModifier("Crackedout", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 19)
                    //ItemVaultCrystal.getData(output).addModifier("Thick-Skinned", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 20)
                    //ItemVaultCrystal.getData(output).addModifier("Rejuvenative", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 21)
                    //ItemVaultCrystal.getData(output).addModifier("Aquatic", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 22)
                    //ItemVaultCrystal.getData(output).addModifier("Hellborn", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 23)
                    //ItemVaultCrystal.getData(output).addModifier("Dulled", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                if(rand2 == 24)
                    //ItemVaultCrystal.getData(output).addModifier("Swampbooted", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                if(rand2 == 25)
                    //ItemVaultCrystal.getData(output).addModifier("Butterfingered", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                if(rand2 == 26)
                    //ItemVaultCrystal.getData(output).addModifier("Hungry", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                if(rand2 == 27)
                    //ItemVaultCrystal.getData(output).addModifier("Chaotic", CrystalData.Modifier.Operation.ADD, 1.0F);
                    amountOfModifiers = 2;
                event.setOutput(output);
                event.setCost(1);

                // 10% chance for another modifier if first is a positive modifier
                if(rand >= 6 && amountOfModifiers <= 1)
                {
                    amountOfModifiers = 2;    
                }   
                nbt.putInt("VoidCoreAmountOfModifiers", amountOfModifiers);  
            }

            if(nbt.contains("VoidCoreAmountOfModifiers"))
                {
                    amountOfModifiers = nbt.getInt("VoidCoreAmountOfModifiers"); 
                    rand2 = nbt.getInt("VoidCoreModifier1");
                    rand3 = nbt.getInt("VoidCoreModifier2");
                }

                if(rand2 == 1)
                    ItemVaultCrystal.getData(output).addModifier("Silent", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 2)
                    ItemVaultCrystal.getData(output).addModifier("Lonely", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 3)
                    ItemVaultCrystal.getData(output).addModifier("Crowded", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 4)
                    ItemVaultCrystal.getData(output).addModifier("Easy", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 5)
                    ItemVaultCrystal.getData(output).addModifier("Fast", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 6)
                    ItemVaultCrystal.getData(output).addModifier("Rush", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 7)
                    ItemVaultCrystal.getData(output).addModifier("Hard", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 8)
                    ItemVaultCrystal.getData(output).addModifier("Treasure", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 9)
                    ItemVaultCrystal.getData(output).addModifier("Unlucky", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 10)
                    ItemVaultCrystal.getData(output).addModifier("Locked", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 11)
                    ItemVaultCrystal.getData(output).addModifier("Hoarder", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 12)
                    ItemVaultCrystal.getData(output).addModifier("Lazy", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 13)
                    ItemVaultCrystal.getData(output).addModifier("Hops", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 14)
                    ItemVaultCrystal.getData(output).addModifier("Stronk", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 15)
                    ItemVaultCrystal.getData(output).addModifier("Godlike", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 16)
                    ItemVaultCrystal.getData(output).addModifier("Rapidhanded", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 17)
                    ItemVaultCrystal.getData(output).addModifier("Swiftfooted", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 18)
                    ItemVaultCrystal.getData(output).addModifier("Crackedout", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 19)
                    ItemVaultCrystal.getData(output).addModifier("Thick-Skinned", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 20)
                    ItemVaultCrystal.getData(output).addModifier("Rejuvenative", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 21)
                    ItemVaultCrystal.getData(output).addModifier("Aquatic", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 22)
                    ItemVaultCrystal.getData(output).addModifier("Hellborn", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 23)
                    ItemVaultCrystal.getData(output).addModifier("Dulled", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 24)
                    ItemVaultCrystal.getData(output).addModifier("Swampbooted", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 25)
                    ItemVaultCrystal.getData(output).addModifier("Butterfingered", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 26)
                    ItemVaultCrystal.getData(output).addModifier("Hungry", CrystalData.Modifier.Operation.ADD, 1.0F);
                if(rand2 == 27)
                    ItemVaultCrystal.getData(output).addModifier("Chaotic", CrystalData.Modifier.Operation.ADD, 1.0F);
                
                //Hungry Butterfingered Swampbooted Dulled Hellborn Aquatic Rejuvenative Thick-Skinned Crackedout Swiftfooted Rapidhanded Godlike Stronk Hops
                if(amountOfModifiers >= 2)
                {
                    if(rand3 == 1)
                        ItemVaultCrystal.getData(output).addModifier("Silent", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 2)
                        ItemVaultCrystal.getData(output).addModifier("Lonely", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 3)
                        ItemVaultCrystal.getData(output).addModifier("Crowded", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 4)
                        ItemVaultCrystal.getData(output).addModifier("Easy", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 5)
                        ItemVaultCrystal.getData(output).addModifier("Fast", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 6)
                        ItemVaultCrystal.getData(output).addModifier("Rush", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 7)
                        ItemVaultCrystal.getData(output).addModifier("Hard", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 8)
                        ItemVaultCrystal.getData(output).addModifier("Treasure", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 9)
                        ItemVaultCrystal.getData(output).addModifier("Unlucky", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 10)
                        ItemVaultCrystal.getData(output).addModifier("Locked", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 11)
                        ItemVaultCrystal.getData(output).addModifier("Hoarder", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 12)
                        ItemVaultCrystal.getData(output).addModifier("Lazy", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 13)
                        ItemVaultCrystal.getData(output).addModifier("Hops", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 14)
                        ItemVaultCrystal.getData(output).addModifier("Stronk", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 15)
                        ItemVaultCrystal.getData(output).addModifier("Godlike", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 16)
                        ItemVaultCrystal.getData(output).addModifier("Rapidhanded", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 17)
                        ItemVaultCrystal.getData(output).addModifier("Swiftfooted", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 18)
                        ItemVaultCrystal.getData(output).addModifier("Crackedout", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 19)
                        ItemVaultCrystal.getData(output).addModifier("Thick-Skinned", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 20)
                        ItemVaultCrystal.getData(output).addModifier("Rejuvenative", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 21)
                        ItemVaultCrystal.getData(output).addModifier("Aquatic", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 22)
                        ItemVaultCrystal.getData(output).addModifier("Hellborn", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 23)
                        ItemVaultCrystal.getData(output).addModifier("Dulled", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 24)
                        ItemVaultCrystal.getData(output).addModifier("Swampbooted", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 25)
                        ItemVaultCrystal.getData(output).addModifier("Butterfingered", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 26)
                        ItemVaultCrystal.getData(output).addModifier("Hungry", CrystalData.Modifier.Operation.ADD, 1.0F);
                    if(rand3 == 27)
                        ItemVaultCrystal.getData(output).addModifier("Chaotic", CrystalData.Modifier.Operation.ADD, 1.0F);

                    
                }
                ItemVaultCrystal.updateTexture(output);
                event.setOutput(output);
                event.setCost(1);

                
            
        }
        if(event.getLeft().getItem() instanceof ItemVaultCrystal && event.getRight().getItem() == ModItems.CLEANSING_CLOTH) {
            

            ItemStack output = event.getLeft().copy();
            CompoundNBT nbt = output.getOrCreateTag();

            if(nbt.getInt("CrystalAmountOfUnstableCoresApplied") < nbt.getInt("CrystalAmountOfUnstableCores"))
            {
                nbt.putInt("CrystalAmountOfUnstableCoresApplied", nbt.getInt("CrystalAmountOfUnstableCoresApplied") + 1);
            }
            ItemVaultCrystal.updateTexture(output);

            event.setOutput(new ItemStack(event.getLeft().getItem()));
            event.setCost(3);
            
        }
        if(event.getLeft().getItem() instanceof ItemVaultCrystal && event.getRight().getItem() == ModItems.UNSTABLE_VOID_CORE) {
            
            ItemStack output = event.getLeft().copy();
            CompoundNBT nbt = output.getOrCreateTag();

            if(nbt.getInt("CrystalAmountOfUnstableCoresApplied") < nbt.getInt("CrystalAmountOfUnstableCores"))
            {
                nbt.putInt("CrystalAmountOfUnstableCoresApplied", nbt.getInt("CrystalAmountOfUnstableCoresApplied") + 1);
            }
            ItemVaultCrystal.updateTexture(output);
            event.setOutput(output);
            event.setCost(3);
        }
        if(event.getLeft().getItem() instanceof ItemVaultCrystal && event.getRight().getItem() == ModItems.CRYSTAL_ENGRAVER) {
            
            ItemStack output = event.getLeft().copy();
            CompoundNBT nbt = output.getOrCreateTag();


            if(!(output.getOrCreateTag().contains("CrystalCoresEngraved")))
            {
                VaultRarity rarity = ((ItemVaultCrystal)output.getItem()).getRarity();
                Random random = new Random();
                int amountOfCores = Math.round(MathHelper.nextInt(random, 0, 200) / 100);
                int amountOfUnstableModifiers = MathHelper.nextInt(random, 0, 3);
                int amountOfUnstableModifiersApplied = MathHelper.nextInt(random, 0, amountOfUnstableModifiers);
                int amountOfCoresApplied = 0;
                float multiplier = 1;
                if(amountOfUnstableModifiers < 1 && amountOfCores < 1)
                {
                    amountOfCores = 1;
                }
                if(event.getLeft().getItem() == ModItems.VAULT_CRYSTAL_NORMAL)
                {
                    multiplier = 0.75f;
                } else if (event.getLeft().getItem() == ModItems.VAULT_CRYSTAL_RARE)
                {
                    multiplier = 1.0f;
                } else if (event.getLeft().getItem() == ModItems.VAULT_CRYSTAL_EPIC)
                {
                    multiplier = 1.25f;
                } else if (event.getLeft().getItem() == ModItems.VAULT_CRYSTAL_OMEGA){
                    multiplier = 1.5f;
                }

                if(!(event.getRight().getOrCreateTag().contains("CrystalCoresEngraved")))
                {
                    

                    output.getOrCreateTag().putInt("CrystalAmountOfVoidCores", Math.round(amountOfCores * multiplier));
                    output.getOrCreateTag().putInt("CrystalAmountOfVoidCoresApplied", amountOfCoresApplied);
                    output.getOrCreateTag().putInt("CrystalAmountOfUnstableCores", Math.round(amountOfUnstableModifiers * multiplier));
                    output.getOrCreateTag().putInt("CrystalAmountOfUnstableCoresApplied", amountOfUnstableModifiersApplied);
                    output.getOrCreateTag().putInt("CrystalCoresEngraved", 1);

                    event.getRight().getOrCreateTag().putInt("CrystalAmountOfVoidCores", amountOfCores);
                    event.getRight().getOrCreateTag().putInt("CrystalAmountOfVoidCoresApplied", amountOfCoresApplied);
                    event.getRight().getOrCreateTag().putInt("CrystalAmountOfUnstableCores", amountOfUnstableModifiers);
                    event.getRight().getOrCreateTag().putInt("CrystalAmountOfUnstableCoresApplied", amountOfUnstableModifiersApplied);
                    event.getRight().getOrCreateTag().putInt("CrystalCoresEngraved", 1);

                    ItemVaultCrystal.updateTexture(output);
                    
                }
                else{
                    amountOfCores = event.getRight().getOrCreateTag().getInt("CrystalAmountOfVoidCores");
                    amountOfUnstableModifiers = event.getRight().getOrCreateTag().getInt("CrystalAmountOfUnstableCores");
                    amountOfUnstableModifiersApplied = event.getRight().getOrCreateTag().getInt("CrystalAmountOfUnstableCoresApplied");
                    amountOfCoresApplied = event.getRight().getOrCreateTag().getInt("CrystalAmountOfVoidCoresApplied");

                    output.getOrCreateTag().putInt("CrystalAmountOfVoidCores", Math.round(amountOfCores * multiplier));
                    output.getOrCreateTag().putInt("CrystalAmountOfVoidCoresApplied", amountOfCoresApplied);
                    output.getOrCreateTag().putInt("CrystalAmountOfUnstableCores", Math.round(amountOfUnstableModifiers * multiplier));
                    output.getOrCreateTag().putInt("CrystalAmountOfUnstableCoresApplied", amountOfUnstableModifiersApplied);
                    output.getOrCreateTag().putInt("CrystalCoresEngraved", 1);

                    ItemVaultCrystal.updateTexture(output);

                }

                
            }
            event.setOutput(output);
            event.setCost(3);
        }



       
    }
//player.sendStatusMessage(new StringTextComponent("Energy Stored: " + te.getEnergyStorage().getEnergyStored()), true);
    /////////////////////////////////////////////////// ^

    @SubscribeEvent
    public static void onApplyEtching(AnvilUpdateEvent event) {
        if(event.getLeft().getItem() instanceof VaultArmorItem && event.getRight().getItem() == ModItems.ETCHING) {
            ItemStack output = event.getLeft().copy();
            VaultGear.Set set = ModAttributes.GEAR_SET.getOrDefault(event.getRight(), VaultGear.Set.NONE).getValue(event.getRight());
            ModAttributes.GEAR_SET.create(output, set);
            event.setOutput(output);
            event.setCost(10);
        }
    }

    @SubscribeEvent
    public static void onApplyPog(AnvilUpdateEvent event) {
        if(event.getRight().getItem() == ModItems.OMEGA_POG)
        {
            ResourceLocation name = event.getLeft().getItem().getRegistryName();

            if(event.getLeft().getItem() instanceof VaultGear<?>) {
                ItemStack output = event.getLeft().copy();
                
                output.setDamage(0);
                VaultGear.addLevel(output, 1.0F);
                event.setOutput(output);
                event.setMaterialCost(1);
                event.setCost(5);
                
                // if(!event.getWorld().isRemote())
                // {
                //     ServerPlayerEntity serverPlayer = (ServerPlayerEntity) event.getPlayer();   
                //         Advancement advancement = serverPlayer.getServer().getAdvancementManager().getAdvancement(Vault.id("gear_levelup"));
                //         serverPlayer.getAdvancements()
                //                 .grantCriterion(advancement, "unlocked");
                // }
            } else if(name.getNamespace().equals(Vault.MOD_ID) && name.getPath().startsWith("artifact")) {
                event.setOutput(new ItemStack(ModItems.UNIDENTIFIED_ARTIFACT));
                event.setMaterialCost(1);
                event.setCost(10);
            }
        }
        else if(event.getRight().getItem() == ModItems.POG)
        {
            ResourceLocation name = event.getLeft().getItem().getRegistryName();

            if(event.getLeft().getItem() instanceof VaultGear<?>) {
                ItemStack output = event.getLeft().copy();

                int maxRepairs = ModAttributes.MAX_REPAIRS.getOrDefault(output, -1).getValue(output);
                int curRepairs = ModAttributes.CURRENT_REPAIRS.getOrDefault(output, 0).getValue(output);

                if(maxRepairs != -1 && curRepairs >= maxRepairs) {
                    return;
                }

                ModAttributes.CURRENT_REPAIRS.create(output, curRepairs + 1);
                output.setDamage(0);
                event.setOutput(output);
                event.setMaterialCost(1);
                event.setCost(5);
                // if(!event.getWorld().isRemote())
                // {
                //     ServerPlayerEntity serverPlayer = (ServerPlayerEntity) event.getPlayer();   
                //         Advancement advancement = serverPlayer.getServer().getAdvancementManager().getAdvancement(Vault.id("gear_repair"));
                //         serverPlayer.getAdvancements()
                //                 .grantCriterion(advancement, "unlocked");
                // }
            }
        }
    }


}
