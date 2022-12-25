package net.colonova.colonovastechmod.blockentity.drum;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateDrum extends BlockEntity
{
    public BlockEntityUltimateDrum(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_DRUM.get(), pos, state);
    }
}
