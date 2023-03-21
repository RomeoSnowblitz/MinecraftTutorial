package net.romeosnowblitz.hmh3.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DeathsomniaEffect extends StatusEffect {
    protected DeathsomniaEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.DEATHSOMNIA) {
            if (entity.isSleeping()) {
                entity.kill();
            }
        }
    }


    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == CustomEffects.DEATHSOMNIA) {
            int i = 50 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
            return true;
        }
        return false;
    }


}
