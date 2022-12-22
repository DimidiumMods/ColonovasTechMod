package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStatesGenerator extends BlockStateProvider
{
    public BlockStatesGenerator(DataGenerator gen, ExistingFileHelper helper)
    {
        super(gen, Reference.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(BlockRegistry.ALUMINIUM_BLOCK.get());
        simpleBlock(BlockRegistry.COPPER_BLOCK.get());
        simpleBlock(BlockRegistry.IRIDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.LEAD_BLOCK.get());
        simpleBlock(BlockRegistry.NICKEL_BLOCK.get());
        simpleBlock(BlockRegistry.PLATINUM_BLOCK.get());
        simpleBlock(BlockRegistry.SILVER_BLOCK.get());
        simpleBlock(BlockRegistry.TIN_BLOCK.get());
        simpleBlock(BlockRegistry.URANIUM_BLOCK.get());
        simpleBlock(BlockRegistry.ALUMINIUM_ORE.get());
        simpleBlock(BlockRegistry.COPPER_ORE.get());
        simpleBlock(BlockRegistry.IRIDIUM_ORE.get());
        simpleBlock(BlockRegistry.LEAD_ORE.get());
        simpleBlock(BlockRegistry.NICKEL_ORE.get());
        simpleBlock(BlockRegistry.PLATINUM_ORE.get());
        simpleBlock(BlockRegistry.SILVER_ORE.get());
        simpleBlock(BlockRegistry.TIN_ORE.get());
        simpleBlock(BlockRegistry.URANIUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_COPPER_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_LEAD_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_SILVER_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_TIN_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());

        /* Machines */

        simpleBlock(BlockRegistry.BASIC_MACHINE_FRAME.get());
        simpleBlock(BlockRegistry.INTERMEDIATE_MACHINE_FRAME.get());
        simpleBlock(BlockRegistry.ADVANCED_MACHINE_FRAME.get());
        simpleBlock(BlockRegistry.ULTIMATE_MACHINE_FRAME.get());

        simpleBlock(BlockRegistry.HEALER.get());
    }
}
