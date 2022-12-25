package net.colonova.colonovastechmod.blockentity.bottler;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateBottler extends BlockEntity
{
    public BlockEntityUltimateBottler(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_BOTTLER.get(), pos, state);
    }
}
