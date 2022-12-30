package net.colonova.colonovastechmod.util;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.util.ITeleporter;

import java.util.function.Function;

public class TeleportUtil
{
    public static void teleport(ServerPlayer player, ServerLevel level, BlockPos pos)
    {
        player.changeDimension(level, new ITeleporter()
        {
            @Override
            public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destWorld, float yaw, Function<Boolean, Entity> repositionEntity)
            {
                entity = repositionEntity.apply(false);
                int y = pos.getY();
                entity.teleportTo(pos.getX(), y, pos.getZ());
                return entity;
            }
        });
    }
}
