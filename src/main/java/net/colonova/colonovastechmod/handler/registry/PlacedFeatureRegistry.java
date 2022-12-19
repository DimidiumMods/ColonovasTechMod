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
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Reference.MOD_ID);

    private static final RegistryObject<PlacedFeature> ALUMINIUM_ORE =  PLACED_FEATURES.register("aluminium_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.ALUMINIUM_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.belowTop(75))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_ALUMINIUM_ORE = PLACED_FEATURES.register("deepslate_aluminium_ore",
            ()  ->  new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_ALUMINIUM_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.belowTop(-64))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> COPPER_ORE = PLACED_FEATURES.register("copper_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.COPPER_ORE.getHolder().get(),
                    commonOrePlacement(10,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.belowTop(75))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_COPPER_ORE = PLACED_FEATURES.register("deepslate_copper_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_COPPER_ORE.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-55), VerticalAnchor.belowTop( -20))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> IRIDIUM_ORE = PLACED_FEATURES.register("iridium_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.IRIDIUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(30))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_IRIDIUM_ORE = PLACED_FEATURES.register("deepslate_iridium_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_IRIDIUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-59), VerticalAnchor.belowTop(-34))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> LEAD_ORE = PLACED_FEATURES.register("lead_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.LEAD_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop( 35))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_LEAD_ORE = PLACED_FEATURES.register("deepslate_lead_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_LEAD_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-54), VerticalAnchor.belowTop(-29))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> NICKEL_ORE = PLACED_FEATURES.register("nickel_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.NICKEL_ORE.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5),  VerticalAnchor.belowTop(20))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_NICKEL_ORE = PLACED_FEATURES.register("deepslate_nickel_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_NICKEL_ORE.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( -49), VerticalAnchor.belowTop(-34))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> PLATINUM_ORE = PLACED_FEATURES.register("platinum_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.PLATINUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(30))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_PLATINUM = PLACED_FEATURES.register("deepslate_platinum_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_PLATINUM_ORE.getHolder().get(),
                    rareOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-59), VerticalAnchor.belowTop(-34))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> SILVER_ORE = PLACED_FEATURES.register("silver_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.SILVER_ORE.getHolder().get(),
                    commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5),  VerticalAnchor.belowTop(30))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_SILVER_ORE = PLACED_FEATURES.register("deepslate_silver_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_SILVER_ORE.getHolder().get(),
                    commonOrePlacement(6,  HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-59), VerticalAnchor.belowTop(-34))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> TIN_ORE = PLACED_FEATURES.register("tin_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.TIN_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(55))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_TIN_ORE = PLACED_FEATURES.register("deepslate_tin_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_TIN_ORE.getHolder().get(),
                    commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-29), VerticalAnchor.belowTop(-5))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> URANIUM_ORE = PLACED_FEATURES.register("uranium_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.URANIUM_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(30))
                    )
            )
    );

    private static final RegistryObject<PlacedFeature> DEEP_SLATE_URANIUM_ORE = PLACED_FEATURES.register("deepslate_uranium_ore",
            () -> new PlacedFeature(ConfiguredFeatureRegistry.DEEP_SLATE_URANIUM_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-59), VerticalAnchor.belowTop(-34))
                    )
            )
    );

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_)
    {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_)
    {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public
    static void registerPlacedFeatures()
    {
        PLACED_FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}