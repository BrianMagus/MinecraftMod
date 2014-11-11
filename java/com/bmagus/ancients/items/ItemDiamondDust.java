package com.bmagus.ancients.items;

import com.bmagus.ancients.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDiamondDust extends Item 
{
	public ItemDiamondDust()
	{
		super();
		setUnlocalizedName("diamondDust");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
