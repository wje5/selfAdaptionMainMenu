package com.pinball3d.selfadaptionmainmenu;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class GuiFakeMainMenu extends GuiScreen {
	private static final ResourceLocation texture = new ResourceLocation(
			"selfadaptionmainmenu:textures/gui/mainmenu.png");
	private static final ResourceLocation texture2 = new ResourceLocation(
			"selfadaptionmainmenu:textures/gui/white.png");

	@Override
	public void initGui() {
		this.buttonList.add(new GuiButtonStart(0, this.width / 2 - 32, this.height / 2 - 32 + 70, ""));
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
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
		double width = 1919.0D / 2048.0D;
		double height = 1080.0D / 2048.0D;
		double xOffset = this.width - width;
		double yOffset = this.height - height;
		float f = 0.00390625F;
		bufferbuilder.pos(0, height + yOffset, this.zLevel).tex((0 + 0) * f, (0 + height) * f).endVertex();
		bufferbuilder.pos(width + xOffset, height + yOffset, this.zLevel).tex((0 + width) * f, (0 + height) * f)
				.endVertex();
		bufferbuilder.pos(width + xOffset, 0, this.zLevel).tex((0 + width) * f, (0 + 0) * f).endVertex();
		bufferbuilder.pos(0, 0, this.zLevel).tex((0 + 0) * f, (0 + 0) * f).endVertex();
		tessellator.draw();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
}