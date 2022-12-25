package net.colonova.colonovastechmod.blockentity.projector;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateProjector extends BlockEntity
{
    public BlockEntityUltimateProjector(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_PROJECTOR.get(), pos, state);
    }
}
