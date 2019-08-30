package com.pinball3d.selfadaptionmainmenu;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "selfadaptionmainmenu", name = "Self Adaption Main Menu", version = "1.0.0", clientSideOnly = true)
public class SelfAdaptionMainMenu {
	@Instance("selfadaptionmainmenu")
	public static SelfAdaptionMainMenu instance;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		new EventLoader();
	}
}
