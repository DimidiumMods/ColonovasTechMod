package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.ColonovasTechMod;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockTank extends BlockBase implements IMachineBlock
{
    private final MachineType machineType;
    private final int tankCapacity;

    public BlockTank(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType, int tankCapacity)
    {
        super(material, hardness, resistance, soundType);
        this.machineType = machineType;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> items)
    {
        final ItemStack emptyTank = new ItemStack(this);

        for(Fluid fluid : ForgeRegistries.FLUIDS)
        {
            FluidState state = fluid.defaultFluidState();

            if(state.isSource())
            {
                try
                {
                    final ItemStack tankStack = emptyTank.copy();

                    if(fillTankItem(tankStack, fluid))
                    {
                        items.add(tankStack);
                    }

                    else
                    {
                        ColonovasTechMod.LOGGER.debug("Failed to create filled tank stack for fluid '%s'. Not registered?");
                    }
                }

                catch(Throwable t)
                {
                    throw new RuntimeException("Error");
                }
            }
        }
    }

    public boolean fillTankItem(ItemStack result, Fluid fluid)
    {
        if (result.isEmpty())
        {
            return false;
        }

        FluidTank tank = new FluidTank(tankCapacity);
        tank.setFluid(new FluidStack(fluid, tankCapacity));
        //saveTank(result, tank);

        return true;
    }

    @Override
    public MachineType getMachineType(MachineType type)
    {
        return machineType;
    }
}
