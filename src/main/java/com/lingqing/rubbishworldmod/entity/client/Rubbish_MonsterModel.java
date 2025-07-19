// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.lingqing.rubbishworldmod.entity.client;

import com.lingqing.rubbishworldmod.entity.animation.Rubbish_MonsterAnimation;
import com.lingqing.rubbishworldmod.entity.custom.Rubbish_MonsterEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class Rubbish_MonsterModel<T extends Rubbish_MonsterEntity>extends SinglePartEntityModel<T> {
	private final ModelPart rubbish_monster;
	public Rubbish_MonsterModel(ModelPart root) {
		this.rubbish_monster = root.getChild("rubbish_monster");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData rubbish_monster = modelPartData.addChild("rubbish_monster", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leg = rubbish_monster.addChild("leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

		ModelPartData left = leg.addChild("left", ModelPartBuilder.create().uv(30, 0).cuboid(1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right = leg.addChild("right", ModelPartBuilder.create().uv(20, 31).cuboid(-3.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData up = rubbish_monster.addChild("up", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

		ModelPartData body = up.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData bottom = body.addChild("bottom", ModelPartBuilder.create().uv(0, 19).cuboid(0.0F, -4.0F, -4.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 3.0F, 1.0F));

		ModelPartData senter = body.addChild("senter", ModelPartBuilder.create().uv(0, 27).cuboid(0.0F, -9.0F, 0.0F, 4.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 28).cuboid(0.0F, -9.0F, -5.0F, 4.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 19).cuboid(4.0F, -9.0F, -4.0F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-1.0F, -9.0F, -4.0F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 3.0F, 1.0F));

		ModelPartData top = up.addChild("top", ModelPartBuilder.create().uv(20, 9).cuboid(-3.0F, -3.0F, 2.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-3.0F, -3.0F, -4.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-4.0F, -3.0F, -3.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(16, 12).cuboid(2.0F, -3.0F, -3.0F, 2.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

		ModelPartData head = up.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -1.0F, -6.0F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 7).cuboid(-3.0F, -1.0F, -5.0F, 6.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(30, 5).cuboid(-1.0F, -2.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 3.0F));

		ModelPartData arm = up.addChild("arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

		ModelPartData left2 = arm.addChild("left2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = left2.addChild("cube_r1", ModelPartBuilder.create().uv(26, 19).cuboid(-1.0F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		ModelPartData right2 = arm.addChild("right2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = right2.addChild("cube_r2", ModelPartBuilder.create().uv(26, 25).cuboid(-1.0F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Rubbish_MonsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(Rubbish_MonsterAnimation.WALK,limbSwing,limbSwingAmount,2f,2.5f);
		this.updateAnimation(entity.idleAnimationState,Rubbish_MonsterAnimation.STANDBY,ageInTicks,1f);
		this.updateAnimation(entity.attackAnimationState,Rubbish_MonsterAnimation.ATTACK,ageInTicks,1f);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		rubbish_monster.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return this.rubbish_monster;
	}
}