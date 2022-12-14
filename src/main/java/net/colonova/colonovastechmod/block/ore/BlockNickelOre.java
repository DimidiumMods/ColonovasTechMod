package net.colonova.colonovastechmod.block.ore;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockNickelOre extends Block
{
    public BlockNickelOre()
    {
        super(Block.Properties.of(Material.STONE)
                .strength(10.0F, 100.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops());
    }
}
