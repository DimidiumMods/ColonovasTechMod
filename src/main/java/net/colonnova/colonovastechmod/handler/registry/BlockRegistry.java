package net.colonnova.colonovastechmod.handler.registry;

import net.colonnova.colonovastechmod.block.ore.*;
import net.colonnova.colonovastechmod.util.Reference;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", BlockAluminiumOre::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", BlockCopperOre::new);
    public static final RegistryObject<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore", BlockIridiumOre::new);
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",  BlockLeadOre::new);
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", BlockNickelOre::new);
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", BlockPlatinumOre::new);
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", BlockSilverOre::new);
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", BlockTinOre::new);
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", BlockUraniumOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore", BlockAluminiumOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore", BlockCopperOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore", BlockIridiumOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore", BlockLeadOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore", BlockNickelOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore", BlockPlatinumOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", BlockSilverOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", BlockTinOre::new);
    public static final RegistryObject<Block> DEEP_SLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore", BlockUraniumOre::new);

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
