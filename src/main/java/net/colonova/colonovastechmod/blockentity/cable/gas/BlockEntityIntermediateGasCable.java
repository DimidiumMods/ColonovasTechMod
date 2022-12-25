package net.colonova.colonovastechmod.blockentity.cable.gas;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateGasCable extends BlockEntity
{
    public BlockEntityIntermediateGasCable(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_GAS_CABLE.get(), pos, state);
    }

    public void tick(Level level, BlockPos pos)
    {

    }
}
