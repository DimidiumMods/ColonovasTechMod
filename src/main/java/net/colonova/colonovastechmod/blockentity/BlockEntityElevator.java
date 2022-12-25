package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityElevator extends BlockEntity
{
    public BlockEntityElevator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ELEVATOR.get(), pos, state);
    }
}
