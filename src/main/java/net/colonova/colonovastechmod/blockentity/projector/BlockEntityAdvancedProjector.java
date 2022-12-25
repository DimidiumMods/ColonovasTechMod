package net.colonova.colonovastechmod.blockentity.projector;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedProjector extends BlockEntity
{
    public BlockEntityAdvancedProjector(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_PROJECTOR.get(), pos, state);
    }
}
