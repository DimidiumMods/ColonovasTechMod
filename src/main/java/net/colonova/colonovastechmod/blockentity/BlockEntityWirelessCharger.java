package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityWirelessCharger extends BlockEntity
{

    public BlockEntityWirelessCharger(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.WIRELESS_CHARGER.get(), pos, state);
    }
}
