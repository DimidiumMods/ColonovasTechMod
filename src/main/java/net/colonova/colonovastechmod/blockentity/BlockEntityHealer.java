/*
package net.colonova.colonovastechmod.blockentity;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.colonova.colonovastechmod.util.BlockUtil;
import net.colonova.colonovastechmod.util.EnergyUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BlockEntityHealer extends BlockEntity
{
    private final EnergyUtil energyStorage = createEnergy();
    private final LazyOptional<IEnergyStorage> energy = LazyOptional.of(() -> energyStorage);



    public BlockEntityHealer(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.HEALER.get(), pos, state);
    }

    @Override
    public void setRemoved()
    {
        super.setRemoved();
        energy.invalidate();
    }

    public static void tick(Level level, BlockPos pos)
    {
        long time = level.getGameTime();

        if(time % 20 == 0)
        {
            //todo config range for healer
            List<Player> playersOnTop = level.getEntitiesOfClass(Player.class, BlockUtil.expandAround(pos, 70, 100, 70));

            for(Player player : playersOnTop)
            {
                if(!player.isCreative() && player.isAlive())
                {
                    player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 10));
                    player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 100, 10));
                }
            }
        }
    }

    private void sendOutPower()
    {
        AtomicInteger capacity = new AtomicInteger(energyStorage.getEnergyStored());
        if (capacity.get() > 0) {
            for (Direction direction : Direction.values())
            {
                BlockEntity be = level.getBlockEntity(worldPosition.relative(direction));

                if (be != null)
                {
                    boolean doContinue = be.getCapability(CapabilityEnergy.ENERGY, direction.getOpposite()).map(handler -> {
                                if (handler.canReceive())
                                {
                                    int received = handler.receiveEnergy(Math.min(capacity.get(), 100), false);
                                    capacity.addAndGet(-received);
                                    energyStorage.consumeEnergy(received);
                                    setChanged();
                                    return capacity.get() > 0;
                                }

                                else
                                {
                                    return true;
                                }
                            }
                    ).orElse(true);

                    if (!doContinue)
                    {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void load(CompoundTag tag)
    {
        if (tag.contains("Energy"))
        {
            energyStorage.deserializeNBT(tag.get("Energy"));
        }

        super.load(tag);
    }

    @Override
    public void saveAdditional(CompoundTag tag)
    {
        tag.put("Energy", energyStorage.serializeNBT());
    }

    private EnergyUtil createEnergy()
    {
        return new EnergyUtil(10000, 0)
        {
            @Override
            protected void onEnergyChanged()
            {
                setChanged();
            }
        };
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
    {
        if (cap == CapabilityEnergy.ENERGY)
        {
            return energy.cast();
        }
        return super.getCapability(cap, side);
    }
}
*/
