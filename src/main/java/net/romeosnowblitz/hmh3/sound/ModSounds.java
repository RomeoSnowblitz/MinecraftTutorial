package net.romeosnowblitz.hmh3.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class ModSounds extends SoundEvents {

    public static SoundEvent SOUND_BREAK = register("sound_break");
    public static SoundEvent SOUND_STEP = register("sound_step");
    public static SoundEvent SOUND_PLACE = register("sound_place");
    public static SoundEvent SOUND_HIT = register("sound_hit");
    public static SoundEvent SOUND_FALL = register("sound_fall");

    public static SoundEvent SINGLE_SOUND = register("single_sound");


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
