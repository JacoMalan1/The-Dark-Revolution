package com.teamup115.drmod.item.tool;

import com.teamup115.drmod.DRMod;
import com.teamup115.drmod.item.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider {
	private String name;

	public ItemSword(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(DRMod.creativeTab);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		DRMod.proxy.registerItemRenderer(this, 0, name);
	}
}