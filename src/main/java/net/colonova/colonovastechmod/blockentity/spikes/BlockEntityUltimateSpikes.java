package net.colonova.colonovastechmod.blockentity.spikes;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateSpikes extends BlockEntity
{
    public BlockEntityUltimateSpikes(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_SPIKES.get(), pos, state);
    }
}
