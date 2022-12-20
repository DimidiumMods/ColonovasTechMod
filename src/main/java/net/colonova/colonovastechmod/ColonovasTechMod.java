package net.colonova.colonovastechmod;

import net.colonova.colonovastechmod.handler.registry.FluidRegistry;
import net.colonova.colonovastechmod.handler.registry.FluidTypeRegistry;
import net.colonova.colonovastechmod.handler.ConfigurationHandler;
import net.colonova.colonovastechmod.handler.registry.*;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class ColonovasTechMod
{
    public static final Logger LOGGER = LogManager.getLogger();

    public ColonovasTechMod()
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigurationHandler.SERVER_CONFIG);
        BlockRegistry.registerBlocks();
        ConfiguredFeatureRegistry.registerConfiguredFeatures();
        PlacedFeatureRegistry.registerPlacedFeatures();
        EffectRegistry.registerEffects();
        ItemRegistry.registerItems();
        SoundRegistry.registerSounds();

        FluidRegistry.registerFluids();
        FluidTypeRegistry.registerFluidTypes();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {

    }

    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_ALUMINIUM.get(), RenderType.translucent());
        }
    }
}