package net.colonova.colonovastechmod.blockentity.generator.lava;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedLavaGenerator extends BlockEntity
{
    public BlockEntityAdvancedLavaGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_LAVA_GENERATOR.get(), pos, state);
    }
}
