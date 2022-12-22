package net.colonova.colonovastechmod.handler.event;

import net.colonova.colonovastechmod.fluid.MoltenFluidDamageSource;
import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = Reference.MOD_ID)
public class FluidEvent
{
    @SubscribeEvent
    public static void onTick(LivingEvent.LivingTickEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            Block block = player.level.getBlockState(player.getOnPos()).getBlock();

            if(block == BlockRegistry.MOLTEN_ALUMINIUM_BLOCK.get() || block == BlockRegistry.MOLTEN_COPPER_BLOCK.get() || block == BlockRegistry.MOLTEN_IRIDIUM_BLOCK.get() || block == BlockRegistry.MOLTEN_LEAD_BLOCK.get() || block == BlockRegistry.MOLTEN_NICKEL_BLOCK.get() || block == BlockRegistry.MOLTEN_PLATINUM_BLOCK.get() || block == BlockRegistry.MOLTEN_SILVER_BLOCK.get() || block == BlockRegistry.MOLTEN_TIN_BLOCK.get() || block == BlockRegistry.MOLTEN_URANIUM_BLOCK.get())
            {
                player.hurt(MoltenFluidDamageSource.MOLTEN_FLUID, 0.5F);
            }
        }
    }
}
