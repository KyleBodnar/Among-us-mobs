package com.invalid.amongusmobs.block;

import com.invalid.amongusmobs.enchantments.EnchantRegister;
import com.invalid.amongusmobs.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AmogiumBlock extends Block {
    public AmogiumBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stackInHand = player.getStackInHand(Hand.MAIN_HAND);

        if (hand == Hand.MAIN_HAND && stackInHand.getEnchantments().isEmpty() && stackInHand.getItem().equals(ItemRegister.KEYCARD)) {
            stackInHand.addEnchantment(EnchantRegister.ACTIVATED, 1);
            if(!world.isClient()) {
                player.sendMessage(new LiteralText("The keycard has been activated"), false);
            }
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }
}
