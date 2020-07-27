package com.gmail.sneakdevs;

import com.gmail.sneakdevs.content.blocks.BlockOfRepeater;
import com.gmail.sneakdevs.content.blocks.FlintBlocks;
import net.fabricmc.api.ModInitializer;
import com.gmail.sneakdevs.content.blocks.DyeBlocks;


public class BlipBlock implements ModInitializer {

	@Override
	public void onInitialize() {
		new DyeBlocks();
		new BlockOfRepeater();
		new FlintBlocks();
	}

}
