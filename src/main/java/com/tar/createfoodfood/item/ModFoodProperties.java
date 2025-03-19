package com.tar.createfoodfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties PIE_CRUST = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodProperties APPLE_HONEY_PIE = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(2f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).fast().build();
    public static final FoodProperties BERRY_PIE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8f).build();
    public static final FoodProperties BRASSWICH = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodProperties COOKED_EGG = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).fast().build();
    public static final FoodProperties ENDER_DOUGH = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).fast().build();
    public static final FoodProperties ENDER_PIE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 300, 0), 1.0F)
            .alwaysEdible()
            .fast()
            .build();
    public static final FoodProperties BERRY_JAM = new FoodProperties.Builder().nutrition(2).saturationModifier(1f).fast().build();
    public static final FoodProperties CHEESE_PIE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f).fast().build();
}
