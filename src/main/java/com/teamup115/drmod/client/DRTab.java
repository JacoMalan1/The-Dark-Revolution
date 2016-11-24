package com.teamup115.drmod.client;

import com.teamup115.drmod.Reference;
import com.teamup115.drmod.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DRTab extends CreativeTabs 
{
	public DRTab()
	{
		super(Reference.MODID);
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCopper;
	}
}
