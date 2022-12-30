package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.effect.*;
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
    public static final RegistryObject<MobEffect> BREEDING = EFFECTS.register("breeding", EffectBreeding::new);
    public static final RegistryObject<MobEffect> ENTITY_PULLER = EFFECTS.register("entity_puller", EffectEntityPuller::new);
    public static final RegistryObject<MobEffect> FLIGHT = EFFECTS.register("flight", EffectFlight::new);
    public static final RegistryObject<MobEffect> FREEZE = EFFECTS.register("freeze", EffectFreeze::new);
    public static final RegistryObject<MobEffect> GREEN_THUMB = EFFECTS.register("green_thumb", EffectGreenThumb::new);
    public static final RegistryObject<MobEffect> MAGNETIZATION = EFFECTS.register("magnetization", EffectMagnetization::new);
    public static final RegistryObject<MobEffect> STEP_ASSIST = EFFECTS.register("step_assist", AntiRadiationEffect::new);

    public static void registerEffects()
    {
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
