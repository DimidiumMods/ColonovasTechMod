package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new RecipeGenerator(generator));
        generator.addProvider(event.includeServer(), new LootTableGenerator(generator));
        generator.addProvider(event.includeClient(), new BlockStatesGenerator(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new LanguageGenerator(generator, "en_us"));
    }
}
