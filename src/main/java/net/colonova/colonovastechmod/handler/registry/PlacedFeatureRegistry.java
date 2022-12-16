package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.util.Reference;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class PlacedFeatureRegistry
{
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Reference.MOD_ID);

    private static final RegistryObject<PlacedFeature> ALUMINIUM_ORE =  PLACED_FEATURES.register("aluminium_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.ALUMINIUM_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(40), new VerticalAnchor.AboveBottom(75))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_ALUMINIUM_ORE = PLACED_FEATURES.register("deepslate_aluminium_ore_placed",
            ()  ->  new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_ALUMINIUM_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-64), VerticalAnchor.aboveBottom(-29))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> COPPER_ORE_PLACED = PLACED_FEATURES.register("copper_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.COPPER_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(40), new VerticalAnchor.AboveBottom(75))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_COPPER_ORE_PLACED = PLACED_FEATURES.register("deepslate_copper_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_COPPER_ORE.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-55), new VerticalAnchor.AboveBottom( -20))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> IRIDIUM_ORE_PLACED = PLACED_FEATURES.register("iridium_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.IRIDIUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(5), new VerticalAnchor.AboveBottom(30))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_IRIDIUM_ORE_PLACED = PLACED_FEATURES.register("deepslate_iridium_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_IRIDIUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-59), new VerticalAnchor.AboveBottom(-34))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> LEAD_ORE_PLACED = PLACED_FEATURES.register("lead_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.LEAD_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(10), new VerticalAnchor.AboveBottom( 35))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_LEAD_ORE_PLACED = PLACED_FEATURES.register("deepslate_lead_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_LEAD_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-54), new VerticalAnchor.AboveBottom(-29))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> NICKEL_ORE_PLACED = PLACED_FEATURES.register("nickel_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.NICKEL_ORE.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(5),  new VerticalAnchor.AboveBottom(20))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_NICKEL_ORE_PLACED = PLACED_FEATURES.register("deepslate_nickel_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_NICKEL_ORE.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom( -49), new VerticalAnchor.AboveBottom(-34))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> PLATINUM_ORE_PLACED = PLACED_FEATURES.register("platinum_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.PLATINUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(5), new VerticalAnchor.AboveBottom(30))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_PLATINUM_ORE_PLACED = PLACED_FEATURES.register("deepslate_platinum_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_PLATINUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-59), new VerticalAnchor.AboveBottom(-34))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.SILVER_ORE.getHolder().get(),
                    commonOrePlacement(6, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(5),  new VerticalAnchor.AboveBottom(30))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_SILVER_ORE_PLACED = PLACED_FEATURES.register("deepslate_silver_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_SILVER_ORE.getHolder().get(),
                    commonOrePlacement(6,  HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-59), new VerticalAnchor.AboveBottom(-34))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> TIN_ORE_PLACED = PLACED_FEATURES.register("tin_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.TIN_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(20), new VerticalAnchor.AboveBottom( 55))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_TIN_ORE_PLACED = PLACED_FEATURES.register("deepslate_tin_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_TIN_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-29), new VerticalAnchor.AboveBottom(-5))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> URANIUM_ORE_PLACED = PLACED_FEATURES.register("uranium_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.URANIUM_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(5), new VerticalAnchor.AboveBottom(30))
                    )
            )
    );

    public static final RegistryObject<PlacedFeature> DEEP_SLATE_URANIUM_ORE_PLACED = PLACED_FEATURES.register("deepslate_uranium_ore_placed",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_URANIUM_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(new VerticalAnchor.AboveBottom(-59), new VerticalAnchor.AboveBottom(-34))
                    )
            )
    );

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_)
    {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_)
    {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void registerPlacedFeatures()
    {
        PLACED_FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
