package net.colonova.colonovastechmod.blockentity.generator.stirling;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedStirlingGenerator extends BlockEntity
{
    public BlockEntityAdvancedStirlingGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_STIRLING_GENERATOR.get(), pos, state);
    }
}
