package net.colonova.colonovastechmod.blockentity.crafter;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateCrafter extends BlockEntity
{
    public BlockEntityIntermediateCrafter(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_CRAFTER.get(), pos, state);
    }
}
