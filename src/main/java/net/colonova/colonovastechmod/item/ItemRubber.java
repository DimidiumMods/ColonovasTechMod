package net.colonova.colonovastechmod.item;

import net.colonova.colonovascore.api.item.ItemBase;
import net.colonova.colonovastechmod.util.Reference;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemRubber extends ItemBase
{
    public ItemRubber()
    {
        super(Reference.CREATIVE_TAB_ITEMS, 64, false);
    }
}
