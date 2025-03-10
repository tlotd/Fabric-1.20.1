package net.tlotd.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.tlotd.TLOTD;

public class ModSounds {

    public static final SoundEvent ENTITY_TREX_IDLE = registerSoundEvent("entity_t-rex_idle");
    public static final SoundEvent ENTITY_TREX_HURT = registerSoundEvent("entity_t-rex_hurt");
    public static final SoundEvent ENTITY_TREX_DEATH = registerSoundEvent("entity_t-rex_death");

    public static final SoundEvent ITEM_PICKAXE_EXTRACT = registerSoundEvent("item_pickaxe_extract");

    public static final SoundEvent BLOCK_ELEVATOR_PLING = registerSoundEvent("block_elevator_pling");
    public static final SoundEvent BLOCK_RADIO_SWITCH_FREQUENCY = registerSoundEvent("block_radio_switch_frequency");
    public static final SoundEvent BLOCK_RADIO_FREQUENCY1 = registerSoundEvent("block_radio_frequency1");
    public static final SoundEvent BLOCK_RADIO_FREQUENCY2 = registerSoundEvent("block_radio_frequency2");
    public static final SoundEvent BLOCK_RADIO_FREQUENCY3 = registerSoundEvent("block_radio_frequency3");
    public static final SoundEvent BLOCK_RADIO_FREQUENCY4 = registerSoundEvent("block_radio_frequency4");

    public static final SoundEvent BLOCK_TELEVISION_SWITCH_CHANNEL = registerSoundEvent("block_television_switch_channel");
    public static final SoundEvent BLOCK_TELEVISION_STATIC_CHANNEL = registerSoundEvent("block_television_static_channel");

    public static final SoundEvent BLOCK_COMPUTER_INTERACT = registerSoundEvent("block_computer_interact");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TLOTD.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TLOTD.LOGGER.info("Registering Sounds for " + TLOTD.MOD_ID);
    }
}
