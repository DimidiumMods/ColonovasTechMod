package net.colonova.colonovastechmod.blockentity.charger;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateCharger extends BlockEntity
{
    public BlockEntityIntermediateCharger(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_CHARGER.get(), pos, state);
    }
}
