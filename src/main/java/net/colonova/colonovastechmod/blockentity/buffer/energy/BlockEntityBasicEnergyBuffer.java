package net.colonova.colonovastechmod.blockentity.buffer.energy;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicEnergyBuffer extends BlockEntity
{
    public BlockEntityBasicEnergyBuffer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_ENERGY_BUFFER.get(), pos, state);
    }
}
