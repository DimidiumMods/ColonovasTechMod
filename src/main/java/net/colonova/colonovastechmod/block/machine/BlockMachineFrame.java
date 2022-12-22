package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;

import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockMachineFrame extends BlockBase implements IMachineBlock
{
    private final MachineType machineType;

    public BlockMachineFrame(MachineType machineType)
    {
        super(Material.METAL, 10.0F, 100.0F, SoundType.METAL);
        this.machineType = machineType;
    }

    @Override
    public MachineType getMachineType(MachineType type)
    {
        return this.machineType;
    }
}
