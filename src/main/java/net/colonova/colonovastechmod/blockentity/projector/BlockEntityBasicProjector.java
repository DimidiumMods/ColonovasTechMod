package net.colonova.colonovastechmod.blockentity.projector;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicProjector extends BlockEntity
{
    public BlockEntityBasicProjector(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_PROJECTOR.get(), pos, state);
    }
}
