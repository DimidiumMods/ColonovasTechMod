package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class BlockDrain extends BlockBase //implements EntityBlock
{
    private static final VoxelShape DRAIN_SHAPE = Shapes.create(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0).optimize();

    public BlockDrain(Material material, float hardness, float resistance, SoundType soundType)
    {
        super(material, hardness, resistance, soundType);
    }

/*    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new TileEntityDrain();
    }*/

/*    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, ContextISelectionContext context)
    {
        return DRAIN_SHAPE;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
    }*/
/*
    @Override
    public MachineType getMachineType(MachineType type)
    {
        return machineType;
    }*/
}