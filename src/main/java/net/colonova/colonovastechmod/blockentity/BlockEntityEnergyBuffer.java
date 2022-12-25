package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityEnergyBuffer extends BlockEntity
{
    public BlockEntityEnergyBuffer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_ENERGY_BUFFER.get(), pos, state);
    }
}
