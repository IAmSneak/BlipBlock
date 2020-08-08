package com.gmail.sneakdevs;

import com.gmail.sneakdevs.content.blocks.LavaSponges;
import net.fabricmc.api.ModInitializer;


public class SpongesPlus implements ModInitializer {

	@Override
	public void onInitialize() {

		new LavaSponges();

	}

}
