package net.colonova.colonovastechmod.blockentity.generator.waterwheel;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateWaterWheel extends BlockEntity
{
    public BlockEntityIntermediateWaterWheel(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_WATER_WHEEL.get(), pos, state);
    }
}
