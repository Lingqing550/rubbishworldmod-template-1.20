package com.lingqing.rubbishworldmod.entity.client;

import com.lingqing.rubbishworldmod.RubbishWorldMod;
import com.lingqing.rubbishworldmod.entity.custom.Rubbish_MonsterEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class Rubbish_MonsterRenderer extends MobEntityRenderer<Rubbish_MonsterEntity,Rubbish_MonsterModel<Rubbish_MonsterEntity>> {

    private static final Identifier TEXTURE =new Identifier(RubbishWorldMod.MOD_ID,"textures/entity/rubbish_monster.png");

    public Rubbish_MonsterRenderer(EntityRendererFactory.Context context) {
        super(context,new Rubbish_MonsterModel<>(context.getPart(ModModelLayers.RUBBISH_MONSTER)),0.5f);
    }

    @Override
    public Identifier getTexture(Rubbish_MonsterEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(Rubbish_MonsterEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if (mobEntity.isBaby()){
            matrixStack.scale(0.5f,0.5f,0.5f);
        }else {
            matrixStack.scale(1.5f,1.5f,1.5f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
