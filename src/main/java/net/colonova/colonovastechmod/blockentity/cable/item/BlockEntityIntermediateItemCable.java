package net.colonova.colonovastechmod.blockentity.cable.item;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateItemCable extends BlockEntity
{
    public BlockEntityIntermediateItemCable(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_ITEM_CABLE.get(), pos, state);
    }

    public void tick(Level level, BlockPos pos)
    {

    }
}
