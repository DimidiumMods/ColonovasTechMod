package net.colonova.colonovastechmod.blockentity.portal;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityPortalController extends BlockEntity
{
    public BlockEntityPortalController(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.PORTAL_CONTROLLER.get(), pos, state);
    }
}
