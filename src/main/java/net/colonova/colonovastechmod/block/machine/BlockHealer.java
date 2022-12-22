package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.blockentity.BlockEntityHealer;
import net.colonova.colonovastechmod.inventory.container.ContainerHealer;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class BlockHealer extends BlockBase implements EntityBlock
{
    public BlockHealer()
    {
        super(Material.WOOL, 10.0F, 100.0F, SoundType.WOOL);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new BlockEntityHealer(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type)
    {
        return level.isClientSide ? null : ($0, pos, $1, blockEntity) ->
        {
            if(blockEntity instanceof BlockEntityHealer)
            {
                BlockEntityHealer.tick(level, pos);
            }
        };
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result)
    {
        if (!level.isClientSide)
        {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof BlockEntityHealer)
            {
                MenuProvider containerProvider = new MenuProvider()
                {
                    @Override
                    public Component getDisplayName()
                    {
                        return Component.translatable("");
                    }

                    @Override
                    public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player playerEntity)
                    {
                        return new ContainerHealer(windowId, pos, playerInventory, playerEntity);
                    }
                };


                NetworkHooks.openScreen((ServerPlayer) player, containerProvider, be.getBlockPos());
            }

            else
            {
                throw new IllegalStateException("Our named container provider is missing!");
            }
        }

        return InteractionResult.SUCCESS;
    }
}