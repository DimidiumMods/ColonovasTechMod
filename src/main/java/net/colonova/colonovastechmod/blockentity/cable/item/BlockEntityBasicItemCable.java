package net.colonova.colonovastechmod.blockentity.cable.item;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicItemCable extends BlockEntity
{

    public BlockEntityBasicItemCable(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_ITEM_CABLE.get(), pos, state);
    }

    public void tick(Level level, BlockPos pos)
    {

    }
}
