package net.colonova.colonovastechmod.blockentity.quarry;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityQuarry extends BlockEntity
{
    public BlockEntityQuarry(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.QUARRY.get(), pos, state);
    }
}
