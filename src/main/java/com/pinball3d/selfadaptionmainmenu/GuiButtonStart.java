package com.pinball3d.selfadaptionmainmenu;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiButtonStart extends GuiButton {
	public static final ResourceLocation texture = new ResourceLocation("selfadaptionmainmenu:textures/gui/start.png");

	public GuiButtonStart(int buttonId, int x, int y, int width, int height, String buttonText) {
		super(buttonId, x, y, width, height, buttonText);
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
		this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width
				&& mouseY < this.y + this.height;
		mc.getTextureManager().bindTexture(texture);
		Tools.drawStretchableImageRect(181.0D / 427.0D * mc.currentScreen.width,
				158.0D / 240.0D * mc.currentScreen.height, 64.0D / 427.0D * mc.currentScreen.width,
				64.0D / 240.0D * mc.currentScreen.height, 0.0D, this.hovered ? 64.0D : 0.0D, 64.0D, 64.0D, this.zLevel);

	}
}
