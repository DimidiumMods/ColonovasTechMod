package net.colonova.colonovastechmod.block;

import net.colonova.colonovascore.api.block.BlockBase;

import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockEgg extends BlockBase //implements EntityBlock
{
    public BlockEgg(Material material, float hardness, float resistance, SoundType soundType)
    {
        super(material, hardness, resistance, soundType);
    }
}
