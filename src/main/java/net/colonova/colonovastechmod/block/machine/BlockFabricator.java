/*
package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

@SuppressWarnings("deprecated")
public class BlockFabricator extends BlockBase implements IMachineBlock, EntityBlock
{
    private static final MutableComponent CONTAINER_TITLE = Component.translatable("container.repair");
    private final MachineType machineType;

    public BlockFabricator(MachineType machineType)
    {
        super(Material.HEAVY_METAL, 10.0F, 100.0F, SoundType.METAL);
        this.machineType = machineType;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState)
    {
        return new BlockEntityFabricator(blockPos, blockState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> blockEntityType)
    {
        return (level1, pos, state1, be) -> BlockEntityFabricator.tick(level1, pos, state1, blockEntityType);
    }

    @Override
    public RenderShape getRenderShape(BlockState blockState)
    {
        return RenderShape.MODEL;
    }


    @Override
    @Nullable
    public MenuProvider getMenuProvider(BlockState blockState, Level level, BlockPos blockPos)
    {
        return new SimpleMenuProvider((i, inventory, player) ->
        {
            return new ContainerFabricator(i, inventory, ContainerLevelAccess.create(level, blockPos));
        }, CONTAINER_TITLE);
    }



    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext)
    {
        return Shapes.block();
    }


    @Override
    public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext)
    {
        return Shapes.block();
    }

    @Override
    public VoxelShape getVisualShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext)
    {
        return Shapes.block();
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult)
    {
        final BlockEntityFabricator be = (BlockEntityFabricator) level.getBlockEntity(blockPos);

        if(be != null)
        {
            if(!level.isClientSide)
            {
                player.playSound(SoundEvents.ENCHANTMENT_TABLE_USE, 1.0F, 1.0F);
                player.openMenu(getMenuProvider(blockState, level, blockPos));
            }

            player.playSound(SoundEvents.ENCHANTMENT_TABLE_USE, 1.0F, 1.0F);

            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        else
        {
            player.sendSystemMessage(Component.literal("Error").withStyle(ChatFormatting.DARK_RED));
        }

        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }

    @Override
    public MachineType getMachineType(MachineType type)
    {
        return machineType;
    }
}
*/
