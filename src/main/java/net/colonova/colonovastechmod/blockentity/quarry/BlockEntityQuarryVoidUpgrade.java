package net.colonova.colonovastechmod.blockentity.quarry;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityQuarryVoidUpgrade extends BlockEntity
{

    public BlockEntityQuarryVoidUpgrade(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.QUARRY_VOID_UPGRADE.get(), pos, state);
    }
}
