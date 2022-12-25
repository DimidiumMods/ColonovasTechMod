package net.colonova.colonovastechmod.block.machine.portal;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockPortal extends BlockBase implements IMachineBlock
{
    private final MachineType machineType;

    public BlockPortal(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType)
    {
        super(material, hardness, resistance, soundType);
        this.machineType = machineType;
    }

    @Override
    public MachineType getMachineType(MachineType type)
    {
        return machineType;
    }
}
