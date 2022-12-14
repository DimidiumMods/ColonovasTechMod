package net.colonova.colonovastechmod.block.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;


public class BlockCopperOre extends Block
{
    public BlockCopperOre()
    {
        super(Block.Properties.of(Material.STONE)
                .strength(10.0F, 100.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops());
    }
}
