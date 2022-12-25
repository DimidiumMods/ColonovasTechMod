package net.colonova.colonovastechmod.blockentity.buffer.fluid;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateFluidBuffer extends BlockEntity
{
    public BlockEntityUltimateFluidBuffer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_FLUID_BUFFER.get(), pos, state);
    }
}
