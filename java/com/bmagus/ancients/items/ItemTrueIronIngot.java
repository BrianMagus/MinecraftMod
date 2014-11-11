package com.bmagus.ancients.items;

import com.bmagus.ancients.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTrueIronIngot extends Item
{
	public ItemTrueIronIngot()
	{
		super();
		setUnlocalizedName("trueIronIngot");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
