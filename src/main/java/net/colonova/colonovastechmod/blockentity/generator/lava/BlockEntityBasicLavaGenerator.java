package net.colonova.colonovastechmod.blockentity.generator.lava;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicLavaGenerator extends BlockEntity
{
    public BlockEntityBasicLavaGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_LAVA_GENERATOR.get(), pos, state);
    }
}
