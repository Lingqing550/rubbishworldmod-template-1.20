package com.lingqing.rubbishworldmod.item;

import com.lingqing.rubbishworldmod.RubbishWorldMod;
import com.lingqing.rubbishworldmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RUBBISHWORLDMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RubbishWorldMod.MOD_ID,"rubbishworldmod_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.rubbishworldmod_group"))
                    .icon(()-> new ItemStack(ModItems.RUBBISH)).entries((displayContext, entries) -> {
                        //item
                        entries.add(ModItems.RUBBISH);
                        entries.add(ModItems.ELECTRONIC_TRASH);
                        entries.add(ModItems.KITCHEN_RUBBISH);
                        entries.add(ModItems.RUBBISH_ESSENCE);
                        entries.add(ModItems.ESSENCE_IRON_ORE);
                        entries.add(ModItems.ESSENCE_IRON_INGOT);
                        entries.add(ModItems.ESSENCE_IRON_INGOT_NUGGET);
                        entries.add(ModItems.RUBBISH_CRYSTAL);
                        entries.add(ModItems.ESSENCE_INGOT_UP);
                        entries.add(ModItems.ESSENCE_INGOT_UP_NUGGET);
                        entries.add(ModItems.RUBBISH_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.ESSENCE_WHEAT_SEEDS);
                        entries.add(ModItems.ESSENCE_WHEAT);

                        //food
                        entries.add(ModItems.ESSENCE_BREAD);
                        //block
                        entries.add(ModBlocks.RUBBISH_BLOCK);
                        entries.add(ModBlocks.EXTRACTING_MACHINE);
                        entries.add(ModBlocks.MODEL_LINGQING);

                    }).build());
    public static void registerModItemGroup(){

    }
}
