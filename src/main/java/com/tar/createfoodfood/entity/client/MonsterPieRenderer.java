package com.tar.createfoodfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.tar.createfoodfood.CreateFoodFood;
import com.tar.createfoodfood.entity.client.MonsterPieModel;
import com.tar.createfoodfood.entity.custom.MonsterPieEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MonsterPieRenderer extends MobRenderer<MonsterPieEntity, MonsterPieModel<MonsterPieEntity>> {
    public MonsterPieRenderer(EntityRendererProvider.Context context) {
        super(context, new MonsterPieModel<>(context.bakeLayer(MonsterPieModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(MonsterPieEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(CreateFoodFood.MODID, "textures/entity/monsterpie/monsterpie.png");
    }

    @Override
    public void render(MonsterPieEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
