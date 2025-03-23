package com.tar.createfoodfood.entity.custom;

import com.tar.createfoodfood.entity.ModEntities;
import com.tar.createfoodfood.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.bus.api.BusBuilder;
import org.jetbrains.annotations.Nullable;

public class MonsterPieEntity extends Animal {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public int eggTime = this.random.nextInt(6000) + 6000;

    public MonsterPieEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2, p_336182_ -> p_336182_.is(ModItems.BERRY_JELLY.get()), false));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttribute(){
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20d)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.FOLLOW_RANGE, 4D);
    }


    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModItems.BERRY_JELLY.get());
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.MONSTER_PIE.get().create(level);
    }

    private void setupAnimationStates(){
        if (this.idleAnimationTimeout <= 0){
            this.idleAnimationTimeout =  20;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()){
            this.setupAnimationStates();
        }
    }

@Override
   public void aiStep() {
        super.aiStep();
        if (!this.level().isClientSide && this.isAlive() && !this.isBaby() && --this.eggTime <= 0) {
            this.playSound(SoundEvents.CHICKEN_EGG, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
            this.spawnAtLocation(ModItems.COTTON_CANDY.get());
            this.gameEvent(GameEvent.ENTITY_PLACE);
            this.eggTime = this.random.nextInt(6000) + 6000;
        }
    }
}
