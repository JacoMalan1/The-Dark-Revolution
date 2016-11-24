/*
    A mod for MInecraft built on the Forge API.
    Copyright (C) 2016  Jaco Malan

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.teamup115.drmod;

import com.teamup115.drmod.client.DRTab;
import com.teamup115.drmod.item.ModItems;
import com.teamup115.drmod.proxy.CommonProxy;
import com.teamup115.drmod.recipe.ModRecipes;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class DRMod {
	
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 250, 5, 12, 14);
	public static final Item.ToolMaterial steelToolMaterial = EnumHelper.addToolMaterial("STEEL", 2, 500, 5, 16, 14);
	public static final Item.ToolMaterial dimensionalToolMaterial = EnumHelper.addToolMaterial("DIMENSIONAL", 3, 1000, 12.0F, 1000, 14);
	
	public static DRTab creativeTab = new DRTab();
	
	@SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE)
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static DRMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
