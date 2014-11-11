package com.bmagus.ancients.blocks;

import com.bmagus.ancients.help.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks 
{
	public static Block trueIron;
	
	//Machines
	public static Block blockManaFurnaceActive;
	public static Block blockManaFurnaceIdle;
		
	
	public static void loadBlocks()
	{
		trueIron = new BlockTrueIron();
		RegisterHelper.registerBlock(trueIron);
		
		//Machine Initializer
		blockManaFurnaceIdle = new ManaFurnace(false).setBlockName("ManaFurnaceIdle").setCreativeTab(CreativeTabs.tabBlock).setHardness(3.5F);
		blockManaFurnaceActive = new ManaFurnace(true).setBlockName("ManaFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
		
		GameRegistry.registerBlock(blockManaFurnaceIdle, "ManaFurnaceIdle");
		GameRegistry.registerBlock(blockManaFurnaceActive, "ManaFurnaceActive");
	}
}
