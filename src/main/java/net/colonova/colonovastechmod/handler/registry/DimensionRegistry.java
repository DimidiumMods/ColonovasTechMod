package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.OptionalLong;

public class DimensionRegistry
{
    private static final DeferredRegister<DimensionType> DIMENSION_TYPES = DeferredRegister.create(Registry.DIMENSION_TYPE_REGISTRY, Reference.MOD_ID);

    private static final RegistryObject<DimensionType> THE_VOID = DIMENSION_TYPES.register("the_void", () -> new DimensionType(OptionalLong.of(12000),
            true,
            false,
            true,
            true,
            1.0D,
            false,
            false,
            -32,
            384,
            384,
            BlockTags.INFINIBURN_NETHER,
            BuiltinDimensionTypes.NETHER_EFFECTS,
            1.0F,
            new DimensionType.MonsterSettings(false, false, UniformInt.of(0,0) ,0)
    ));

    public static void registerDimensionTypes()
    {
        DIMENSION_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
