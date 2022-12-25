package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityMagicEgg extends BlockEntity
{
    public BlockEntityMagicEgg(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.MAGIC_EGG.get(), pos, state);
    }
}
