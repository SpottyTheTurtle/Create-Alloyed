package com.molybdenum.alloyed.common.compat.createdeco;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CreateDecoCompat {

    public static Block newCatwalkBlock(BlockBehaviour.Properties properties) {
        return new SteelCatwalkBlock(properties);
    }

    public static Block newCatwalkStairBlock(BlockBehaviour.Properties properties) {
        return new SteelCatwalkStairBlock(properties);
    }

    public static @NotNull SlabBlock newVerticalSlabBlock(BlockBehaviour.Properties properties) {
        return new SteelVerticalSlabBlock(properties);
    }

    public static BlockItem newCatwalkBlockItem(Block block, Item.Properties properties) {
        return new SteelCatwalkBlockItem((SteelCatwalkBlock) block, properties);
    }
}
