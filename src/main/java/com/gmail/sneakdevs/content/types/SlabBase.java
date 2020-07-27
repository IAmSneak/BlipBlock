package com.gmail.sneakdevs.content.types;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabBase extends SlabBlock {

    public SlabBase(String name, AbstractBlock copy, ItemGroup group) {

        super(FabricBlockSettings.copy(copy));
        Registry.register(Registry.BLOCK, new Identifier("blipblock", name), this);
        Registry.register(Registry.ITEM,new Identifier("blipblock", name), new BlockItem(this, new Item.Settings().maxCount(64).group(group)));

    }
}