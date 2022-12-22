package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.block.*;
import net.colonova.colonovastechmod.block.machine.*;
import net.colonova.colonovastechmod.block.ore.*;
import net.colonova.colonovastechmod.util.MachineType;
import net.colonova.colonovastechmod.util.Reference;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    /* Ores */

    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new BlockAluminiumOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore", () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",   () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",  () -> new BlockOre(Material.STONE, 3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore",  () -> new BlockAluminiumOre(Material.STONE, 4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore",  () -> new BlockOre(Material.STONE, 4.0F, 3.0F, SoundType.DEEPSLATE));

    /* Ore Blocks */

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", () -> new BlockAluminiumBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",  () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new BlockIngotBlock(Material.METAL, 5.0F, 6.0F, SoundType.METAL));

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
    public static final RegistryObject<LiquidBlock> LIQUID_EXPERIENCE_BLOCK = BLOCKS.register("liquid_experience", () -> new LiquidBlock(FluidRegistry.SOURCE_LIQUID_EXPERIENCE, BlockBehaviour.Properties.of(Material.WATER)));


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