package net.colonova.colonovastechmod.handler.registry;

import com.google.common.base.Suppliers;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfiguredFeatureRegistry
{
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Reference.MOD_ID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> ALUMINIUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.ALUMINIUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_ALUMINIUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> COPPER_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.COPPER_ORE.get().defaultBlockState()))
    );
    
    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_COPPER_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_COPPER_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> IRIDIUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.IRIDIUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_IRIDIUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> LEAD_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.LEAD_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_LEAD_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_LEAD_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> NICKEL_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.NICKEL_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_NICKEL_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_NICKEL_ORE.get().defaultBlockState()))
    );
    
    private static final Supplier<List<OreConfiguration.TargetBlockState>> PLATINUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.PLATINUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_PLATINUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> SILVER_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.SILVER_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_SILVER_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_SILVER_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> TIN_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.TIN_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_TIN_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_TIN_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> URANIUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.URANIUM_ORE.get().defaultBlockState()))
    );

    private static final Supplier<List<OreConfiguration.TargetBlockState>> DEEP_SLATE_URANIUM_ORE_CONFIGURATION = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_URANIUM_ORE.get().defaultBlockState()))
    );

    public static final RegistryObject<ConfiguredFeature<?, ?>> ALUMINIUM_ORE = CONFIGURED_FEATURES.register("aluminium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ALUMINIUM_ORE_CONFIGURATION.get(), 6)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_ALUMINIUM_ORE = CONFIGURED_FEATURES.register("deepslate_aluminium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_ALUMINIUM_ORE_CONFIGURATION.get(), 6)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> COPPER_ORE = CONFIGURED_FEATURES.register("copper_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(COPPER_ORE_CONFIGURATION.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_COPPER_ORE = CONFIGURED_FEATURES.register("deepslate_copper_ores", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_COPPER_ORE_CONFIGURATION.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> IRIDIUM_ORE = CONFIGURED_FEATURES.register("iridium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(IRIDIUM_ORE_CONFIGURATION.get(), 2)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_IRIDIUM_ORE = CONFIGURED_FEATURES.register("deepslate_iridium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_IRIDIUM_ORE_CONFIGURATION.get(), 2)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LEAD_ORE = CONFIGURED_FEATURES.register("lead_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(LEAD_ORE_CONFIGURATION.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_LEAD_ORE = CONFIGURED_FEATURES.register("deepslate_lead_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_LEAD_ORE_CONFIGURATION.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NICKEL_ORE = CONFIGURED_FEATURES.register("nickel_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NICKEL_ORE_CONFIGURATION.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_NICKEL_ORE = CONFIGURED_FEATURES.register("deepslate_nickel_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_NICKEL_ORE_CONFIGURATION.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PLATINUM_ORE = CONFIGURED_FEATURES.register("platinum_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(PLATINUM_ORE_CONFIGURATION.get(), 3)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_PLATINUM_ORE = CONFIGURED_FEATURES.register("deepslate_platinum_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_PLATINUM_ORE_CONFIGURATION.get(), 3)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SILVER_ORE_CONFIGURATION.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_SILVER_ORE = CONFIGURED_FEATURES.register("deepslate_silver_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_SILVER_ORE_CONFIGURATION.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TIN_ORE_CONFIGURATION.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_TIN_ORE = CONFIGURED_FEATURES.register("deepslate_tin_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_TIN_ORE_CONFIGURATION.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> URANIUM_ORE = CONFIGURED_FEATURES.register("uranium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(URANIUM_ORE_CONFIGURATION.get(), 2)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEP_SLATE_URANIUM_ORE = CONFIGURED_FEATURES.register("deepslate_uranium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEP_SLATE_URANIUM_ORE_CONFIGURATION.get(), 2)));


    public static void registerConfiguredFeatures()
    {
        CONFIGURED_FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
