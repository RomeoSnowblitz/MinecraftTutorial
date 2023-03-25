package net.romeosnowblitz.hmh3.sound;

import net.minecraft.block.BlockState;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class ModSounds extends SoundEvents {

    public static SoundEvent ENTITY_AMBIENT = register("entity_ambient");
    public static SoundEvent ENTITY_HURT = register("entity_hurt");
    public static SoundEvent ENTITY_DEATH = register("entity_death");
    public static SoundEvent ENTITY_STEP = register("entity_step");

    public static SoundEvent SOUND_BREAK = register("sound_break");
    public static SoundEvent SOUND_STEP = register("sound_step");
    public static SoundEvent SOUND_PLACE = register("sound_place");
    public static SoundEvent SOUND_HIT = register("sound_hit");
    public static SoundEvent SOUND_FALL = register("sound_fall");

    public static SoundEvent SINGLE_SOUND = register("single_sound");
    public static SoundEvent BLEM = register("blem");
    public static SoundEvent SNAP = register("snap");
    public static SoundEvent RAINDROP = register("raindrop");

    public static final BlockSoundGroup SOUND_BLOCK = new BlockSoundGroup(1.0f, 1.0f,
            ModSounds.SOUND_BREAK, ModSounds.SOUND_STEP, ModSounds.SOUND_PLACE, ModSounds.SOUND_HIT, ModSounds.SOUND_FALL);


    private static SoundEvent register(String name) {
        return register(new Identifier(Hmh3.MOD_ID, name));
    }

    private static SoundEvent register(Identifier id) {
        return register(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    public static void registerSounds(){System.out.println("Registering Mod Sounds for " + Hmh3.MOD_ID);}

}
