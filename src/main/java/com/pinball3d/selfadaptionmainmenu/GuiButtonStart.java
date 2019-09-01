package com.pinball3d.selfadaptionmainmenu;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiButtonStart extends GuiButton {
	public static final ResourceLocation texture = new ResourceLocation("selfadaptionmainmenu:textures/gui/start.png");

	public GuiButtonStart(int buttonId, int x, int y, String buttonText) {
		super(buttonId, x, y, 64, 64, buttonText);
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
		this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width
				&& mouseY < this.y + this.height;
//		SimpleTexture itextureobject = new SimpleTexture(texture);
//		mc.getTextureManager().loadTexture(texture, itextureobject);
//		GlStateManager.bindTexture(itextureobject.getGlTextureId());
		mc.getTextureManager().bindTexture(texture);
		this.drawTexturedModalRect(this.x, this.y, 0, this.hovered ? 64 : 0, 64, 64);
	}

	@Override
	public boolean mousePressed(Minecraft mc, int mouseX, int mouseY) {
		return this.enabled && this.visible && mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width
				&& mouseY < this.y + this.height;
	}
}
