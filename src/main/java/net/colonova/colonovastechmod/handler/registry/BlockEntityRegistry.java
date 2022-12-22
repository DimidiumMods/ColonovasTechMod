package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.blockentity.*;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityRegistry
{
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Reference.MOD_ID);

    public static final RegistryObject<BlockEntityType<BlockEntityHealer>> HEALER = BLOCK_ENTITIES.register("healer", () -> BlockEntityType.Builder.of(BlockEntityHealer::new, BlockRegistry.HEALER.get()).build(null));

    public static void registerBlockEntities()
    {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
