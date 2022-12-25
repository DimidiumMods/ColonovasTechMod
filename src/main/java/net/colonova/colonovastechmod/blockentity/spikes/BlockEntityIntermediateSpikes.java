package net.colonova.colonovastechmod.blockentity.spikes;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateSpikes extends BlockEntity
{
    public BlockEntityIntermediateSpikes(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_SPIKES.get(), pos, state);
    }
}
