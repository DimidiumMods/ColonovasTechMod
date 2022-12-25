package net.colonova.colonovastechmod.block.machine.quarry;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockQuarrySilkUpgrade extends BlockBase
{
    public BlockQuarrySilkUpgrade(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType)
    {
        super(material, hardness, resistance, soundType);
        //this.machineType = machineType;
    }
}
