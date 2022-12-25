package net.colonova.colonovastechmod.blockentity.generator.ender;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicEnderGenerator extends BlockEntity
{
    public BlockEntityBasicEnderGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_ENDER_GENERATOR.get(), pos, state);
    }
}
