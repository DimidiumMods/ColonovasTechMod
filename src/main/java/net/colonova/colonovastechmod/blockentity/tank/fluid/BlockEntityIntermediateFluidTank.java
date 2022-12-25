package net.colonova.colonovastechmod.blockentity.tank.fluid;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateFluidTank extends BlockEntity
{
    public BlockEntityIntermediateFluidTank(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_FLUID_TANK.get(), pos, state);
    }
}
