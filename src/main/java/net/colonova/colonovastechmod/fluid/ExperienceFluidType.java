package net.colonova.colonovastechmod.fluid;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.math.Vector3f;

import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class ExperienceFluidType extends FluidType
{
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
    private final ResourceLocation overlayTexture;

    public ExperienceFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final ResourceLocation overlayTexture, final FluidType.Properties properties)
    {
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
        this.overlayTexture = overlayTexture;
    }

    public ResourceLocation getStillTexture()
    {
        return stillTexture;
    }

    public ResourceLocation getFlowingTexture()
    {
        return flowingTexture;
    }

    public ResourceLocation getOverlayTexture()
    {
        return overlayTexture;
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer)
    {
        consumer.accept(new IClientFluidTypeExtensions()
        {
            @Override
            public ResourceLocation getStillTexture()
            {
                return stillTexture;
            }

            @Override
            public ResourceLocation getFlowingTexture()
            {
                return flowingTexture;
            }

            @Override
            public @Nullable ResourceLocation getOverlayTexture()
            {
                return overlayTexture;
            }

            @Override
            public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape)
            {
                RenderSystem.setShaderFogStart(1f);
                RenderSystem.setShaderFogEnd(6f);
            }
        });
    }
}
