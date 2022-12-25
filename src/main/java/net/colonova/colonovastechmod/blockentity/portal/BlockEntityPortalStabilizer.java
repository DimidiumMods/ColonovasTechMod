package net.colonova.colonovastechmod.blockentity.portal;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityPortalStabilizer extends BlockEntity
{
    public BlockEntityPortalStabilizer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.PORTAL_STABILIZER.get(), pos, state);
    }
}
