package net.colonova.colonovastechmod.blockentity.drum;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateDrum extends BlockEntity
{
    public BlockEntityIntermediateDrum(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_DRUM.get(), pos, state);
    }
}
