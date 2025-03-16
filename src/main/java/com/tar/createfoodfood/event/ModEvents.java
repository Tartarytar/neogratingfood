package com.tar.createfoodfood.event;

import com.tar.createfoodfood.CreateFoodFood;
import com.tar.createfoodfood.item.ModItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = CreateFoodFood.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event){
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addContainer(ModItems.POTION_COOKIE.get());
        builder.addContainerRecipe(Items.POTION, ModItems.ENDER_DOUGH.get(), ModItems.POTION_COOKIE.get());

    }
}
