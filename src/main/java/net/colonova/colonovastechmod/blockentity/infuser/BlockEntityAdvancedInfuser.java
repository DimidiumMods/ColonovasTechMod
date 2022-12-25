package net.colonova.colonovastechmod.blockentity.infuser;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedInfuser extends BlockEntity
{
    public BlockEntityAdvancedInfuser(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_INFUSER.get(), pos, state);
    }
}
