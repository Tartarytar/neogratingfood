package com.tar.createfoodfood.potion;

import com.tar.createfoodfood.CreateFoodFood;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(BuiltInRegistries.POTION, CreateFoodFood.MODID);

    public static final Holder<Potion> HEALTH_BOOST = POTIONS.register("health_boost",
            () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 1)));
    public static final Holder<Potion> LONG_HEALTH_BOOST = POTIONS.register("long_health_boost",
            () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 9600, 1)));
    public static final Holder<Potion> STRONG_HEALTH_BOOST = POTIONS.register("strong_health_boost",
            () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800, 2)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}