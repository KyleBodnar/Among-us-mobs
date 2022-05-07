package com.invalid.amongusmobs.item;

import com.invalid.amongusmobs.Amogus;
import com.invalid.amongusmobs.block.BlockRegister;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemRegister {
    public static final Item KEYCARD = new Keycard(new FabricItemSettings().group(Amogus.ITEM_GROUP));
    public static final AmogusTotem AMOGUS_TOTEM = new AmogusTotem(new FabricItemSettings().group(Amogus.ITEM_GROUP).fireproof().rarity(Rarity.EPIC));
    public static final Item AMOGIUM_RAW = new Item(new FabricItemSettings().group(Amogus.ITEM_GROUP));
    public static final Item AMOGIUM_INGOT = new Item(new FabricItemSettings().group(Amogus.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "keycard"), KEYCARD);
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "amogium_ore"), new BlockItem(BlockRegister.AMOGIUM_ORE,
                new FabricItemSettings().group(Amogus.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "amogium_block"), new BlockItem(BlockRegister.AMOGIUM_BLOCK,
                new FabricItemSettings().group(Amogus.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "amogus_totem"), AMOGUS_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "amogium_raw"), AMOGIUM_RAW);
        Registry.register(Registry.ITEM, new Identifier(Amogus.MOD_ID, "amogium_ingot"), AMOGIUM_INGOT);

    }
}
