package com.invalid.amongusmobs;


import com.invalid.amongusmobs.block.BlockRegister;
import com.invalid.amongusmobs.enchantments.EnchantRegister;
import com.invalid.amongusmobs.item.ItemRegister;
import com.invalid.amongusmobs.tools.ToolRegister;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;

public class Amogus implements ModInitializer {

    public static final String MOD_ID = "amongusmobs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "amongusgroup"),
            () -> new ItemStack(ItemRegister.AMOGUS_TOTEM));

    @Override
    public void onInitialize() {
        LOGGER.info("the sussy is loaded");
        GeckoLib.initialize();

        ItemRegister.registerItems();
        BlockRegister.registerBlocks();
        ToolRegister.registerTools();
        EnchantRegister.registerEnchants();

    }
}
