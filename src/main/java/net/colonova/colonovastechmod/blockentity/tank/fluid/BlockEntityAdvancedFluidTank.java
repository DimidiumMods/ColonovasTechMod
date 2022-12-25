package net.colonova.colonovastechmod.blockentity.tank.fluid;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedFluidTank extends BlockEntity
{
    public BlockEntityAdvancedFluidTank(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_FLUID_TANK.get(), pos, state);
    }
}
