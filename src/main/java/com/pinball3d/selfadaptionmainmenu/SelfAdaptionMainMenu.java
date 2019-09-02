package com.pinball3d.selfadaptionmainmenu;

import org.lwjgl.opengl.Display;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "selfadaptionmainmenu", name = "Self Adaption Main Menu", version = "1.0.0", clientSideOnly = true)
public class SelfAdaptionMainMenu {
	@Instance("selfadaptionmainmenu")
	public static SelfAdaptionMainMenu instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Display.setTitle(I18n.format("title.name"));
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		new EventLoader();
	}
}
