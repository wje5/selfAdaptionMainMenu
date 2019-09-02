package com.pinball3d.selfadaptionmainmenu;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiFakeMainMenu extends GuiScreen {
	private static final ResourceLocation texture = new ResourceLocation(
			"selfadaptionmainmenu:textures/gui/mainmenu.png");

	@Override
	public void initGui() {
		this.buttonList.add(new GuiButtonStart(0, this.width / 2 - 32, this.height / 2 - 32 + 70, ""));
		System.out.println(this.width + "|" + this.height);
		super.initGui();
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if (button.id == 0) {
			this.mc.displayGuiScreen(new GuiMultiplayer(this));
		}
		super.actionPerformed(button);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.mc.getTextureManager().bindTexture(texture);
		Tools.drawStretchableImageRect(0, 0, this.width, this.height, 0, 0, 256 * (1919.0D / 2048.0D),
				256 * (1080.0D / 2048.0D), this.zLevel);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
}