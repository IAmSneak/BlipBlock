package com.gmail.sneakdevs.content.types;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HandPillarBase extends PillarBlock {

    public HandPillarBase(String name, float hardness, float resistance, Material material, BlockSoundGroup sound, ItemGroup itemgroup, Tag<Item> tag, int miningLevel) {

        super(FabricBlockSettings.of(material).sounds(sound).strength(hardness, resistance).breakByTool(tag, miningLevel));
        Registry.register(Registry.BLOCK, new Identifier("blipblock", name), this);
        Registry.register(Registry.ITEM,new Identifier("blipblock", name), new BlockItem(this, new Item.Settings().maxCount(64).group(itemgroup)));

    }
}