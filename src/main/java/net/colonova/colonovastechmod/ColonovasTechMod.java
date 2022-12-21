package net.colonova.colonovastechmod;

import net.colonova.colonovascore.ColonovasCore;
import net.colonova.colonovastechmod.client.screen.*;
import net.colonova.colonovastechmod.handler.ConfigurationHandler;
import net.colonova.colonovastechmod.handler.registry.*;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
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

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() -> {
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_ALUMINIUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_COPPER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_COPPER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_IRIDIUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_IRIDIUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_LEAD.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_LEAD.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_NICKEL.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_NICKEL.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_PLATINUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_PLATINUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_SILVER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_SILVER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_TIN.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_TIN.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_MOLTEN_URANIUM.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_MOLTEN_URANIUM.get(), RenderType.translucent());
            });
        }
    }
}