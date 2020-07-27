package com.gmail.sneakdevs.content.blocks;

import com.gmail.sneakdevs.content.types.DirectionalBase;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class BlockOfRepeater {

    public static final DirectionalBase BLOCK_OF_REPEATER = new DirectionalBase("block_of_repeater", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.STONE, ItemGroup.DECORATIONS, FabricToolTags.PICKAXES, 1);

}