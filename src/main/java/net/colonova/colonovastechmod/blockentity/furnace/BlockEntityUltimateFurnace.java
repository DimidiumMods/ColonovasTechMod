package net.colonova.colonovastechmod.blockentity.furnace;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateFurnace extends BlockEntity
{
    public BlockEntityUltimateFurnace(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_FURNACE.get(), pos, state);
    }
}
