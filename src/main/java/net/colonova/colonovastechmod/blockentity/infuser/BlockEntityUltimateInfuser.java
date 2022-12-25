package net.colonova.colonovastechmod.blockentity.infuser;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateInfuser extends BlockEntity
{
    public BlockEntityUltimateInfuser(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_INFUSER.get(), pos, state);
    }
}
