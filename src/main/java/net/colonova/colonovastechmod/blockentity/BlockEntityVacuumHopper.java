package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityVacuumHopper extends BlockEntity
{

    public BlockEntityVacuumHopper(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.VACUUM_HOPPER.get(), pos, state);
    }
}
