package com.invalid.amongusmobs.tools;

import com.invalid.amongusmobs.Amogus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ToolRegister {
    public static ToolItem AMOGIUM_SWORD = new SwordItem(AmogiumToolMaterial.INSTANCE, 8, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerTools() {
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "amogium_sword"), AMOGIUM_SWORD);
    }
}
