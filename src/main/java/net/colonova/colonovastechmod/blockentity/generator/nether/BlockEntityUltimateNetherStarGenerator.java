package net.colonova.colonovastechmod.blockentity.generator.nether;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateNetherStarGenerator extends BlockEntity
{
    public BlockEntityUltimateNetherStarGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_NETHER_STAR_GENERATOR.get(), pos, state);
    }
}
