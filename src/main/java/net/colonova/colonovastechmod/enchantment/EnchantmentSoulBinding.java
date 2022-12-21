package net.colonova.colonovastechmod.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class EnchantmentSoulBinding extends Enchantment
{
    public EnchantmentSoulBinding()
    {
        super(Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE , EquipmentSlot.values());
    }

    @Override
    public int getMinLevel()
    {
        return 1;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }

    @Override
    public boolean isTradeable()
    {
        return false;
    }

    @Override
    public boolean isAllowedOnBooks()
    {
        return true;
    }

    @Override
    public int getMinCost(int cost)
    {
        return cost  * 25;
    }

    @Override
    public int getMaxCost(int cost)
    {
        return this.getMinCost(cost) + 50;
    }

    @Override
    public boolean isTreasureOnly()
    {
        return false;
    }
}
