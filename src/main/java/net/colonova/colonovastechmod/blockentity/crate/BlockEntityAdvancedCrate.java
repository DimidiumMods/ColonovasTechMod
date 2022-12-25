package net.colonova.colonovastechmod.blockentity.crate;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedCrate extends BlockEntity
{
    public BlockEntityAdvancedCrate(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_CRATE.get(), pos, state);
    }
}
