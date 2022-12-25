package net.colonova.colonovastechmod.blockentity.furnace;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicFurnace extends BlockEntity
{
    public BlockEntityBasicFurnace(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_FURNACE.get(), pos, state);
    }
}
