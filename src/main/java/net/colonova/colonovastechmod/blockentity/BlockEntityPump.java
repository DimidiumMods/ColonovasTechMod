package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityPump extends BlockEntity
{

    public BlockEntityPump(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.PUMP.get(), pos, state);
    }
}
