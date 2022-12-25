package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityWitherBuilder extends BlockEntity
{

    public BlockEntityWitherBuilder(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.WITHER_BUILDER.get(), pos, state);
    }
}
