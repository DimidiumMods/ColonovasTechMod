package net.colonova.colonovastechmod.blockentity.buffer.fluid;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateFluidBuffer extends BlockEntity
{
    public BlockEntityIntermediateFluidBuffer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_FLUID_BUFFER.get(), pos, state);
    }
}
