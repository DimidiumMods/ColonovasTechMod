package net.colonova.colonovastechmod.blockentity.tank.gas;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateGasTank extends BlockEntity
{
    public BlockEntityUltimateGasTank(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_GAS_TANK.get(), pos, state);
    }
}
