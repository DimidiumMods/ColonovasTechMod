package net.colonova.colonovastechmod.blockentity.builder;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateBuilder extends BlockEntity
{
    public BlockEntityUltimateBuilder(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_BUILDER.get(), pos, state);
    }
}
