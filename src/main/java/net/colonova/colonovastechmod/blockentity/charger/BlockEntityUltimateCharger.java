package net.colonova.colonovastechmod.blockentity.charger;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateCharger extends BlockEntity
{
    public BlockEntityUltimateCharger(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_CHARGER.get(), pos, state);
    }
}
