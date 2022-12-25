package net.colonova.colonovastechmod.blockentity.quarry;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityQuarrySpeedUpgrade extends BlockEntity
{
    public BlockEntityQuarrySpeedUpgrade(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.QUARRY_SPEED_UPGRADE.get(), pos, state);
    }
}
