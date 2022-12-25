package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.CableType;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

public class BlockEnergyBuffer extends BlockBase //implements EntityBlock, IMachineBlock
{
    private final MachineType machineType;

    public BlockEnergyBuffer(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType)
    {
        super(material, hardness, resistance, soundType);

        this.machineType = machineType;
    }

/*    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_)
    {
        return null;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_153212_, BlockState p_153213_, BlockEntityType<T> p_153214_)
    {
        return EntityBlock.super.getTicker(p_153212_, p_153213_, p_153214_);
    }*/

/*    @Override
    public MachineType getMachineType()
    {
        return machineType;
    }*/
}
