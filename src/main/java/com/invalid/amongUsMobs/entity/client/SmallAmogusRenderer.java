package com.invalid.amongUsMobs.entity.client;

import com.invalid.amongUsMobs.entity.smallAmogus.SmallAmogusEntity;
import com.invalid.amongUsMobs.entity.smallAmogus.SmallAmogusModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SmallAmogusRenderer extends GeoEntityRenderer<SmallAmogusEntity> {
    public SmallAmogusRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SmallAmogusModel());
    }

}
