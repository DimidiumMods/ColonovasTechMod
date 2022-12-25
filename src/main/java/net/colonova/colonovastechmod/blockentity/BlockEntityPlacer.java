package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityPlacer extends BlockEntity
{
    public BlockEntityPlacer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.PLACER.get(), pos, state);
    }
}
