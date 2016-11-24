package com.teamup115.drmod.recipe;

import com.teamup115.drmod.item.ItemBase;
import com.teamup115.drmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init()
	{
		//Shaped Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ingotCopper), 
				"III", 
				"IGI", 
				"III", 'I', Items.IRON_INGOT, 'G', Items.GOLD_INGOT);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword),
				" C ",
				" C ",
				" S ", 'C', ModItems.ingotCopper, 'S', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.baseBlade),
				" S ",
				" S ",
				" S ", 'S', ModItems.hardenedSteel);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.baseHandle),
				" S ",
				" S ",
				"   ", 'S', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.longSword),
				" B ",
				" B ",
				" H ", 'B', ModItems.baseBlade, 'H', ModItems.baseHandle);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.genericMold),
				"SSS",
				"S S",
				"SSS", 'S', ModItems.hardenedStone);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.forgingHammer, 4),
				"III",
				"III",
				" S ", 'I', Items.IRON_INGOT, 'S', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.leatherStrip, 3),
				" S ",
				" S ",
				" S ", 'S', Items.LEATHER);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelSword),
				" W ",
				"HBF",
				"HNS", 'W', Items.WATER_BUCKET, 'H', ModItems.hardenedSteel, 'B', ModItems.armingBlade, 'F', ModItems.forgingHammer, 'N', ModItems.baseHandle, 'S', ModItems.leatherStrip);
		
		//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hardenedStone), ModItems.purifiedStone, ModItems.hardenedSteel);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mold_arming), ModItems.blueprint_arming, ModItems.genericMold);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brokenArmingBlade), ModItems.moltenSteel, ModItems.mold_arming, ModItems.forgingHammer);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.armingBlade), ModItems.softenedArmingBlade, ModItems.forgingHammer);
		
		
		//Smelting
		GameRegistry.addSmelting(Blocks.STONE, new ItemStack(ModItems.purifiedStone), 2);
		
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.hardenedSteel), 1);
		
		GameRegistry.addSmelting(ModItems.hardenedSteel, new ItemStack(ModItems.moltenSteel), 2);
		
		GameRegistry.addSmelting(ModItems.brokenArmingBlade, new ItemStack(ModItems.softenedArmingBlade), 0);
	}
}
