package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntitySpawner extends BlockEntity
{
    public BlockEntitySpawner(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.SPAWNER.get(), pos, state);
    }
}
