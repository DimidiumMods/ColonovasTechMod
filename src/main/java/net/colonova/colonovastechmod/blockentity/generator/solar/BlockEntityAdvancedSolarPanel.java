package net.colonova.colonovastechmod.blockentity.generator.solar;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityAdvancedSolarPanel extends BlockEntity
{
    public BlockEntityAdvancedSolarPanel(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ADVANCED_SOLAR_PANEL.get(), pos, state);
    }
}
