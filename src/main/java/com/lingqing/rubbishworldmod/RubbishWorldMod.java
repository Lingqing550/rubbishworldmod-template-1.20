package com.lingqing.rubbishworldmod;

import com.lingqing.rubbishworldmod.block.ModBlocks;
import com.lingqing.rubbishworldmod.entity.ModEntities;
import com.lingqing.rubbishworldmod.entity.custom.Rubbish_MonsterEntity;
import com.lingqing.rubbishworldmod.item.ModItems;
import com.lingqing.rubbishworldmod.item.ModItemGroup;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class RubbishWorldMod implements ModInitializer {
	public static final String MOD_ID = "rubbishworldmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModItemGroup.registerModItemGroup();
		ModBlocks.registerModBlock();
		BlockRenderLayerMap.INSTANCE.putBlock(
				ModBlocks.ESSENCE_WHEAT_CROP,RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(
				ModBlocks.MODEL_LINGQING,RenderLayer.getTranslucent());

		FabricDefaultAttributeRegistry.register(ModEntities.RUBBISH_MONSTER, Rubbish_MonsterEntity.createRubbish_MonsterAttributes());

		ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
			String tooltipKey = ModItems.ITEM_TOOLTIPS.get(stack.getItem());
			if (tooltipKey != null) {
				lines.add(Text.translatable(tooltipKey).formatted(Formatting.GRAY));
			}
		});

		FuelRegistry.INSTANCE.add(ModItems.RUBBISH,1000);



		UseItemCallback.EVENT.register(((player, world, hand) -> {
			ItemStack stack=player.getStackInHand(hand);

			if (stack.getItem()==ModItems.RUBBISH&&!world.isClient()){

				stack.decrement(1);

				Random random=player.getRandom();
				Item reward=random.nextBoolean()?ModItems.KITCHEN_RUBBISH : ModItems.ELECTRONIC_TRASH;

				player.giveItemStack(new ItemStack(reward));

				return TypedActionResult.success(stack);
			}
			return TypedActionResult.pass(stack);
		}));



	}

}