package com.bmagus.ancients.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.bmagus.ancients.help.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ManaFurnace extends BlockContainer 
{
	private final boolean isActive;
	
	@SideOnly (Side.CLIENT)
	private IIcon iconFront;
	@SideOnly (Side.CLIENT)
	private IIcon iconTop;
	
	public ManaFurnace(boolean isActive) {
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.5f);
		setResistance(5.0f);
		this.isActive = isActive;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + "manaFurnaceSide");
		this.iconFront = iconRegister.registerIcon(Reference.MODID + ":" + (this.isActive ? "manaFurnaceFrontActive" : "manaFurnaceFrontIdle"));
		this.iconTop = iconRegister.registerIcon(Reference.MODID + ":" + "manaFurnaceTop");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){
		//return metadata == 0 && side == 3 ? this.iconFront : (side == metadata ? this.iconFront : this.blockIcon;)
		return side == 3 ? this.iconFront : side == 1 ? this.iconTop : (side==0 ? this.iconTop : (side != metadata ? this.blockIcon : this.iconFront));
	}
	
	public Item getItemDropped(World world, int x, int y, int z){
		return Item.getItemFromBlock(ModBlocks.blockManaFurnaceIdle);
	}
	
	public void onBlockAdded(World world, int x, int y, int z){
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z) {
		if (!world.isRemote){
			Block b1=world.getBlock(x, y, z-1);
			Block b2=world.getBlock(x, y, z+1);
			Block b3=world.getBlock(x-1, y, z);
			Block b4=world.getBlock(x+1, y, z);
			
			byte b0 = 3;
			
			if(b1.func_149730_j() && !b2.func_149730_j()){
				b0=3;
			}
			if(b2.func_149730_j() && !b1.func_149730_j()){
				b0=2;
			}
			if(b3.func_149730_j() && !b4.func_149730_j()){
				b0=5;
			}
			if(b4.func_149730_j() && !b3.func_149730_j()){
				b0=4;
			}
			
			world.setBlockMetadataWithNotify(x, y, x, b0, 2);
		}
		
	}
	
	//TODO onBlockActivated

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return null;
	}

	//TODO randomDisplayTick
	
	public void onBLockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack){
		int l = MathHelper.floor_double((double)(entityplayer.rotationYaw*4.0f / 360.f) + 0.5D) & 3;
		
		if (l==0){
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		if (l==1){
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}
		if (l==2){
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		if (l==3){
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
		
		if(itemstack.hasDisplayName()){
			//TODO ((TileEntityManaFurnace)world.getTileEntity(x, y, z))setGuiDisplayName(itemstack.getDisplayName());
		}
	}
	
}
