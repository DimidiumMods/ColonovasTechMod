package net.colonova.colonovastechmod.blockentity.generator.steam;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicSteamGenerator extends BlockEntity
{
    public BlockEntityBasicSteamGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_STEAM_GENERATOR.get(), pos, state);
    }
}
