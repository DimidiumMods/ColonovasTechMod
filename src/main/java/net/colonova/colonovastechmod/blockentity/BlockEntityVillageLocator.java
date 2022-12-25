package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityVillageLocator extends BlockEntity
{

    public BlockEntityVillageLocator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.VILLAGE_LOCATOR.get(), pos, state);
    }
}
