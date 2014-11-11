package com.bmagus.ancients;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.bmagus.ancients.blocks.ModBlocks;
import com.bmagus.ancients.handler.ModRecipes;
import com.bmagus.ancients.help.Reference;
import com.bmagus.ancients.help.RegisterHelper;
import com.bmagus.ancients.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = Reference.MODID, version= Reference.VERSION)
public class AncientsMod 
{
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.loadBlocks();
		ModItems.loadItems();
		ModRecipes.addRecipes();
	}
	
}
