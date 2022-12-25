package net.colonova.colonovastechmod.blockentity.builder;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedBuilder extends BlockEntity
{
    public BlockEntityAdvancedBuilder(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_BUILDER.get(), pos, state);
    }
}
