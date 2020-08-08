package com.gmail.sneakdevs.content.types;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WoodenButtonBase extends WoodButtonBlock {

    public WoodenButtonBase(String name) {
        super(FabricBlockSettings.of(Material.SUPPORTED).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES, 0).noCollision().strength(0.5f, 0.5f));
        Registry.register(Registry.BLOCK, new Identifier("blipblock", name), this);
        Registry.register(Registry.ITEM,new Identifier("blipblock", name), new BlockItem(this, new Item.Settings().maxCount(64).group(ItemGroup.REDSTONE)));
    }

}