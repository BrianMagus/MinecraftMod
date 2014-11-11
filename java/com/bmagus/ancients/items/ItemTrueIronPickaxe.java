package com.bmagus.ancients.items;

import com.bmagus.ancients.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemTrueIronPickaxe extends ItemPickaxe 
{
	public ItemTrueIronPickaxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("trueIronPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
	}
}
