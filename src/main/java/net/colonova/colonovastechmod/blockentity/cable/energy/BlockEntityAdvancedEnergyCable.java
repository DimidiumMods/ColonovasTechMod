package net.colonova.colonovastechmod.blockentity.cable.energy;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedEnergyCable extends BlockEntity
{
    public BlockEntityAdvancedEnergyCable(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_ENERGY_CABLE.get(), pos, state);
    }

    public void tick(Level level, BlockPos pos)
    {

    }
}
