package net.colonova.colonovastechmod.blockentity.buffer.energy;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateEnergyBuffer extends BlockEntity
{
    public BlockEntityUltimateEnergyBuffer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_ENERGY_BUFFER.get(), pos, state);
    }
}
