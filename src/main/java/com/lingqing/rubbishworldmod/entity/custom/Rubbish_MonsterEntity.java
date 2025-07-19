package com.lingqing.rubbishworldmod.entity.custom;

import com.lingqing.rubbishworldmod.entity.ai.Rubbish_MonsterAttackGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class Rubbish_MonsterEntity extends HostileEntity {
    public Rubbish_MonsterEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    private static final TrackedData<Boolean> ATTACKING=
            DataTracker.registerData(Rubbish_MonsterEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public final AnimationState idleAnimationState=new AnimationState();

    public int idleAnimationTimeOut =0;

    public final AnimationState attackAnimationState=new AnimationState();

    public int attackAnimationTimeOut =0;

    private void setUpAnimationState(){
        if (this.idleAnimationTimeOut<=0){
            this.idleAnimationTimeOut=this.random.nextInt(40)+80;
            this.idleAnimationState.start(this.age);
        }else {
            --this.idleAnimationTimeOut;
        }
        if(this.isAttacking()&&this.attackAnimationTimeOut<=0){
            attackAnimationTimeOut=20;
            attackAnimationState.start(this.age);
        }else {
            --this.attackAnimationTimeOut;
        }
        if (!this.isAttacking()){
            attackAnimationState.stop();
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            setUpAnimationState();
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f,1.0f) :0.0f;
        this.limbAnimator.updateLimbs(f,0.2f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0,new SwimGoal(this));
        this.goalSelector.add(3,new MeleeAttackGoal(this,1.2D,false));
        this.goalSelector.add(4,new WanderAroundGoal(this,0.8D));
        this.goalSelector.add(5,new LookAtEntityGoal(this, PlayerEntity.class,0.8F));

        this.goalSelector.add(2,new Rubbish_MonsterAttackGoal(this, 1D,true));
        this.targetSelector.add(1,new ActiveTargetGoal<>(this, PlayerEntity.class,true));
            }
            public static DefaultAttributeContainer.Builder createRubbish_MonsterAttributes(){
                return MobEntity.createMobAttributes()
                        .add(EntityAttributes.GENERIC_MAX_HEALTH,10.0)
                        .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.2)
                        .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,3.0);
            }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING,false);
    }

    @Override
    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING,attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }
}
