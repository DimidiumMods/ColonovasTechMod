package net.colonova.colonovastechmod.blockentity.storage.energy;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedEnergyStorage extends BlockEntity
{
    public BlockEntityAdvancedEnergyStorage(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_ENERGY_STORAGE.get(), pos, state);
    }
}
