package com.invalid.amongusmobs.entity.smallAmogus;

import com.invalid.amongusmobs.Amogus;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SmallAmogusModel extends AnimatedGeoModel<SmallAmogusEntity> {
    public static final String textureLocation = "";

    @Override
    public Identifier getModelLocation(SmallAmogusEntity object) {
        return new Identifier(Amogus.MOD_ID, "");
    }

    @Override
    public Identifier getTextureLocation(SmallAmogusEntity object) {
        return new Identifier(Amogus.MOD_ID, textureLocation);
    }

    @Override
    public Identifier getAnimationFileLocation(SmallAmogusEntity animatable) {
        return new Identifier(Amogus.MOD_ID, "");
    }
}
