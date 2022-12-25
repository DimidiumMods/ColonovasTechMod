package net.colonova.colonovastechmod.blockentity.infuser;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicInfuser extends BlockEntity
{
    public BlockEntityBasicInfuser(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_INFUSER.get(), pos, state);
    }
}
