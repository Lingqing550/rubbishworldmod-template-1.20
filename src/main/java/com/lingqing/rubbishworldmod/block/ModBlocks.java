package com.lingqing.rubbishworldmod.block;


import com.lingqing.rubbishworldmod.RubbishWorldMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.shape.VoxelShapes;

public class ModBlocks {

    public static final Block RUBBISH_BLOCK = registerBlocks("rubbish_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block EXTRACTING_MACHINE = registerBlocks("extracting_machine",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block ESSENCE_WHEAT_CROP = Registry.register(Registries.BLOCK, new Identifier(RubbishWorldMod.MOD_ID,"essence_wheat_crop"),
            new Essence_WheatCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));

    public static final Block MODEL_LINGQING = registerBlocks("model_lingqing",
            new Block(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK)));




    private static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(RubbishWorldMod.MOD_ID,name),block);
    }

    private static Item  registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(RubbishWorldMod.MOD_ID,name),
        new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlock(){

    }
}
