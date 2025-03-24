package com.tar.createfoodfood.event;

import com.tar.createfoodfood.CreateFoodFood;
import com.tar.createfoodfood.item.ModItems;
import com.tar.createfoodfood.potion.ModPotions;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.FastColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.IModBusEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.fml.LogicalSide;
import net.neoforged.fml.event.IModBusEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import static com.tar.createfoodfood.Config.items;
import static com.tar.createfoodfood.CreateFoodFood.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event){
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(Potions.AWKWARD, Items.SUGAR, ModPotions.HEALTH_BOOST);
        builder.addContainer(ModItems.POTION_COOKIE.get());
        builder.addContainerRecipe(Items.POTION, ModItems.ENDER_DOUGH.get(), ModItems.POTION_COOKIE.get());
        builder.addMix(Potions.AWKWARD, ModItems.COTTON_CANDY.get(), ModPotions.HEALTH_BOOST);
        builder.addMix(ModPotions.HEALTH_BOOST, Items.REDSTONE, ModPotions.LONG_HEALTH_BOOST);
        builder.addMix(ModPotions.HEALTH_BOOST, Items.GLOWSTONE_DUST, ModPotions.STRONG_HEALTH_BOOST);

    }

@EventBusSubscriber(modid = MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientEvents {
    @SubscribeEvent
    public static void registerItemColors(final RegisterColorHandlersEvent.Item event) {
        event.register(
                           (p_329703_, p_329704_) -> p_329704_ > 0
                            ? -1
                            : FastColor.ARGB32.opaque(p_329703_.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).getColor()),
                             ModItems.POTION_COOKIE.get()
                            );
        }
    }
}