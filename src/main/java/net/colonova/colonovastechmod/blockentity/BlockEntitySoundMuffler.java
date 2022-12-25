package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntitySoundMuffler extends BlockEntity
{
    public BlockEntitySoundMuffler(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.SOUND_MUFFLER.get(), pos, state);
    }
}
