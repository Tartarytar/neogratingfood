package com.tar.createfoodfood.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.tar.createfoodfood.CreateFoodFood;
import com.tar.createfoodfood.entity.custom.MonsterPieEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class MonsterPieModel<T extends MonsterPieEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(CreateFoodFood.MODID, "monster_pie"), "main");
    private final ModelPart body;
    private final ModelPart head;


    public MonsterPieModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = this.body.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 5.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, 0.0F, 12.0F, 12.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-4.0F, -12.0F, -1.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 2.0F, -11.0F));

        PartDefinition antena = head.addOrReplaceChild("antena", CubeListBuilder.create().texOffs(44, 9).addBox(2.0F, -3.5F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(34, 9).addBox(-5.0F, -3.5F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -14.5F, 1.0F));

        PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(26, 17).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -5.0F));

        PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 30).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -5.75F, 5.0F));

        PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 30).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition feet1a = body.addOrReplaceChild("feet1a", CubeListBuilder.create(), PartPose.offset(-4.8289F, 1.0163F, -8.5F));

        PartDefinition cube_r2 = feet1a.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 47).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6711F, 1.4837F, 0.5F, 0.0F, 0.0F, 1.1345F));

        PartDefinition feet1b = body.addOrReplaceChild("feet1b", CubeListBuilder.create(), PartPose.offset(-4.5F, 2.5F, -3.0F));

        PartDefinition cube_r3 = feet1b.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 47).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.1345F));

        PartDefinition feet1c = body.addOrReplaceChild("feet1c", CubeListBuilder.create(), PartPose.offset(-3.5F, 2.5F, 2.0F));

        PartDefinition cube_r4 = feet1c.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 47).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.1345F));

        PartDefinition feet2a = body.addOrReplaceChild("feet2a", CubeListBuilder.create(), PartPose.offset(6.7344F, 1.9789F, -8.9072F));

        PartDefinition cube_r5 = feet2a.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 47).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4926F, -1.3289F, 0.7164F, 0.0F, 0.0F, -1.1345F));

        PartDefinition feet2b = body.addOrReplaceChild("feet2b", CubeListBuilder.create(), PartPose.offset(5.5F, 0.65F, -3.0F));

        PartDefinition cube_r6 = feet2b.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 47).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1345F));

        PartDefinition feet2c = body.addOrReplaceChild("feet2c", CubeListBuilder.create(), PartPose.offset(4.5F, 0.65F, 2.0F));

        PartDefinition cube_r7 = feet2c.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 47).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1345F));

        PartDefinition feet3 = body.addOrReplaceChild("feet3", CubeListBuilder.create(), PartPose.offset(4.5F, 2.5F, 2.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(MonsterPieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(MonsterPieAnimations.MONSTER_PIE_IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, MonsterPieAnimations.MONSTER_PIE_WALKING, ageInTicks, 1f);
    }


    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -15f, 15f);
        headPitch = Mth.clamp(headPitch, -15f, 25);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch *  ((float)Math.PI / 180f);
    }



    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return body;
    }
}