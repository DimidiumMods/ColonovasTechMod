package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.enchantment.EnchantmentSoulBinding;
import net.colonova.colonovastechmod.util.Reference;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentRegistry
{
    private static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Reference.MOD_ID);

    public static final RegistryObject<Enchantment> SOUL_BINDING = ENCHANTMENTS.register("soul_binding", EnchantmentSoulBinding::new);

    public static void registerEnchantments()
    {
        ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
