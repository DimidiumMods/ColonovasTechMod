package net.colonova.colonovastechmod.blockentity.drum;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicDrum extends BlockEntity
{
    public BlockEntityBasicDrum(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_DRUM.get(), pos, state);
    }
}
