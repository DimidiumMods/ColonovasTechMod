package net.colonova.colonovastechmod.item;

import net.colonova.colonovastechmod.ColonovasTechMod;
import net.colonova.colonovastechmod.handler.registry.EffectRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemRadAway extends Item
{
    public ItemRadAway()
    {
        super(new Item.Properties()
                .tab(Reference.CREATIVE_TAB_ITEMS)
                .food(new FoodProperties.Builder()
                        .nutrition(2)
                        .saturationMod(2.5F)
                        .fast()
                        .build())
                .stacksTo(16));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity)
    {
        if(level.isClientSide && entity instanceof final Player player)
        {
            player.addEffect(new MobEffectInstance(EffectRegistry.ANTI_RADIATION.get(), 20 * 20, 1));
        }

        return super.finishUsingItem(stack, level, entity);
    }
}
