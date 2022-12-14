package net.colonova.colonovastechmod.handler.event;

import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.handler.registry.EffectRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ArmorEvent
{
    @SubscribeEvent
    public static void onArmorChange(LivingEquipmentChangeEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            if(!(player.getInventory().armor.get(0).is(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).is(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).is(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).is(ItemRegistry.RADIATION_SUIT_HELMET.get())))
            {
                player.removeEffect(EffectRegistry.ANTI_RADIATION.get());
            }
        }
    }
}
