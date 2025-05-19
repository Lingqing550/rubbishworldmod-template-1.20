package com.lingqing.rubbishworldmod.block;

import com.lingqing.rubbishworldmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class Essence_WheatCropBlock extends CropBlock {

    public static final int MAX_AGE=7;

    public static final IntProperty AGE=Properties.AGE_7;

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override // 绑定种子物品（需先在ModItems中注册）
    protected ItemConvertible getSeedsItem() {
        return ModItems.ESSENCE_WHEAT_SEEDS;
    }

    @Override // 最大生长阶段（比如 age=7 表示共8个阶段）
    public int getMaxAge() {

        return MAX_AGE;
    }

//    @Override
//    protected int getGrowthAmount(World world) {
//        // 原版默认返回 2-5 的随机数，这里可自定义
//        return world.random.nextInt(4) + 2; // 生成2-5的随机数
//    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public Essence_WheatCropBlock(Settings settings) {

        super(settings);
    }

}

