package net.colonova.colonovastechmod.block.machine.cable;

import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.CableType;
import net.colonova.colonovastechmod.util.ICable;
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

public class BlockVoidCable extends BlockCableBase implements EntityBlock, ICable, IMachineBlock
{
    private final MachineType machineType;
    private final boolean canInput;
    private final boolean canExtract;
    private final int minInput;
    private final int maxInput;
    private final int minExtract;
    private final int maxExtract;
    private final CableType cableType;

    public BlockVoidCable(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType, boolean canInput, boolean canExtract, int minInput, int maxInput, int minExtract, int maxExtract, CableType cableType)
    {
        super(material, hardness, resistance, soundType, machineType);

        this.machineType = machineType;
        this.canInput = canInput;
        this.canExtract = canExtract;
        this.minInput = minInput;
        this.maxInput = maxInput;
        this.minExtract = minExtract;
        this.maxExtract = maxExtract;
        this.cableType = cableType;
    }

    @Nullable
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
    }

    @Override
    public boolean canInput()
    {
        return canInput;
    }

    @Override
    public boolean canExtract()
    {
        return canExtract;
    }

    @Override
    public int minInput()
    {
        return minInput;
    }

    @Override
    public int maxInput()
    {
        return maxInput;
    }

    @Override
    public int minExtract()
    {
        return minExtract;
    }

    @Override
    public int maxExtract()
    {
        return maxExtract;
    }

    @Override
    public CableType getCableType()
    {
        return cableType;
    }

    @Override
    public MachineType getMachineType()
    {
        return machineType;
    }
}
