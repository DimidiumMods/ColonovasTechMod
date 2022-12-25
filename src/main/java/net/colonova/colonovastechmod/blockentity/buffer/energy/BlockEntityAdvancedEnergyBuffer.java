package net.colonova.colonovastechmod.blockentity.buffer.energy;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedEnergyBuffer extends BlockEntity
{
    public BlockEntityAdvancedEnergyBuffer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_ENERGY_BUFFER.get(), pos, state);
    }
}
