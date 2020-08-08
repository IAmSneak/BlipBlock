package com.gmail.sneakdevs.content.blocks;

import com.gmail.sneakdevs.content.types.*;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class FlintBlocks {

    public static final BlockBase BLOCK_OF_FLINT = new BlockBase("block_of_flint", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.ANCIENT_DEBRIS, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 0);
    public static final PillarBase FLINT_PILLAR = new PillarBase("flint_pillar", 0.8f, 0.8f,Material.STONE, BlockSoundGroup.ANCIENT_DEBRIS, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES,  0);
    public static final BlockBase SMOOTH_FLINT_BLOCK = new BlockBase("smooth_flint_block", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.ANCIENT_DEBRIS, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 0);
    public static final BlockBase FLINT_BRICK = new BlockBase("flint_brick", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.ANCIENT_DEBRIS, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 0);
    public static final PillarBase CHISELED_FLINT_BLOCK = new PillarBase("chiseled_flint_block", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.ANCIENT_DEBRIS, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 0);

    public static final StairsBase SMOOTH_FLINT_STAIRS = new StairsBase(SMOOTH_FLINT_BLOCK.getDefaultState(), "smooth_flint_stairs", SMOOTH_FLINT_BLOCK, ItemGroup.BUILDING_BLOCKS);
    public static final StairsBase FLINT_STAIRS = new StairsBase(BLOCK_OF_FLINT.getDefaultState(), "flint_stairs", BLOCK_OF_FLINT, ItemGroup.BUILDING_BLOCKS);

    public static final SlabBase SMOOTH_FLINT_SLAB = new SlabBase("smooth_flint_slab", SMOOTH_FLINT_BLOCK, ItemGroup.BUILDING_BLOCKS);
    public static final SlabBase FLINT_SLAB = new SlabBase("flint_slab", BLOCK_OF_FLINT, ItemGroup.BUILDING_BLOCKS);
}