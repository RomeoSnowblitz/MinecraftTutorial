package net.romeosnowblitz.hmh3.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class ModFluidBlock extends FluidBlock {
    public ModFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                if (!livingEntity.isInvulnerableTo(DamageSource.WITHER)) {
                    livingEntity.removeStatusEffect(StatusEffects.WEAKNESS);
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 4));
                }
            }

        }
    }

}
