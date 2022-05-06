package com.invalid.amongUsMobs.registry.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class SmallAmogus extends PathAwareEntity {
    public SmallAmogus(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
