package com.tar.createfoodfood.entity;

import com.tar.createfoodfood.CreateFoodFood;
import com.tar.createfoodfood.entity.custom.MonsterPieEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.text.html.parser.Entity;
import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, CreateFoodFood.MODID);

    public static final Supplier<EntityType<MonsterPieEntity>> MONSTER_PIE =
            ENTITY_TYPES.register("monster_pie", () -> EntityType.Builder.of(MonsterPieEntity::new, MobCategory.CREATURE)
                    .sized(0.75f, 0.35f).build("monster_pie"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
