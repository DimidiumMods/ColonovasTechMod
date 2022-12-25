package net.colonova.colonovastechmod.blockentity.tank.gas;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateGasTank extends BlockEntity
{
    public BlockEntityIntermediateGasTank(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_GAS_TANK.get(), pos, state);
    }
}
