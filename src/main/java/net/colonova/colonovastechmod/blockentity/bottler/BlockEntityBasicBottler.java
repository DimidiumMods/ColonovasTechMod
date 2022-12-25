package net.colonova.colonovastechmod.blockentity.bottler;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicBottler extends BlockEntity
{
    public BlockEntityBasicBottler(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_BOTTLER.get(), pos, state);
    }
}
