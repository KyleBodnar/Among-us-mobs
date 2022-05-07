package com.invalid.amongUsMobs;

import com.invalid.amongUsMobs.entity.EntityRegister;
import com.invalid.amongUsMobs.entity.client.SmallAmogusRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class AmogusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityRegister.SMALL_AMOGUS, SmallAmogusRenderer::new);
    }
}
