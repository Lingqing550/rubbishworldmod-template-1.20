package com.lingqing.rubbishworldmod;

import com.lingqing.rubbishworldmod.entity.ModEntities;
import com.lingqing.rubbishworldmod.entity.client.ModModelLayers;
import com.lingqing.rubbishworldmod.entity.client.Rubbish_MonsterModel;
import com.lingqing.rubbishworldmod.entity.client.Rubbish_MonsterRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RubbishWorldModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {


        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.RUBBISH_MONSTER, Rubbish_MonsterModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.RUBBISH_MONSTER, Rubbish_MonsterRenderer::new);
    }
}
