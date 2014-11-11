package com.bmagus.ancients.handler;

import com.bmagus.ancients.blocks.ModBlocks;
import com.bmagus.ancients.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void addRecipes() 
	{
        //Shaped Recipes - regular crafting table
		GameRegistry.addRecipe(new ItemStack(ModItems.trueIronPickaxe), new Object[]
		{
			"XXX",
			" Y ",
			" Y ",
			'X', ModItems.trueIronIngot, 'Y', Items.stick
		});
		
		//Furnace Recipes - regular furnace
		GameRegistry.addSmelting(ModBlocks.trueIron, new ItemStack(ModItems.trueIronIngot,1,0), 10);
		GameRegistry.addSmelting(new ItemStack(ModItems.rawAstrium,5), new ItemStack(ModItems.refinedAstrium,1), 25);
		
		//shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamondDust, 2, 0), new Object[]
				{
					Items.diamond
				});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rawAstrium), new Object[]
				{
					Items.redstone, ModItems.diamondDust
				});
	}
}