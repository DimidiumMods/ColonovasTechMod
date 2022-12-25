package net.colonova.colonovastechmod.blockentity.generator.windmill;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicWindmill extends BlockEntity
{
    public BlockEntityBasicWindmill(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_WINDMILL.get(), pos, state);
    }
}
