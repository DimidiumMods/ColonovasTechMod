package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockFlag extends BlockBase //implements EntityBlock, IMachineBlock
{
    public BlockFlag(Material material, float hardness, float resistance, SoundType soundType)
    {
        super(material, hardness, resistance, soundType);

        //this.machineType = machineType;
    }
}
