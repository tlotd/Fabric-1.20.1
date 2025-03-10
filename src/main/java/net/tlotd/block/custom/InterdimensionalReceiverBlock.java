package net.tlotd.block.custom;

import net.minecraft.block.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.tlotd.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InterdimensionalReceiverBlock extends Block {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final DirectionProperty FACING = FacingBlock.FACING;

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.add(0,-1,0)).isIn(ModTags.Blocks.TELEVISIONS);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        if (ctx.getWorld().getBlockState(ctx.getBlockPos().add(0,-1,0)).isIn(ModTags.Blocks.TELEVISIONS)) {
            return this.getDefaultState()
                    .with(FACING, ctx.getWorld().getBlockState(ctx.getBlockPos().add(0,-1,0)).get(FACING))
                    .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER));
        } else {
            return this.getDefaultState()
                    .with(FACING, Direction.NORTH)
                    .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER));
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    public InterdimensionalReceiverBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    public static final VoxelShape WEST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(7, -4, 1, 9, 3, 15),
            Block.createCuboidShape(3.5, -4, 0.5, 6.5, 6, 4.5)
    );
    public static final VoxelShape NORTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(1, -4, 7, 15, 3, 9),
            Block.createCuboidShape(11.5, -4, 3.5, 15.5, 6, 6.5)
    );
    public static final VoxelShape EAST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(7, -4, 1, 9, 3, 15),
            Block.createCuboidShape(9.5, -4, 11.5, 12.5, 6, 15.5)
    );
    public static final VoxelShape SOUTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(1, -4, 7, 15, 3, 9),
            Block.createCuboidShape(0.5, -4, 9.5, 4.5, 6, 12.5)
    );

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> NORTH_SHAPE;
        };
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("block.tlotd.interdimensional_receiver.tooltip").formatted(Formatting.GRAY));
        tooltip.add(Text.literal(" ").append(Text.translatable("block.tlotd.television").formatted(Formatting.BLUE)));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
