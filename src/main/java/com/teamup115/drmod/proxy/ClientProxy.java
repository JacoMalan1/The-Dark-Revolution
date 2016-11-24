package com.teamup115.drmod.proxy;

import com.teamup115.drmod.Reference;
import com.teamup115.drmod.item.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + id, "inventory"));
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		OBJLoader.INSTANCE.addDomain(Reference.MODID);
		registerModel(ModItems.longSword);
	}
	
	public void registerModel(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName(), "inventory"));
	}
}
