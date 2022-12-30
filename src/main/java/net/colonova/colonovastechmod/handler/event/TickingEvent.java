package net.colonova.colonovastechmod.handler.event;

import net.colonova.colonovastechmod.handler.registry.EffectRegistry;
import net.colonova.colonovastechmod.util.BlockUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TickingEvent
{
    @SubscribeEvent
    public static void onTick(LivingEvent.LivingTickEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            if(player.hasEffect(EffectRegistry.BREEDING.get()))
            {
                //todo increase range based on ring type

                List<Animal> ANIMALS = player.getLevel().getEntitiesOfClass(Animal.class, BlockUtil.expandAround(player.getOnPos(), 10, 10 ,10));

                for(Animal animal : ANIMALS)
                {
                    animal.setInLove(player);
                }
            }

            if(player.hasEffect(EffectRegistry.ENTITY_PULLER.get()))
            {
                List<LivingEntity> LIVING_ENTITIES = player.getLevel().getEntitiesOfClass(LivingEntity.class, BlockUtil.expandAround(player.getOnPos(), 10, 10, 10));

                for(LivingEntity entity : LIVING_ENTITIES)
                {
                    if(!(entity instanceof Player))
                    {
                        entity.resetFallDistance();
                        entity.setPos(player.getX() + 1, player.getY() + 1, player.getZ() + 1);
                    }
                }
            }

            if(player.hasEffect(EffectRegistry.FLIGHT.get()))
            {
                player.getAbilities().mayfly = true;
            }

            if(player.hasEffect(EffectRegistry.FREEZE.get()))
            {
                List<Mob> MOBS = player.getLevel().getEntitiesOfClass(Mob.class, BlockUtil.expandAround(player.getOnPos(), 10, 10, 10));

                for(Mob MOB : MOBS)
                {
                    MOB.setNoAi(true);
                }
            }

            if(player.hasEffect(EffectRegistry.GREEN_THUMB.get()))
            {
                final Block block = player.getLevel().getBlockState(player.getOnPos()).getBlock();
                final BlockPos pos = player.getOnPos();
                final BlockState state = player.getBlockStateOn();
                final Level level = player.getLevel();

                if(block instanceof BonemealableBlock)
                {
                    if(!(level.getBlockState(pos).getBlock() instanceof GrassBlock))
                    {
                        if(!player.level.isClientSide)
                        {
                            state.randomTick((ServerLevel) level, pos, level.random);
                        }
                    }
                }

                if(block instanceof GrassBlock || block.equals(Blocks.DIRT))
                {
                    level.setBlockAndUpdate(pos, Blocks.FARMLAND.defaultBlockState());
                }
            }

            if(player.hasEffect(EffectRegistry.MAGNETIZATION.get()))
            {
                List<ItemEntity> ITEM_ENTITIES = player.getLevel().getEntitiesOfClass(ItemEntity.class, BlockUtil.expandAround(player.getOnPos(), 10, 10, 10));

                for(ItemEntity ENTITY : ITEM_ENTITIES)
                {
                    ENTITY.setPos(player.getX(), player.getY(), player.getZ());
                    ENTITY.setPickUpDelay(10);
                }
            }

            if(player.hasEffect(EffectRegistry.STEP_ASSIST.get()))
            {
                player.maxUpStep = 1.0F;
            }
        }
    }
}
