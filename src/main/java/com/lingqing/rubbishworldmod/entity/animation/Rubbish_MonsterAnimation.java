package com.lingqing.rubbishworldmod.entity.animation;// Save this class in your mod and generate all required imports


import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class Rubbish_MonsterAnimation {
	public static final Animation ATTACK = Animation.Builder.create(0.75f)
			.addBoneAnimation("leg",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("body",
					new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("body",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("body",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("bottom",
					new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("bottom",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("bottom",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("top",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("head",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.33333f, AnimationHelper.createRotationalVector(-52.5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.33333f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("up",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.16667f, AnimationHelper.createRotationalVector(17.5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.33333f, AnimationHelper.createRotationalVector(35f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(35f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();
	public static final Animation WALK = Animation.Builder.create(0.75f).looping()
			.addBoneAnimation("head",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("up",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("left",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.20833f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.54167f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("right",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.20833f, AnimationHelper.createRotationalVector(25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.54167f, AnimationHelper.createRotationalVector(-25f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("right2",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(15f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("left2",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();
	public static final Animation STANDBY = Animation.Builder.create(0.75f).looping()
			.addBoneAnimation("up",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.375f, AnimationHelper.createRotationalVector(-2.5f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();
}
