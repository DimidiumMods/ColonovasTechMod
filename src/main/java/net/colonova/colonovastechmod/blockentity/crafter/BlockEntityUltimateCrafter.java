package net.colonova.colonovastechmod.blockentity.crafter;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateCrafter extends BlockEntity
{
    public BlockEntityUltimateCrafter(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_CRAFTER.get(), pos, state);
    }
}
