package net.colonova.colonovastechmod.blockentity.generator.waterwheel;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicWaterWheel extends BlockEntity
{
    public BlockEntityBasicWaterWheel(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_WATER_WHEEL.get(), pos, state);
    }
}
