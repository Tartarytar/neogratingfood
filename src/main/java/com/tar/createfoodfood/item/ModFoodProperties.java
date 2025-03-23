package com.tar.createfoodfood.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties PIE_CRUST = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodProperties APPLE_HONEY_PIE = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(1.8f)
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
    public static final FoodProperties BERRY_JELLY = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.5f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 300, 0), 1.0F)
            .fast()
            .build();
    public static final FoodProperties CHEESE_PIE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f).fast().build();
    public static final FoodProperties ODD_MEAT = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 300, 0), 0.3F)
            .build();
    public static final FoodProperties ODD_SAUSAGE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200, 0), 0.2F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 2, 0), 0.5F)
            .build();
    public static final FoodProperties ODD_PIE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 150, 0), 0.2F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 2, 0), 0.4F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 0), 0.4F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 0.5F)
            .effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 300, 0), 0.4F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 0.5F)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 0), 0.4F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0), 0.5F)
            .effect(new MobEffectInstance(MobEffects.POISON, 300, 0), 0.4F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 0.5F)
            .alwaysEdible()
            .build();
    public static final FoodProperties STACKED_PIE = new FoodProperties.Builder().nutrition(9).saturationModifier(0.6f).build();
    public static final FoodProperties SOUL_PIE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0f)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HARM, 1, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodProperties COTTON_CANDY = new FoodProperties.Builder().nutrition(1).saturationModifier(1f).fast().build();
}
