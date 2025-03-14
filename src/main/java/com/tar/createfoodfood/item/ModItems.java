package com.tar.createfoodfood.item;

import com.tar.createfoodfood.CreateFoodFood;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateFoodFood.MODID);

    public static final DeferredItem<Item> PIE_CRUST = ITEMS.register("pie_crust",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIE_CRUST)));
    public static final DeferredItem<Item> APPLE_HONEY_PIE = ITEMS.register("apple_honey_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.APPLE_HONEY_PIE)));
    public static final DeferredItem<Item> ENDER_DOUGH = ITEMS.register("ender_dough",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));
    public static final DeferredItem<Item> BERRY_PIE = ITEMS.register("berry_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRY_PIE)));
    public static final DeferredItem<Item> BRASSWICH = ITEMS.register("brasswich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRASSWICH)));
    public static final DeferredItem<Item> COOKED_EGG = ITEMS.register("cooked_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_EGG)));

    public static void  register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
