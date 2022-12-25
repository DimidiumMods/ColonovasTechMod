package net.colonova.colonovastechmod.blockentity.projector;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateProjector extends BlockEntity
{
    public BlockEntityIntermediateProjector(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_PROJECTOR.get(), pos, state);
    }
}
