package net.colonova.colonovastechmod.blockentity.charger;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedCharger extends BlockEntity
{
    public BlockEntityAdvancedCharger(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_CHARGER.get(), pos, state);
    }
}
