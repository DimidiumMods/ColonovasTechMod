package net.colonova.colonovastechmod.blockentity.generator.solar;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicSolarPanel extends BlockEntity
{
    public BlockEntityBasicSolarPanel(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_SOLAR_PANEL.get(), pos, state);
    }
}
