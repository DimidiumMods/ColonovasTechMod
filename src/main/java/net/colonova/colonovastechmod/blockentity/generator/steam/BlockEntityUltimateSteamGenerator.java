package net.colonova.colonovastechmod.blockentity.generator.steam;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateSteamGenerator extends BlockEntity
{
    public BlockEntityUltimateSteamGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_STEAM_GENERATOR.get(), pos, state);
    }
}
