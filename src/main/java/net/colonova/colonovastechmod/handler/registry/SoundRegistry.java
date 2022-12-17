package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry
{
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> WRENCH_USE = SOUNDS.register("slime_locator_ping", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "wrench_use")));

    public static void registerSounds()
    {
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
