package com.invalid.amongusmobs.block;

import com.invalid.amongusmobs.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class KeycardReader extends Block {
   public static final BooleanProperty ACTIVE = BooleanProperty.of("active");
    public KeycardReader(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(ACTIVE, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
        super.appendProperties(builder);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        ItemStack stackInHand = player.getStackInHand(Hand.MAIN_HAND);
        if (hand == Hand.MAIN_HAND && !world.isClient() && !stackInHand.getEnchantments().isEmpty() && stackInHand.getItem().equals(ItemRegister.KEYCARD)) {
            world.setBlockState(pos, state.with(ACTIVE, true), Block.NOTIFY_ALL);
         }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
