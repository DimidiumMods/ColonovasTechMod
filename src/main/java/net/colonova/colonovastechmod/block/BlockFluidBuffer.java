package net.colonova.colonovastechmod.block;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockFluidBuffer extends BlockBase //implements EntityBlock, IMachineBlock
{
    private final MachineType machineType;

    public BlockFluidBuffer(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType)
    {
        super(material, hardness, resistance, soundType);

        this.machineType = machineType;
    }
}
