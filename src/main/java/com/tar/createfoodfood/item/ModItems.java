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



    public static void  register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
