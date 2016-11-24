package com.teamup115.drmod.item;

import com.teamup115.drmod.DRMod;
import com.teamup115.drmod.item.tool.ItemSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	/*
	 * 
	 */
	
	public static ItemBase ingotCopper;
	public static ItemSword copperSword;
	public static ItemBase hardenedSteel;
	public static ItemSword steelSword;
	public static ItemSword longSword;
	public static ItemBase baseBlade;
	public static ItemBase baseHandle;
	public static ItemSword steelBSword;
	public static ItemBase genericMold;
	public static ItemBase purifiedStone;
	public static ItemBase hardenedStone;
	public static ItemBase forgingHammer;
	public static ItemBase blueprint_arming;
	public static ItemBase mold_arming;
	public static ItemBase moltenSteel;
	public static ItemBase brokenArmingBlade;
	public static ItemBase softenedArmingBlade;
	public static ItemBase armingBlade;
	public static ItemBase leatherStrip;
	public static ItemSword riftSword;
	
	public static void init() 
	{
		//Items
		genericMold = register(new ItemBase("genericMold"));
		baseBlade = register(new ItemBase("baseBlade"));
		baseHandle = register(new ItemBase("baseHandle"));
		purifiedStone = register(new ItemBase("purifiedStone"));
		hardenedStone = register(new ItemBase("hardenedStone"));
		forgingHammer = register(new ItemBase("forgingHammer"));
		blueprint_arming = register(new ItemBase("blueprint_arming"));
		mold_arming = register(new ItemBase("mold_arming"));
		moltenSteel = register(new ItemBase("moltenSteel"));
		brokenArmingBlade = register(new ItemBase("brokenArmingBlade"));
		softenedArmingBlade = register(new ItemBase("softenedArmingBlade"));
		armingBlade = register(new ItemBase("armingBlade"));
		leatherStrip = register(new ItemBase("leatherStrip"));
		
		//Ingots
		ingotCopper = register(new ItemBase("ingotCopper"));
		hardenedSteel = register(new ItemBase("hardenedSteel"));
		
		//Tools
		copperSword = register(new ItemSword(DRMod.copperToolMaterial, "copperSword"));
		steelSword = register(new ItemSword(DRMod.steelToolMaterial, "steelSword"));
		longSword = register(new ItemSword(DRMod.steelToolMaterial, "longSword"));
		steelBSword = register(new ItemSword(DRMod.steelToolMaterial, "steelBSword"));
		riftSword = register(new ItemSword(DRMod.dimensionalToolMaterial, "riftSword"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}
}
