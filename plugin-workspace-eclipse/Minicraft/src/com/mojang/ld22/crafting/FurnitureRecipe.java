package com.mojang.ld22.crafting;

import java.lang.reflect.InvocationTargetException;

import com.mojang.ld22.entity.Furniture;
import com.mojang.ld22.entity.Player;
import com.mojang.ld22.item.FurnitureItem;

public class FurnitureRecipe extends Recipe {
	private Class<? extends Furniture> clazz;

	public FurnitureRecipe(Class<? extends Furniture> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException  {
		super(new FurnitureItem(clazz.getDeclaredConstructor().newInstance()));
		
		this.clazz = clazz;
	}

	public void craft(Player player) {
		try {
			player.inventory.add(0, new FurnitureItem(clazz.getDeclaredConstructor().newInstance()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
