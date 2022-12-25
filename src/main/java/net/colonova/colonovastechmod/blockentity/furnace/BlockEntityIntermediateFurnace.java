package net.colonova.colonovastechmod.blockentity.furnace;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateFurnace extends BlockEntity
{
    public BlockEntityIntermediateFurnace(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_FURNACE.get(), pos, state);
    }
}
