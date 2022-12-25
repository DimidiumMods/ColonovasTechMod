package net.colonova.colonovastechmod.blockentity.generator.lava;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateLavaGenerator extends BlockEntity
{
    public BlockEntityUltimateLavaGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_LAVA_GENERATOR.get(), pos, state);
    }
}
