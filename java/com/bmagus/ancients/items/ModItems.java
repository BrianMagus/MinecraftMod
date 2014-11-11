package com.bmagus.ancients.items;

import com.bmagus.ancients.help.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//Item Materials
	public static Item trueIronIngot;
	public static Item diamondDust;
	
	//tools
	public static Item trueIronPickaxe;
	
	//tool materials
	static ToolMaterial trueIronMaterial = EnumHelper.addToolMaterial("trueIronMaterial", 3, 500, 7.0f, 50.0f, 18);
	
	//astrium items
	public static Item rawAstrium;
	public static Item refinedAstrium;
	
	
	public static void loadItems()
	{
		trueIronIngot = new ItemTrueIronIngot();
		RegisterHelper.registerItem(trueIronIngot);
		
		trueIronPickaxe=new ItemTrueIronPickaxe(trueIronMaterial);
		RegisterHelper.registerItem(trueIronPickaxe);
		
		rawAstrium = new ItemRawAstrium();
		RegisterHelper.registerItem(rawAstrium);
		refinedAstrium = new ItemRefinedAstrium();
		RegisterHelper.registerItem(refinedAstrium);
		
		diamondDust=new ItemDiamondDust();
		RegisterHelper.registerItem(diamondDust);
		
		
		
	}
}
