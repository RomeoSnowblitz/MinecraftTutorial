package net.romeosnowblitz.hmh3.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class CustomEffects {

    public static StatusEffect DEATHSOMNIA;

    public static StatusEffect registerDeathsomniaEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh3.MOD_ID, name),
                new DeathsomniaEffect(StatusEffectCategory.HARMFUL, 1582940));
    }

    public static void registerEffects(){
        DEATHSOMNIA = registerDeathsomniaEffect("deathsomnia");
    }

}
