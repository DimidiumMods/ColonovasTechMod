package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider
{
    public LanguageGenerator(DataGenerator gen, String locale)
    {
        super(gen, Reference.MOD_ID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup." + Reference.MOD_ID + ".tab.blocks", "ColonovasTechMod: Blocks");

        add(BlockRegistry.ALUMINIUM_ORE.get(), "Aluminium Ore");
        add(BlockRegistry.COPPER_ORE.get(), "Copper Ore");
        add(BlockRegistry.IRIDIUM_ORE.get(), "Iridium Ore");
        add(BlockRegistry.LEAD_ORE.get(), "Lead Ore");
        add(BlockRegistry.NICKEL_ORE.get(), "Nickel Ore");
        add(BlockRegistry.PLATINUM_ORE.get(), "Platinum Ore");
        add(BlockRegistry.SILVER_ORE.get(), "Silver Ore");
        add(BlockRegistry.TIN_ORE.get(), "Tin Ore");
        add(BlockRegistry.URANIUM_ORE.get(),  "Uranium Ore");
        add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), "Deepslate Aluminium Ore");
        add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), "Deepslate Copper Ore");
        add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), "Deepslate Iridium Ore");
        add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), "Deepslate Lead Ore");
        add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), "Deepslate Nickel Ore");
        add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), "Deepslate Platinum Ore");
        add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
        add(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), "Deepslate Tin Ore");
        add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(), "Deepslate Uranium Ore");

        add(BlockRegistry.ALUMINIUM_BLOCK.get(), "Aluminium Block");
        add(BlockRegistry.COPPER_BLOCK.get(), "Copper Block");
        add(BlockRegistry.IRIDIUM_BLOCK.get(), "Iridium Block");
        add(BlockRegistry.LEAD_BLOCK.get(), "Lead Block");
        add(BlockRegistry.NICKEL_BLOCK.get(), "Nickel Block");
        add(BlockRegistry.PLATINUM_BLOCK.get(), "Platinum Block");
        add(BlockRegistry.SILVER_BLOCK.get(), "Silver Block");
        add(BlockRegistry.TIN_BLOCK.get(), "Tin Block");
        add(BlockRegistry.URANIUM_BLOCK.get(), "Uranium Block");

        add("messages.colonovastechmod.aluminium", "Yes it is spelled correctly. Colonova is British and they spell it this way!");
    }
}
