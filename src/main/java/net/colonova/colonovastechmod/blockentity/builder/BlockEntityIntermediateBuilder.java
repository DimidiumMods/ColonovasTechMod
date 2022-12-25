package net.colonova.colonovastechmod.blockentity.builder;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateBuilder extends BlockEntity
{
    public BlockEntityIntermediateBuilder(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_BUILDER.get(), pos, state);
    }
}
