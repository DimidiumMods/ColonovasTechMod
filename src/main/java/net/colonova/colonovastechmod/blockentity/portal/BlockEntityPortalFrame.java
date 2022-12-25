package net.colonova.colonovastechmod.blockentity.portal;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityPortalFrame extends BlockEntity
{
    public BlockEntityPortalFrame(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.PORTAL_FRAME.get(), pos, state);
    }
}
