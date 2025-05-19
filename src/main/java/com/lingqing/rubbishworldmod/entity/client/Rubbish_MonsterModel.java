package com.lingqing.rubbishworldmod.entity.client;

import com.lingqing.rubbishworldmod.entity.custom.Rubbish_MonsterEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Rubbish_MonsterModel<T extends Rubbish_MonsterEntity>extends SinglePartEntityModel<T> {
	private final ModelPart rubbish_monster;
	private final ModelPart left_front_leg;
	private final ModelPart right_front_leg;
	private final ModelPart left_back_leg;
	private final ModelPart right_back_leg;
	private final ModelPart head;
	private final ModelPart body;
	public Rubbish_MonsterModel(ModelPart root) {
		this.rubbish_monster = root.getChild("rubbish_monster");
		this.left_front_leg = this.rubbish_monster.getChild("left_front_leg");
		this.right_front_leg = this.rubbish_monster.getChild("right_front_leg");
		this.left_back_leg = this.rubbish_monster.getChild("left_back_leg");
		this.right_back_leg = this.rubbish_monster.getChild("right_back_leg");
		this.head = this.rubbish_monster.getChild("head");
		this.body = this.rubbish_monster.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData rubbish_monster = modelPartData.addChild("rubbish_monster", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData left_front_leg = rubbish_monster.addChild("left_front_leg", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, -3.0F, -4.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_front_leg = rubbish_monster.addChild("right_front_leg", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, -4.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_back_leg = rubbish_monster.addChild("left_back_leg", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, -3.0F, 3.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_back_leg = rubbish_monster.addChild("right_back_leg", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, 3.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = rubbish_monster.addChild("head", ModelPartBuilder.create().uv(-3, -2).cuboid(-2.0F, -11.0F, -7.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = rubbish_monster.addChild("body", ModelPartBuilder.create().uv(-9, -7).cuboid(-3.0F, -7.0F, -4.0F, 6.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Rubbish_MonsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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