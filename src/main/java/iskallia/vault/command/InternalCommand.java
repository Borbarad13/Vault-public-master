package iskallia.vault.command;

import iskallia.vault.util.*;
import iskallia.vault.*;
import iskallia.vault.init.ModItems;
import iskallia.vault.item.ItemGiftBomb;
import iskallia.vault.item.ItemTraderCore;
import iskallia.vault.item.ItemTraderCore.CoreType;
import net.minecraft.item.ItemStack;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.*;
import net.minecraft.command.arguments.*;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import iskallia.vault.util.EntityHelper;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.*;

import iskallia.vault.Vault;
import iskallia.vault.item.*;
import iskallia.vault.item.gear.*;
import iskallia.vault.util.VaultRarity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.*;

import net.minecraft.nbt.CompoundNBT;

import static net.minecraft.command.Commands.argument;
import static net.minecraft.command.Commands.literal;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class InternalCommand extends Command {

    @Override
    public String getName() {
        return "internal";
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 2;
    }
    
    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) { 
        builder
        
        .then(literal("received_donation")
            .then(argument("donator", MessageArgument.message())
                .then(argument("amount", IntegerArgumentType.integer(0,10000 - 1)))
                    .executes(ctx -> giveDonation(ctx, MessageArgument.getMessage(ctx, "donator").getString()))))
        .then(literal("received_bit_donation")
            .then(argument("donator", MessageArgument.message())
                .then(argument("amount", IntegerArgumentType.integer(0,10000 - 1)))
                    .executes(ctx -> giveBits(ctx, MessageArgument.getMessage(ctx, "donator").getString()))))
        .then(literal("received_sub")
            .then(argument("donator", MessageArgument.message())
                .then(argument("amount", IntegerArgumentType.integer(0,10000 - 1)))
                    .executes(ctx -> giveSub(ctx, MessageArgument.getMessage(ctx, "donator").getString()))))
        .then(literal("received_sub_gift")
            .then(argument("donator", MessageArgument.message())
                    .then(argument("amount", IntegerArgumentType.integer(0,10000 - 1)))
                        .executes(ctx -> giveSubGift(ctx, MessageArgument.getMessage(ctx, "donator").getString()))))
        .build();
    }


    
    private int giveDonation(CommandContext<CommandSource> context, String donator) throws CommandSyntaxException {
        String mystring = donator;
        String arr[] = mystring.split(" ", 2);

        String donatorAmount = arr[0];   //the
        String donatorName = arr[1];     //quick brown fox
        ItemStack traderCore;
        if (Integer.valueOf(arr[0]) < 20)
            traderCore = ItemTraderCore.generate(donatorName, 1, false, CoreType.COMMON);
        else
            traderCore = ItemTraderCore.generate(donatorName, 1, true, CoreType.COMMON);

        
        EntityHelper.giveItem(context.getSource().asPlayer(), traderCore);
        return 0;
    }

    private int giveBits(CommandContext<CommandSource> context, String donator) throws CommandSyntaxException {
        String mystring = donator;
        String arr[] = mystring.split(" ", 2);

        String donatorAmount = arr[0];   //the
        String donatorName = arr[1];     //quick brown fox
        ItemStack itemGiven;
        if (Integer.valueOf(arr[0]) >= 1000)
            itemGiven = ItemTraderCore.generate(donatorName, 1, false, CoreType.COMMON);
        else
            itemGiven = new ItemStack(ModItems.MYSTERY_BOX, 1);

        
        EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
        return 0;
    }

    private int giveSubGift(CommandContext<CommandSource> context, String donator) throws CommandSyntaxException {
        String mystring = donator;
        String arr[] = mystring.split(" ", 2);

        String donatorAmount = arr[0];   //the
        String donatorName = arr[1];     //quick brown fox
        ItemStack itemGiven;
        if (Integer.valueOf(arr[0]) >= 20)
        {
            itemGiven = new ItemStack(ModItems.PANDORAS_BOX, 4);
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            itemGiven = new ItemStack(new ItemGiftBomb(ModItems.VAULT_MOD_GROUP, ItemGiftBomb.Variant.MEGA, Vault.id("gift_bomb_mega")));
            CompoundNBT nbt = Optional.ofNullable(itemGiven.getTag()).orElse(new CompoundNBT());
            nbt.putString("Gifter", arr[1]);
            nbt.putInt("GiftedSubs", Integer.valueOf(arr[0]));
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);            
            return 0;
        }
        else if (Integer.valueOf(arr[0]) >= 15)
        {
            itemGiven = new ItemStack(ModItems.PANDORAS_BOX, 2);
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            itemGiven = new ItemStack(new ItemGiftBomb(ModItems.VAULT_MOD_GROUP, ItemGiftBomb.Variant.MEGA, Vault.id("gift_bomb_mega")));
            CompoundNBT nbt = Optional.ofNullable(itemGiven.getTag()).orElse(new CompoundNBT());
            nbt.putString("Gifter", arr[1]);
            nbt.putInt("GiftedSubs", Integer.valueOf(arr[0]));
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            return 0;
        }
        else if (Integer.valueOf(arr[0]) >= 10)
        {
            itemGiven = new ItemStack(ModItems.PANDORAS_BOX, 1);
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            itemGiven = new ItemStack(new ItemGiftBomb(ModItems.VAULT_MOD_GROUP, ItemGiftBomb.Variant.MEGA, Vault.id("gift_bomb_mega")));
            CompoundNBT nbt = Optional.ofNullable(itemGiven.getTag()).orElse(new CompoundNBT());
            nbt.putString("Gifter", arr[1]);
            nbt.putInt("GiftedSubs", Integer.valueOf(arr[0]));
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            return 0;
        }
        else if (Integer.valueOf(arr[0]) >= 5)
        {
            itemGiven = new ItemStack(ModItems.MYSTERY_BOX, 4);
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            itemGiven = new ItemStack(new ItemGiftBomb(ModItems.VAULT_MOD_GROUP, ItemGiftBomb.Variant.MEGA, Vault.id("gift_bomb_mega")));
            CompoundNBT nbt = Optional.ofNullable(itemGiven.getTag()).orElse(new CompoundNBT());
            nbt.putString("Gifter", arr[1]);
            nbt.putInt("GiftedSubs", Integer.valueOf(arr[0]));
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            return 0;
        }
        
        else if (Integer.valueOf(arr[0]) < 5)
        {
            itemGiven = new ItemStack(ModItems.MYSTERY_BOX, 1);
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            itemGiven = new ItemStack(new ItemGiftBomb(ModItems.VAULT_MOD_GROUP, ItemGiftBomb.Variant.MEGA, Vault.id("gift_bomb_mega")));
            CompoundNBT nbt = Optional.ofNullable(itemGiven.getTag()).orElse(new CompoundNBT());
            nbt.putString("Gifter", arr[1]);
            nbt.putInt("GiftedSubs", Integer.valueOf(arr[0]));
            EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);
            return 0;
        }

        
        return 0;
    }

    private int giveSub(CommandContext<CommandSource> context, String donator) throws CommandSyntaxException {
        String mystring = donator;
        String arr[] = mystring.split(" ", 2);

        String donatorAmount = arr[0];   //the
        String donatorName = arr[1];     //quick brown fox
        ItemStack itemGiven = new ItemStack(ModItems.MYSTERY_BOX, Integer.valueOf(arr[0]));

        EntityHelper.giveItem(context.getSource().asPlayer(), itemGiven);

        ItemStack traderCore = ItemTraderCore.generate(donatorName, 1, false, CoreType.COMMON);
        EntityHelper.giveItem(context.getSource().asPlayer(), traderCore);
        return 0;
    }


    @Override
    public boolean isDedicatedServerOnly() {
        return false;
    }

}
