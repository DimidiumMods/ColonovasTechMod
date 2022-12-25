package net.colonova.colonovastechmod.blockentity.portal;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAutomaticAnvil extends BlockEntity
{
    public BlockEntityAutomaticAnvil(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.AUTOMATIC_ANVIL.get(), pos, state);
    }
}