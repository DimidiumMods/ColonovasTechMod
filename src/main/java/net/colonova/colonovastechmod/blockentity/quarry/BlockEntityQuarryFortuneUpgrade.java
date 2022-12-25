package net.colonova.colonovastechmod.blockentity.quarry;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityQuarryFortuneUpgrade extends BlockEntity
{
    public BlockEntityQuarryFortuneUpgrade(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.QUARRY_FORTUNE_UPGRADE.get(), pos, state);
    }
}
