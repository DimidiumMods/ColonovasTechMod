package net.colonova.colonovastechmod.blockentity.crate;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateCrate extends BlockEntity
{
    public BlockEntityIntermediateCrate(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_CRATE.get(), pos, state);
    }
}
