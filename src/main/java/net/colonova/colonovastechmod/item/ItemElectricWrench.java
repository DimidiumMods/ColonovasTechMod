package net.colonova.colonovastechmod.item;

import net.colonova.colonovascore.api.energy.EnergyAction;
import net.colonova.colonovascore.api.energy.item.PoweredItemBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.handler.ConfigurationHandler;
import net.colonova.colonovastechmod.handler.registry.SoundRegistry;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;

public class ItemElectricWrench  extends PoweredItemBase
{
    public ItemElectricWrench(CreativeModeTab tab, int stackSize)
    {
        super(10000D, tab, stackSize);
    }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        Level level = context.getLevel();
        ItemStack stack = new ItemStack(level.getBlockState(context.getClickedPos()).getBlock().asItem());

        if(!context.getLevel().isClientSide && context.getLevel().getBlockState(context.getClickedPos()).getBlock() instanceof IMachineBlock)
        {
            if(!context.getPlayer().isCreative())
            {
                if(context.getPlayer().isShiftKeyDown() && this.getCurrentFE(context.getItemInHand()) >= ConfigurationHandler.ELECTRIC_WRENCH_ENERGY_PER_USE.get())
                {
                    float f = 0.7F;
                    float d0 = level.random.nextFloat() * f + (1.0F - f) * 0.5F;
                    float d1 = level.random.nextFloat() * f + (1.0F - f) * 0.5F;
                    float d2 = level.random.nextFloat() * f + (1.0F - f) * 0.5F;
                    int x = context.getClickedPos().getX();
                    int y = context.getClickedPos().getY();
                    int z = context.getClickedPos().getZ();

                    ItemEntity itemEntity = new ItemEntity(level, x + d0, y + d1, z + d2, stack);
                    itemEntity.setDefaultPickUpDelay();

                    if(stack.hasTag())
                    {
                        itemEntity.getItem().setTag(stack.getTag().copy());
                    }

                    level.setBlockAndUpdate(context.getClickedPos(), Blocks.AIR.defaultBlockState());
                    level.addFreshEntity(itemEntity);
                    this.extractFE(context.getItemInHand(), ConfigurationHandler.ELECTRIC_WRENCH_ENERGY_PER_USE.get(), EnergyAction.EXECUTE);
                }

                context.getLevel().getBlockState(context.getClickedPos()).getBlock().rotate(level.getBlockState(context.getClickedPos()), Rotation.CLOCKWISE_90);
                this.extractFE(context.getItemInHand(), ConfigurationHandler.ELECTRIC_WRENCH_ENERGY_PER_USE.get(), EnergyAction.EXECUTE);
            }
        }

        context.getLevel().playSound(context.getPlayer(), context.getClickedPos(), SoundRegistry.WRENCH_USE.get(), SoundSource.PLAYERS, 10.0F, 10.0F);
        return super.useOn(context);
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        return ConfigurationHandler.ELECTRIC_WRENCH_CHARGING_SPEED.get();
    }
}
