package com.invalid.amongusmobs.block;

import com.invalid.amongusmobs.Amogus;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegister {
    public static final Block AMOGIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));
    public static final Block AMOGIUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).luminance(8).strength(4.0f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Amogus.MOD_ID, "amogium_ore"), AMOGIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Amogus.MOD_ID, "amogium_block"), AMOGIUM_BLOCK);
    }
}
