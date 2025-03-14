package com.tar.createfoodfood.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties PIE_CRUST = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties APPLE_HONEY_PIE = new FoodProperties.Builder().nutrition(10).saturationModifier(1f).build();;
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).fast().build();;
}
