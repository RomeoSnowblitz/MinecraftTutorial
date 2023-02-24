package net.romeosnowblitz.hmh3.item;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class BrickShovel extends ShovelItem {
    public BrickShovel(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if(!super.postMine(stack, world, state, pos, miner)){
            return false;
        }
        StatusEffectInstance statusEffectInstance = miner.getStatusEffect(StatusEffects.HASTE);
        int i = 1;
        if (statusEffectInstance != null) {
            i += statusEffectInstance.getAmplifier();
            miner.removeStatusEffectInternal(StatusEffects.HASTE);
        } else {
            --i;
        }
        i = MathHelper.clamp(i, 0, 255);
        StatusEffectInstance statusEffectInstance2 = new StatusEffectInstance(StatusEffects.HASTE, 100, i);
        if(!world.getGameRules().getBoolean(GameRules.DISABLE_RAIDS)) {
            miner.addStatusEffect(statusEffectInstance2);
        }
        stack.damage(1, miner, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));

        return true;
    }

}
