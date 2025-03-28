package com.tar.createfoodfood;

import com.tar.createfoodfood.entity.ModEntities;
import com.tar.createfoodfood.entity.client.MonsterPieRenderer;
import com.tar.createfoodfood.item.ModItems;
import com.tar.createfoodfood.potion.ModPotions;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateFoodFood.MODID)
public class CreateFoodFood
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "createfoodfood";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateFoodFood(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);



        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);


        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
        ModPotions.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() ==  CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RAW_PIE_CRUST);
            event.accept(ModItems.PIE_CRUST);
            event.accept(ModItems.STACKED_PIE);
            event.accept(ModItems.TRIPLE_STACKED_PIE);
            event.accept(ModItems.APPLE_HONEY_PIE);
            event.accept(ModItems.BERRY_CHOCO_PIE);
            event.accept(ModItems.SWEET_MILK_PIE);
            event.accept(ModItems.BERRY_PIE);
            event.accept(ModItems.CHEESE_PIE);
            event.accept(ModItems.ENDER_PIE);
            event.accept(ModItems.ODD_PIE);
            event.accept(ModItems.SOUL_PIE);
            event.accept(ModItems.MONSTER_PIE_SPAWN_EGG);
            event.accept(ModItems.RAGING_PIE);
            event.accept(ModItems.COTTON_PIE);
            event.accept(ModItems.BRASSWICH);
            event.accept(ModItems.ENDER_DOUGH);
            event.accept(ModItems.CHEESE);
            event.accept(ModItems.COOKED_EGG);
            event.accept(ModItems.ODD_MEAT);
            event.accept(ModItems.ODD_SAUSAGE);
            event.accept(ModItems.BERRY_JAM);
            event.accept(ModItems.BERRY_JELLY);
            event.accept(ModItems.COTTON_CANDY);
            event.accept(ModItems.POTION_COOKIE);

            //event.holders()
            //        .lookup(Registries.POTION)
            //        .ifPresent(
            //                p_337917_ -> generatePotionEffectTypes(
            //                        p_337924_,
            //                        p_337917_,
            //                        ModItems.POTION_COOKIE,
            //                        CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS,
            //                        p_337923_.enabledFeatures()
            //                )
            //        );
        }

        if (event.getTabKey() ==  CreativeModeTabs.SPAWN_EGGS) {
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.MONSTER_PIE.get(), MonsterPieRenderer::new);
        }
    }
}
