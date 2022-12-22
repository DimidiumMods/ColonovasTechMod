package net.colonova.colonovastechmod.handler.registry;

import net.colonova.colonovastechmod.inventory.container.*;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ContainerRegistry
{
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Reference.MOD_ID);

    public static final RegistryObject<MenuType<ContainerHealer>> HEALER = CONTAINERS.register("healer",
            () -> IForgeMenuType.create((windowId, inv, data) -> new ContainerHealer(windowId, data.readBlockPos(), inv, inv.player)));

    public static void registerContainers()
    {
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

