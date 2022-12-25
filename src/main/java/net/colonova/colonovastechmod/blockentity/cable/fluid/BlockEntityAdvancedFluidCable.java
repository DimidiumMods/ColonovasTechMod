package net.colonova.colonovastechmod.blockentity.cable.fluid;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedFluidCable extends BlockEntity
{
    public BlockEntityAdvancedFluidCable(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_FLUID_CABLE.get(), pos, state);
    }

    public void tick(Level level, BlockPos pos)
    {

    }
}
