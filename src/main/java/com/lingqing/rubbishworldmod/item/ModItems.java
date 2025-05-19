package com.lingqing.rubbishworldmod.item;

import com.lingqing.rubbishworldmod.RubbishWorldMod;
import com.lingqing.rubbishworldmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class ModItems {
    // 存储物品与工具提示键的映射
    public static final Map<Item, String> ITEM_TOOLTIPS = new HashMap<>();

    // 所有物品一行定义（名称 + 物品实例 + 工具提示键）
    public static final Item RUBBISH = registerItem("rubbish", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.rubbish");
    public static final Item ELECTRONIC_TRASH = registerItem("electronic_trash", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.electronic_trash");
    public static final Item KITCHEN_RUBBISH = registerItem("kitchen_rubbish", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.kitchen_rubbish");
    public static final Item RUBBISH_ESSENCE = registerItem("rubbish_essence", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.rubbish_essence");
    public static final Item ESSENCE_IRON_ORE = registerItem("essence_iron_ore", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.essence_iron_ore");
    public static final Item ESSENCE_IRON_INGOT = registerItem("essence_iron_ingot", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.essence_iron_ingot");
    public static final Item ESSENCE_IRON_INGOT_NUGGET = registerItem("essence_iron_ingot_nugget", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.essence_iron_ingot_nugget");
    public static final Item RUBBISH_CRYSTAL = registerItem("rubbish_crystal", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.rubbish_crystal");
    public static final Item ESSENCE_INGOT_UP = registerItem("essence_iron_ingot_up", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.essence_iron_ingot_up");
    public static final Item ESSENCE_INGOT_UP_NUGGET = registerItem("essence_iron_ingot_up_nugget", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.essence_iron_ingot_up_nugget");
    public static final Item RUBBISH_UPGRADE_SMITHING_TEMPLATE = registerItem("rubbish_upgrade_smithing_template", new Item(new FabricItemSettings()), "tooltip.rubbishworldmod.rubbish_upgrade_smithing_template");
    public static final Item ESSENCE_WHEAT_SEEDS = registerItem("essence_wheat_seeds",new AliasedBlockItem(ModBlocks.ESSENCE_WHEAT_CROP, new FabricItemSettings()), "tooltip.essence_seeds");
    public static final Item ESSENCE_WHEAT = registerItem("essence_wheat", new Item(new  FabricItemSettings()), "tooltip.essence_fruit");

    // Food
    public static final Item ESSENCE_BREAD = registerItem("essence_bread", new Item(new FabricItemSettings().food(ModFoodComponents.ESSENCE_BREAD)), "tooltip.rubbishworldmod.essence_bread");

    private static Item registerItem(String name, Item item, String tooltipKey) {
        if (tooltipKey != null && !tooltipKey.isEmpty()) {
            ITEM_TOOLTIPS.put(item, tooltipKey);
        }
        return Registry.register(Registries.ITEM, new Identifier(RubbishWorldMod.MOD_ID, name), item);
    }

    private static void addItemsToIG1(FabricItemGroupEntries entries) {
        entries.add(RUBBISH);
        entries.add(ELECTRONIC_TRASH);
        entries.add(KITCHEN_RUBBISH);
        entries.add(RUBBISH_ESSENCE);
        entries.add(ESSENCE_IRON_ORE);
        entries.add(ESSENCE_IRON_INGOT);
        entries.add(ESSENCE_IRON_INGOT_NUGGET);
        entries.add(RUBBISH_CRYSTAL);
        entries.add(ESSENCE_INGOT_UP);
        entries.add(ESSENCE_INGOT_UP_NUGGET);
        entries.add(RUBBISH_UPGRADE_SMITHING_TEMPLATE);
    }

    private static void addItemsToIG2(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.RUBBISH_BLOCK);
        entries.add(ModBlocks.EXTRACTING_MACHINE);
    }

    private static void addItemsToIG3(FabricItemGroupEntries entries) {
        entries.add(ESSENCE_BREAD);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG1);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToIG2);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIG3);
    }
}
