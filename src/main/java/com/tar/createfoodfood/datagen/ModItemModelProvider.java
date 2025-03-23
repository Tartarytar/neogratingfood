package com.tar.createfoodfood.datagen;

import com.tar.createfoodfood.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import java.util.LinkedHashMap;

//public class ModItemModelProvider  extends ItemModelProvider {


//    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
//        super(output, modid, existingFileHelper); }

//    @Override
//    protected void registerModels() {
//        withExistingParent(ModItems.MONSTER_PIE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
//    }}
