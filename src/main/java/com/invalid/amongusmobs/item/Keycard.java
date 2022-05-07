package com.invalid.amongusmobs.item;

import com.invalid.amongusmobs.Amogus;
import com.invalid.amongusmobs.block.BlockRegister;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

import java.security.Key;

public class Keycard extends Item {
    public Keycard(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
        PlayerEntity player = context.getPlayer();
        ItemStack playerMainHand = player.getStackInHand(Hand.MAIN_HAND);


        // activate keycard
        if (block.equals(BlockRegister.AMOGIUM_BLOCK) && playerMainHand.getItem().equals(ItemRegister.KEYCARD) && playerMainHand.getEnchantments().isEmpty()) {

            playerMainHand.addEnchantment(Enchantment.byRawId(-1), 1);
            player.sendMessage(new LiteralText("Keycard Activated"), false);

        }

        return super.useOnBlock(context);
    }


}
