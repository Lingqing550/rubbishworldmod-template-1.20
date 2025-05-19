package com.lingqing.rubbishworldmod.entity.client;

import com.lingqing.rubbishworldmod.RubbishWorldMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer RUBBISH_MONSTER =
            new EntityModelLayer(new Identifier(RubbishWorldMod.MOD_ID,"rubbish_monster"),"main");
}
