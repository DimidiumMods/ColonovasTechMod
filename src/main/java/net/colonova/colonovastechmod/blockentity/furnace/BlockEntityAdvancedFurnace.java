package net.colonova.colonovastechmod.blockentity.furnace;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedFurnace extends BlockEntity
{
    public BlockEntityAdvancedFurnace(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_FURNACE.get(), pos, state);
    }
}
