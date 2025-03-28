package com.tar.createfoodfood.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class MonsterPieAnimations{
public static final AnimationDefinition MONSTER_PIE_WALKING = AnimationDefinition.Builder.withLength(1f).looping()
        .addAnimation("antena",
                new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, -0.5f),
                                AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("antena",
                new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5f, KeyframeAnimations.degreeVec(12.5f, 0f, 0f),
                                AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("tail",
                new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -0.6f, 0.75f),
                                AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("tail",
                new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
                                AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition MONSTER_PIE_IDLE = AnimationDefinition.Builder.withLength(1f).looping()
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.95f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.04167f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.29167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.54167f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.79167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.04167f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("body3",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.81f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.33333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.58333f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.83333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.08333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("antena",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("tail",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.81f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.33333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.58333f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.83333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.08333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet1a",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet1a",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -17.5f, 15f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, -17.5f, 15f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet2a",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet2a",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-0.57f, 18.96f, -10.76f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-0.57f, 18.96f, -10.76f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet3",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.81f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.33333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.58333f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.83333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.08333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet1b",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.95f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.041676664f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5416766f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.7916766f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.0416767f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet1b",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -17.5f, 15f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, -17.5f, 15f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet1c",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.81f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834334f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.0834333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet1c",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -17.5f, 15f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, -17.5f, 15f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet2b",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.95f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.041676664f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5416766f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.7916766f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.0416767f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet2b",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-0.57f, 18.96f, -10.76f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-0.57f, 18.96f, -10.76f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet2c",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.81f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834334f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.0834333f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("feet2c",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-0.57f, 18.96f, -10.76f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-0.57f, 18.96f, -10.76f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();
}