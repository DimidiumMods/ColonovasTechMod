package net.colonova.colonovastechmod.blockentity.generator.windmill;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateWindmill extends BlockEntity
{
    public BlockEntityIntermediateWindmill(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_WINDMILL.get(), pos, state);
    }
}
