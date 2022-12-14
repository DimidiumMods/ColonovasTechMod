package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.effect.AntiRadiationEffect;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectRegistry
{
    private static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Reference.MOD_ID);

    public static final RegistryObject<MobEffect> ANTI_RADIATION = EFFECTS.register("anti_radiation", AntiRadiationEffect::new);

    public static void registerEffects()
    {
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
