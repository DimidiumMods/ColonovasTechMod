package net.colonova.colonovastechmod.block.ore;

import net.colonova.colonovascore.api.block.BlockBase;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockOre extends BlockBase
{
    public BlockOre(Material material, float hardness, float resistance, SoundType soundType)
    {
        super(material, hardness, resistance, soundType);
    }
}