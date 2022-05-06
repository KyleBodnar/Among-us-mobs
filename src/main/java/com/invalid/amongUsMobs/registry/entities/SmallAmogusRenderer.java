package com.invalid.amongUsMobs.registry.entities;

import com.invalid.amongUsMobs.Amogus;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class SmallAmogusRenderer extends MobEntityRenderer<SmallAmogus, SmallAmogusModel> {

    public SmallAmogusRenderer(EntityRendererFactory.Context context, SmallAmogusModel entityModel, float f) {
        super(context, newSmallAmogusModel, f);
    }

    @Override
    public Identifier getTexture(SmallAmogus entity) {
        return new Identifier(Amogus.MOD_ID, "textures/entity/smallamogus/smallamogus.png");
    }
}
