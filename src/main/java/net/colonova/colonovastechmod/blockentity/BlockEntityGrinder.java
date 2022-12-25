package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityGrinder extends BlockEntity
{
    public BlockEntityGrinder(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.GRINDER.get(), pos, state);
    }
}
