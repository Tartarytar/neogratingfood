package com.tar.createfoodfood.item;

import com.tar.createfoodfood.CreateFoodFood;
import com.tar.createfoodfood.entity.ModEntities;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ChorusFruitItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.PotionContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateFoodFood.MODID);

    public static final DeferredItem<Item> PIE_CRUST = ITEMS.register("pie_crust",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIE_CRUST)));
    public static final DeferredItem<Item> APPLE_HONEY_PIE = ITEMS.register("apple_honey_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.APPLE_HONEY_PIE)
                    .stacksTo(32)));
    public static final DeferredItem<Item> ENDER_DOUGH = ITEMS.register("ender_dough",
            () -> new ChorusFruitItem(new Item.Properties().food(ModFoodProperties.ENDER_DOUGH)));
    public static final DeferredItem<Item> ENDER_PIE = ITEMS.register("ender_pie",
            () -> new ChorusFruitItem(new Item.Properties().food(ModFoodProperties.ENDER_PIE)));
    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));
    public static final DeferredItem<Item> BERRY_PIE = ITEMS.register("berry_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRY_PIE)));
    public static final DeferredItem<Item> BERRY_JELLY = ITEMS.register("berry_jelly",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRY_JELLY)));
    public static final DeferredItem<Item> BRASSWICH = ITEMS.register("brasswich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRASSWICH)));
    public static final DeferredItem<Item> COOKED_EGG = ITEMS.register("cooked_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_EGG)));
    public static final DeferredItem<Item> BERRY_JAM = ITEMS.register("berry_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRY_JAM)));
    public static final DeferredItem<Item> RAW_PIE_CRUST = ITEMS.register("raw_pie_crust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHEESE_PIE = ITEMS.register("cheese_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE_PIE)));
    public static final DeferredItem<Item> ODD_MEAT = ITEMS.register("odd_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ODD_MEAT)));
    public static final DeferredItem<Item> ODD_SAUSAGE = ITEMS.register("odd_sausage",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ODD_SAUSAGE)));
    public static final DeferredItem<Item> ODD_PIE = ITEMS.register("odd_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ODD_PIE)));
    public static final DeferredItem<Item> INCOMPLETE_ODD_PIE = ITEMS.register("incomplete_odd_pie",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_PIE_EGG = ITEMS.register("incomplete_pie_egg",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STACKED_PIE = ITEMS.register("incomplete_stacked_pie",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COTTON_CANDY = ITEMS.register("cotton_candy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COTTON_CANDY)));
    public static final DeferredItem<Item> SOUL_PIE = ITEMS.register("soul_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SOUL_PIE)));
    public static final DeferredItem<Item> STACKED_PIE = ITEMS.register("stacked_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STACKED_PIE)));

    public static final DeferredItem<Item> POTION_COOKIE = ITEMS.register("potion_cookie",
            () -> new PotionItem(new Item.Properties().stacksTo(16).component(DataComponents.POTION_CONTENTS, PotionContents.EMPTY)));

    public static final DeferredItem<Item> MONSTER_PIE_SPAWN_EGG = ITEMS.register("monster_pie_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MONSTER_PIE,0xFFFFFF, 0xFFFFFF, new Item.Properties()));
    public static final DeferredItem<Item> RAGING_PIE = ITEMS.register("raging_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAGING_PIE)));
    public static final DeferredItem<Item> COTTON_PIE = ITEMS.register("cotton_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COTTON_PIE)));
    public static final DeferredItem<Item> TRIPLE_STACKED_PIE = ITEMS.register("triple_stacked_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TRIPLE_STACKED_PIE)));



    public static void  register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
