package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;

import net.minecraft.data.DataGenerator;

public class LootTableGenerator extends BaseLootTableProvider
{
    public LootTableGenerator(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        lootTables.put(BlockRegistry.ALUMINIUM_BLOCK.get(), createSimpleTable("aluminium_block", BlockRegistry.ALUMINIUM_BLOCK.get()));
        lootTables.put(BlockRegistry.COPPER_BLOCK.get(), createSimpleTable("copper_block", BlockRegistry.COPPER_BLOCK.get()));
        lootTables.put(BlockRegistry.IRIDIUM_BLOCK.get(), createSimpleTable("iridium_block", BlockRegistry.IRIDIUM_BLOCK.get()));
        lootTables.put(BlockRegistry.LEAD_BLOCK.get(), createSimpleTable("lead_block", BlockRegistry.LEAD_BLOCK.get()));
        lootTables.put(BlockRegistry.NICKEL_BLOCK.get(), createSimpleTable("nickel_block", BlockRegistry.NICKEL_BLOCK.get()));
        lootTables.put(BlockRegistry.PLATINUM_BLOCK.get(), createSimpleTable("platinum_block", BlockRegistry.PLATINUM_BLOCK.get()));
        lootTables.put(BlockRegistry.SILVER_BLOCK.get(), createSimpleTable("silver_block", BlockRegistry.SILVER_BLOCK.get()));
        lootTables.put(BlockRegistry.TIN_BLOCK.get(), createSimpleTable("tin_block", BlockRegistry.TIN_BLOCK.get()));
        lootTables.put(BlockRegistry.URANIUM_BLOCK.get(), createSimpleTable("uranium_block", BlockRegistry.URANIUM_BLOCK.get()));
        lootTables.put(BlockRegistry.ALUMINIUM_ORE.get(), createSimpleTable("aluminium_ore", BlockRegistry.ALUMINIUM_ORE.get()));
        lootTables.put(BlockRegistry.COPPER_ORE.get(), createSimpleTable("copper_ore", BlockRegistry.COPPER_ORE.get()));
        lootTables.put(BlockRegistry.IRIDIUM_ORE.get(), createSimpleTable("iridium_ore", BlockRegistry.IRIDIUM_ORE.get()));
        lootTables.put(BlockRegistry.LEAD_ORE.get(), createSimpleTable("lead_ore", BlockRegistry.LEAD_ORE.get()));
        lootTables.put(BlockRegistry.NICKEL_ORE.get(), createSimpleTable("nickel_ore", BlockRegistry.NICKEL_ORE.get()));
        lootTables.put(BlockRegistry.PLATINUM_ORE.get(), createSimpleTable("platinum_ore", BlockRegistry.PLATINUM_ORE.get()));
        lootTables.put(BlockRegistry.SILVER_ORE.get(), createSimpleTable("silver_ore", BlockRegistry.SILVER_ORE.get()));
        lootTables.put(BlockRegistry.TIN_ORE.get(), createSimpleTable("tin_ore", BlockRegistry.TIN_ORE.get()));
        lootTables.put(BlockRegistry.URANIUM_ORE.get(), createSimpleTable("uranium_ore", BlockRegistry.URANIUM_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), createSimpleTable("deep_slate_aluminium_ore", BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), createSimpleTable("deep_slate_copper_ore", BlockRegistry.DEEP_SLATE_COPPER_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), createSimpleTable("deep_slate_iridium_ore", BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), createSimpleTable("deep_slate_lead_ore", BlockRegistry.DEEP_SLATE_LEAD_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), createSimpleTable("deep_slate_nickel_ore", BlockRegistry.DEEP_SLATE_NICKEL_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), createSimpleTable("deep_slate_platinum_ore", BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), createSimpleTable("deep_slate_silver_ore", BlockRegistry.DEEP_SLATE_SILVER_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), createSimpleTable("deep_slate_tin_ore", BlockRegistry.DEEP_SLATE_TIN_ORE.get()));
        lootTables.put(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(), createSimpleTable("deep_slate_uranium_ore", BlockRegistry.DEEP_SLATE_URANIUM_ORE.get()));
    }
}
