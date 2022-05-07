package com.invalid.amongusmobs.item;

import com.invalid.amongusmobs.Amogus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {
    public static final Item KEYCARD = new Item(new FabricItemSettings().group(ItemGroup.TOOLS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "keycard"), KEYCARD);
    }
}
