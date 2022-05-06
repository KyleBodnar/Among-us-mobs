package com.invalid.amongUsMobs.registry;

import com.invalid.amongUsMobs.registry.entities.SmallAmogus;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegistry {

    public static void registerEntities() {
        EntityType<SmallAmogus> SMALL_AMOGUS = Registry.register(
                Registry.ENTITY_TYPE,
                new Identifier("entitytesting", "cube"),
                FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SmallAmogus::new).dimensions(EntityDimensions.fixed(0.75f, 1f)).build());

        FabricDefaultAttributeRegistry.register(SMALL_AMOGUS, SmallAmogus.createMobAttributes());

    }
}
