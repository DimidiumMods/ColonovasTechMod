package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
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
        add("itemGroup." + Reference.MOD_ID + ".tab.items", "ColonovasTechMod: Items");

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

        add(ItemRegistry.ALUMINIUM_GEAR.get(), "Aluminium Gear");
        add(ItemRegistry.COPPER_GEAR.get(), "Copper Gear");
        add(ItemRegistry.IRIDIUM_GEAR.get(), "Iridium Gear");
        add(ItemRegistry.LEAD_GEAR.get(), "Lead Gear");
        add(ItemRegistry.NICKEL_GEAR.get(), "Nickel Gear");
        add(ItemRegistry.PLATINUM_GEAR.get(), "Platinum Gear");
        add(ItemRegistry.SILVER_GEAR.get(), "Silver Gear");
        add(ItemRegistry.TIN_GEAR.get(), "Tin Gear");
        add(ItemRegistry.URANIUM_GEAR.get(), "Uranium Gear");

        add(ItemRegistry.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ItemRegistry.COPPER_INGOT.get(), "Copper Ingot");
        add(ItemRegistry.IRIDIUM_INGOT.get(), "Iridium Ingot");
        add(ItemRegistry.LEAD_INGOT.get(), "Lead Ingot");
        add(ItemRegistry.NICKEL_INGOT.get(), "Nickel Ingot");
        add(ItemRegistry.PLATINUM_INGOT.get(), "Platinum Ingot");
        add(ItemRegistry.SILVER_INGOT.get(), "Silver Ingot");
        add(ItemRegistry.TIN_INGOT.get(), "Tin Ingot");
        add(ItemRegistry.URANIUM_INGOT.get(), "Uranium Ingot");

        add(ItemRegistry.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
        add(ItemRegistry.COPPER_NUGGET.get(), "Copper Nugget");
        add(ItemRegistry.IRIDIUM_NUGGET.get(), "Iridium Nugget");
        add(ItemRegistry.LEAD_NUGGET.get(), "Lead Nugget");
        add(ItemRegistry.NICKEL_NUGGET.get(), "Nickel Nugget");
        add(ItemRegistry.PLATINUM_NUGGET.get(), "Platinum Nugget");
        add(ItemRegistry.SILVER_NUGGET.get(), "Silver Nugget");
        add(ItemRegistry.TIN_NUGGET.get(), "Tin Nugget");
        add(ItemRegistry.URANIUM_NUGGET.get(), "Uranium Nugget");

        add(ItemRegistry.RADIATION_SUIT_HELMET.get(), "Radiation Suit Helmet");
        add(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get(), "Radiation Suit Chestplate");
        add(ItemRegistry.RADIATION_SUIT_LEGGINGS.get(), "Radiation Suit Leggings");
        add(ItemRegistry.RADIATION_SUIT_BOOTS.get(), "Radiation Suit Boots");

        add(ItemRegistry.WRENCH.get(), "Electric Wrench");

        add(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET.get(), "Aluminium Bucket");
        add(ItemRegistry.MOLTEN_COPPER_BUCKET.get(), "Copper Bucket");
        add(ItemRegistry.MOLTEN_IRIDIUM_BUCKET.get(), "Iridium Bucket");
        add(ItemRegistry.MOLTEN_LEAD_BUCKET.get(), "Lead Bucket");
        add(ItemRegistry.MOLTEN_NICKEL_BUCKET.get(), "Nickel Bucket");
        add(ItemRegistry.MOLTEN_PLATINUM_BUCKET.get(), "Platinum Bucket");
        add(ItemRegistry.MOLTEN_SILVER_BUCKET.get(), "Silver Bucket");
        add(ItemRegistry.MOLTEN_TIN_BUCKET.get(), "Tin Bucket");
        add(ItemRegistry.MOLTEN_URANIUM_BUCKET.get(), "Uranium Bucket");

        add("messages.colonovastechmod.aluminium", "Yes it is spelled correctly. Colonova is British and they spell it this way!");
    }
}
