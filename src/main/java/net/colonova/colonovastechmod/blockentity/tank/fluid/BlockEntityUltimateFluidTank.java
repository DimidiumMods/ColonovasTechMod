package net.colonova.colonovastechmod.blockentity.tank.fluid;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateFluidTank extends BlockEntity
{
    public BlockEntityUltimateFluidTank(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_FLUID_TANK.get(), pos, state);
    }
}
