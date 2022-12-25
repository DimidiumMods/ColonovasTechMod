package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityPaintCan extends BlockEntity
{
    public BlockEntityPaintCan(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.PAINT_CAN.get(), pos, state);
    }
}
