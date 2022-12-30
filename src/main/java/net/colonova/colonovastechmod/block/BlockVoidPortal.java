package net.colonova.colonovastechmod.block;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.handler.registry.DimensionRegistry;
import net.colonova.colonovastechmod.util.TeleportUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class BlockVoidPortal extends BlockBase
{
    public BlockVoidPortal(Material material, float hardness, float resistance, SoundType soundType)
    {
        super(material, hardness, resistance, soundType);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        if(!level.isClientSide)
        {
            final ServerPlayer serverPlayer = (ServerPlayer) player;

            if(level.dimension().equals(DimensionRegistry.THE_VOID.get()))
            {
                teleportTo(serverPlayer, pos.north(), Level.OVERWORLD);
            }

            else
            {
                teleportTo(serverPlayer, pos.north(), DimensionRegistry.THE_VOID_KEY);
            }
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    private void teleportTo(ServerPlayer player, BlockPos pos, ResourceKey<Level> id)
    {
        ServerLevel level = player.getServer().getLevel(id);
        TeleportUtil.teleport(player, level, new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
    }
}
