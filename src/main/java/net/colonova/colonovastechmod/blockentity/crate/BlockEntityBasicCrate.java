package net.colonova.colonovastechmod.blockentity.crate;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicCrate extends BlockEntity
{
    public BlockEntityBasicCrate(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_CRATE.get(), pos, state);
    }
}
