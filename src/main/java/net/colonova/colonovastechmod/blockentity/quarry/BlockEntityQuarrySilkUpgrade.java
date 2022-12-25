package net.colonova.colonovastechmod.blockentity.quarry;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityQuarrySilkUpgrade extends BlockEntity
{
    public BlockEntityQuarrySilkUpgrade(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.QUARRY_SILK_UPGRADE.get(), pos, state);
    }
}
