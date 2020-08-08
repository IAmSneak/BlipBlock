package com.gmail.sneakdevs.content.blocks;

import com.gmail.sneakdevs.content.types.AdvancedLavaSpongeBase;
import com.gmail.sneakdevs.content.types.LavaSpongeBase;
import com.gmail.sneakdevs.content.types.StrongLavaSpongeBase;
import com.gmail.sneakdevs.content.types.WetLavaSpongeBase;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;


public class LavaSponges {

    public static final LavaSpongeBase LAVA_SPONGE = new LavaSpongeBase("lava_sponge", 0.6f, 0.6f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);
    public static final WetLavaSpongeBase SATURATED_LAVA_SPONGE = new WetLavaSpongeBase("saturated_lava_sponge", 0.6f, 0.6f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);

    public static final StrongLavaSpongeBase STRONG_LAVA_SPONGE = new StrongLavaSpongeBase("strong_lava_sponge", 0.6f, 0.6f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);
    public static final WetLavaSpongeBase STRONG_SATURATED_LAVA_SPONGE = new WetLavaSpongeBase("strong_saturated_lava_sponge", 0.6f, 0.6f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);

    public static final AdvancedLavaSpongeBase ADVANCED_LAVA_SPONGE = new AdvancedLavaSpongeBase("advanced_lava_sponge", 0.6f, 0.6f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);
    public static final WetLavaSpongeBase ADVANCED_SATURATED_LAVA_SPONGE = new WetLavaSpongeBase("advanced_saturated_lava_sponge", 0.6f, 0.6f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);

}