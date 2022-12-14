package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.item.armor.*;
import net.colonova.colonovastechmod.item.gear.*;
import net.colonova.colonovastechmod.item.ingot.*;
import net.colonova.colonovastechmod.item.nugget.*;
import net.colonova.colonovastechmod.item.block.BlockItemUranium;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry
{

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    /* Ores */

    public static final RegistryObject<Item> ALUMINIUM_ORE = ITEMS.register("aluminium_ore", () -> new BlockItem(BlockRegistry.ALUMINIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockRegistry.COPPER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> IRIDIUM_ORE = ITEMS.register("iridium_ore", () -> new BlockItem(BlockRegistry.IRIDIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(BlockRegistry.LEAD_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> NICKEL_ORE = ITEMS.register("nickel_ore", () -> new BlockItem(BlockRegistry.NICKEL_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> PLATINUM_ORE = ITEMS.register("platinum_ore", () -> new BlockItem(BlockRegistry.PLATINUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(BlockRegistry.SILVER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(BlockRegistry.TIN_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> URANIUM_ORE = ITEMS.register("uranium_ore", BlockItemUranium::new);
    public static final RegistryObject<Item> DEEP_SLATE_ALUMINIUM_ORE = ITEMS.register("deepslate_aluminium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_COPPER_ORE = ITEMS.register("deepslate_copper_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_IRIDIUM_ORE = ITEMS.register("deepslate_iridium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_NICKEL_ORE = ITEMS.register("deepslate_nickel_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_PLATINUM_ORE = ITEMS.register("deepslate_platinum_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> DEEP_SLATE_URANIUM_ORE = ITEMS.register("deepslate_uranium_ore", BlockItemUranium::new);

    /* Blocks */

    public static final RegistryObject<Item> ALUMINIUM_BLOCK = ITEMS.register("aluminium_block", () -> new BlockItem(BlockRegistry.ALUMINIUM_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(BlockRegistry.COPPER_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> IRIDIUM_BLOCK = ITEMS.register("iridium_block", () -> new BlockItem(BlockRegistry.IRIDIUM_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(BlockRegistry.LEAD_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(BlockRegistry.NICKEL_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> PLATINUM_BLOCK = ITEMS.register("platinum_block", () -> new BlockItem(BlockRegistry.PLATINUM_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(BlockRegistry.SILVER_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(BlockRegistry.TIN_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS)));
    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", BlockItemUranium::new);

    /* Gears */

    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear", ItemAluminiumGear::new);
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", ItemCopperGear::new);
    public static final RegistryObject<Item> IRIDIUM_GEAR = ITEMS.register("iridium_gear", ItemIridiumGear::new);
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", ItemLeadGear::new);
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", ItemNickelGear::new);
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", ItemPlatinumGear::new);
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", ItemSilverGear::new);
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", ItemTinGear::new);
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", ItemUraniumGear::new);

    /* Ingots */

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", ItemAluminiumIngot::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemCopperIngot::new);
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", ItemIridiumIngot::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ItemLeadIngot::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ItemNickelIngot::new);
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", ItemPlatinumIngot::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemSilverIngot::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemTinIngot::new);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", ItemUraniumIngot::new);

    /* Nuggets */

    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", ItemAluminiumNugget::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemCopperNugget::new);
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", ItemIridiumNugget::new);
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ItemLeadNugget::new);
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ItemNickelNugget::new);
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", ItemPlatinumNugget::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ItemSilverNugget::new);
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ItemTinNugget::new);
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", ItemUraniumNugget::new);

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET = ITEMS.register("radiation_suit_helmet", ItemRadiationSuitHelmet::new);
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE = ITEMS.register("radiation_suit_chestplate", ItemRadiationSuitChestplate::new);
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS = ITEMS.register("radiation_suit_leggings", ItemRadiationSuitLeggings::new);
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS = ITEMS.register("radiation_suit_boots", ItemRadiationSuitBoots::new);

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
