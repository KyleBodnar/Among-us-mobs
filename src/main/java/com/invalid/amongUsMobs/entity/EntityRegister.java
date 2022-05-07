package com.invalid.amongUsMobs.entity;

import com.invalid.amongUsMobs.Amogus;
import com.invalid.amongUsMobs.entity.smallAmogus.SmallAmogusEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class EntityRegister {
    public static final EntityType<SmallAmogusEntity> SMALL_AMOGUS = Registry.register(Registry.ENTITY_TYPE, new Identifier(Amogus.MOD_ID, "smallamogus"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SmallAmogusEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());
}
