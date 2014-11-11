package com.bmagus.ancients.blocks;

import com.bmagus.ancients.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTrueIron extends Block {
	
	public BlockTrueIron()
	{
		super(Material.rock);
		setBlockName("trueIron");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.5f);
		setResistance(5.0f);
		
	}

}
