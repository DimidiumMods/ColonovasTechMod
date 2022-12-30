package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.core.Registry;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class BiomeRegistry
{
    private static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(Registry.BIOME_REGISTRY, Reference.MOD_ID);

    private static final RegistryObject<Biome> THE_VOID = BIOMES.register("the_void", () -> new Biome.BiomeBuilder()
            .temperature(1F)
            .downfall(0.0F)
            .precipitation(Biome.Precipitation.NONE)
            .temperatureAdjustment(Biome.TemperatureModifier.NONE)
            .specialEffects(new BiomeSpecialEffects.Builder()
                    .skyColor(8103167)
                    .fogColor(12638463)
                    .waterColor(4445678)
                    .waterFogColor(270131)
                    .build())
            .mobSpawnSettings(new MobSpawnSettings.Builder().build())
            .generationSettings(new BiomeGenerationSettings.Builder().build())
            .build());

    public static void registerDimensionTypes()
    {
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
