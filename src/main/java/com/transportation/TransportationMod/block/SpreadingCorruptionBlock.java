package com.transportation.TransportationMod.block;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class SpreadingCorruptionBlock extends Block {

    public SpreadingCorruptionBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

        for (Direction direction : Direction.values())
        {
            BlockPos adjacentPos = pos.relative(direction);
            BlockState adjacentState = level.getBlockState(adjacentPos);
            Block adjacent = adjacentState.getBlock();
            if (!adjacent.equals(Blocks.AIR) && !adjacent.equals(state.getBlock()))
            {
                level.setBlock(adjacentPos, state, UPDATE_CLIENTS|UPDATE_IMMEDIATE);
                return;
            }
        }
    }
}
