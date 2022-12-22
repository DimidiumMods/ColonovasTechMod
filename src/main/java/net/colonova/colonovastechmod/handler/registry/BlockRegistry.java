package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.block.*;
import net.colonova.colonovastechmod.block.machine.*;
import net.colonova.colonovastechmod.block.ore.*;
import net.colonova.colonovastechmod.util.MachineType;
import net.colonova.colonovastechmod.util.Reference;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    /* Ores */

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

    /* Ore Blocks */

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", BlockAluminiumBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", BlockCopperBlock::new);
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", BlockIridiumBlock::new);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",  BlockLeadBlock::new);
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", BlockNickelBlock::new);
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", BlockPlatinumBlock::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", BlockSilverBlock::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", BlockTinBlock::new);
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", BlockUraniumBlock::new);

    /* Fluid blocks */

    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINIUM_BLOCK = BLOCKS.register("molten_aluminium_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRIDIUM_BLOCK = BLOCKS.register("molten_iridium_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_IRIDIUM, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PLATINUM_BLOCK = BLOCKS.register("molten_platinum_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_PLATINUM, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block", () -> new LiquidBlock(FluidRegistry.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    /* Machines */

    public static final RegistryObject<Block> BASIC_MACHINE_FRAME = BLOCKS.register("basic_machine_frame", () -> new BlockMachineFrame(MachineType.BASIC));
    public static final RegistryObject<Block> INTERMEDIATE_MACHINE_FRAME = BLOCKS.register("intermediate_machine_frame", () -> new BlockMachineFrame(MachineType.INTERMEDIATE));
    public static final RegistryObject<Block> ADVANCED_MACHINE_FRAME = BLOCKS.register("advanced_machine_frame", () -> new BlockMachineFrame(MachineType.ADVANCED));
    public static final RegistryObject<Block> ULTIMATE_MACHINE_FRAME = BLOCKS.register("ultimate_machine_frame", () -> new BlockMachineFrame(MachineType.ULTIMATE));

    public static final RegistryObject<Block> HEALER = BLOCKS.register("healer", BlockHealer::new);

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
