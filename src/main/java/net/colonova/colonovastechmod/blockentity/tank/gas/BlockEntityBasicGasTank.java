package net.colonova.colonovastechmod.blockentity.tank.gas;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicGasTank extends BlockEntity
{
    public BlockEntityBasicGasTank(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_GAS_TANK.get(), pos, state);
    }
}
