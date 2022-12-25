package net.colonova.colonovastechmod.blockentity.generator.nether;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicNetherStarGenerator extends BlockEntity
{
    public BlockEntityBasicNetherStarGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_NETHER_STAR_GENERATOR.get(), pos, state);
    }
}
