package com.invalid.amongusmobs.item;

import com.invalid.amongusmobs.sounds.SoundRegister;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.List;


public class AmogusTotem extends Item{
    private final int invisDuration = 200;
    private final int blindDuration = 300;

    public AmogusTotem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.amongusmobs.amogus_totem.tooltip").formatted(Formatting.RED) );
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getItemCooldownManager().isCoolingDown(this)) {
            user.getWorld().playSound(user, user.getBlockPos(), SoundRegister.amogusSoundEvent, SoundCategory.BLOCKS, 2f, 1f);
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, blindDuration, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, invisDuration, 0));
            user.getItemCooldownManager().set(this, 500);
        }

        return super.useOnEntity(stack, user, entity, hand);
    }

}

