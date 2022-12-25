package net.colonova.colonovastechmod.blockentity.generator.waterwheel;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateWaterWheel extends BlockEntity
{
    public BlockEntityUltimateWaterWheel(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_WATER_WHEEL.get(), pos, state);
    }
}
