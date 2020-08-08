package com.gmail.sneakdevs;

import com.gmail.sneakdevs.content.blocks.*;
import net.fabricmc.api.ModInitializer;


public class BlipBlock implements ModInitializer {

	@Override
	public void onInitialize() {
		new DyeBlocks();
		new BlockOfRepeater();
		new FlintBlocks();
		new RandomWordBlocks();
		new StainedPlanks();
		new CagedSeaLantern();
	}

}
