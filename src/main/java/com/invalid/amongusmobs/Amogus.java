package com.invalid.amongusmobs;


import com.invalid.amongusmobs.item.ItemRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
public class Amogus implements ModInitializer {

    public static final String MOD_ID = "amongusmobs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("the sussy is loaded");
        ItemRegister.registerItems();
    }
}
