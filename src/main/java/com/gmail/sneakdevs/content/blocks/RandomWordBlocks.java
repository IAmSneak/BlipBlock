package com.gmail.sneakdevs.content.blocks;

import com.gmail.sneakdevs.content.types.BlockBase;
import com.gmail.sneakdevs.content.types.LightBlockBase;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class RandomWordBlocks {

    public static final BlockBase WAZZASOFT_BLOCK = new BlockBase("wazzasoft_block", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.WOOL, ItemGroup.BUILDING_BLOCKS, FabricToolTags.HOES, 0);
    public static final LightBlockBase BOACONIC_BLOCK = new LightBlockBase("boaconic_block", 4.0f, 8.0f, Material.STONE, BlockSoundGroup.NETHERITE, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 3, 6);

}