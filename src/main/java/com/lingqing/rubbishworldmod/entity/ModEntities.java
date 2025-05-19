package com.lingqing.rubbishworldmod.entity;

import com.lingqing.rubbishworldmod.RubbishWorldMod;
import com.lingqing.rubbishworldmod.entity.custom.Rubbish_MonsterEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<Rubbish_MonsterEntity> RUBBISH_MONSTER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RubbishWorldMod.MOD_ID,"rubbish_monster"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,Rubbish_MonsterEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,1f)).build());
}
