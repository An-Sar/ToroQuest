package net.torocraft.toroquest.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.torocraft.toroquest.ToroQuest;

public class ToroQuestBlocks {
	
	public static final String MODID = ToroQuest.MODID;
	
	//public static Block rubberBlock;
	
	//public static Item rubberBlockItem;

	public static final void init() {
		//initRubber();
		
	}
	/*
	private static void initRubber() {
		rubberBlock = new BlockRubber();
		GameRegistry.registerBlock(rubberBlock, BlockRubber.NAME);
		rubberBlockItem = GameRegistry.findItem(MODID, BlockRubber.NAME);
		ModelResourceLocation rubberBlockModel = new ModelResourceLocation(MODID + ":" + BlockRubber.NAME, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(rubberBlockItem, 0, rubberBlockModel);
	}
	*/
}