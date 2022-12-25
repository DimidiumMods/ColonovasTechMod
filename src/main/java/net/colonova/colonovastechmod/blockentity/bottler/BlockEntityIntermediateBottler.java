package net.colonova.colonovastechmod.blockentity.bottler;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateBottler extends BlockEntity
{
    public BlockEntityIntermediateBottler(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_BOTTLER.get(), pos, state);
    }
}
