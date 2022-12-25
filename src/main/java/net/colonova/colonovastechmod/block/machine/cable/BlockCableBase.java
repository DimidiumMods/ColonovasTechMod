package net.colonova.colonovastechmod.block.machine.cable;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.block.IMachineBlock;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockCableBase extends BlockBase implements IMachineBlock
{
    private final MachineType machineType;
    private final VoxelShape CABLE_SHAPE = Shapes.create(0.5, 0.5, 0.5, 0.5, 0.5, 0.5).optimize();

    public BlockCableBase(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType)
    {
        super(material, hardness, resistance, soundType);
        this.machineType = machineType;
    }

    @Override
    public MachineType getMachineType(MachineType type)
    {
        return machineType;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        return CABLE_SHAPE;
    }
}
