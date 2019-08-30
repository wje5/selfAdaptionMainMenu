package com.pinball3d.selfadaptionmainmenu;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventLoader {
	public EventLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent()
	public void openGui(GuiOpenEvent event) {
		if (event.getGui() instanceof GuiMainMenu) {
			System.out.println(1111111);
			event.setGui(new GuiFakeMainMenu());
		}
	}
}
