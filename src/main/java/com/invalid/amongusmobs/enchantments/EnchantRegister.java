package com.invalid.amongusmobs.enchantments;

import com.invalid.amongusmobs.Amogus;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class EnchantRegister {
    public static Enchantment ACTIVATED = new ActivatedEnchantment(Enchantment.Rarity.COMMON, null, null);

    public static void registerEnchants() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(Amogus.MOD_ID, "enchantment_activated"), ACTIVATED);
    }
}
