package com.invalid.amongusmobs.sounds;

import com.invalid.amongusmobs.Amogus;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundRegister {
    public static Identifier amogusSoundId = new Identifier(Amogus.MOD_ID, "amogus_remix");
    public static SoundEvent amogusSoundEvent = new SoundEvent(amogusSoundId);

    public static void registerSounds() {
        Registry.register(Registry.SOUND_EVENT, amogusSoundId, amogusSoundEvent);
    }
}
