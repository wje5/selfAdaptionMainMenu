package com.pinball3d.selfadaptionmainmenu;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class Tools {
	public static void drawStretchableImageRect(double x, double y, double width, double height, double u, double v,
			double uvWidth, double uvHeight, float zLevel) {
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
		float f = 0.00390625F;
		bufferbuilder.pos(x, y + height, zLevel).tex(u * f, (v + uvHeight) * f).endVertex();
		bufferbuilder.pos(x + width, y + height, zLevel).tex((u + uvWidth) * f, (v + uvHeight) * f).endVertex();
		bufferbuilder.pos(x + width, y, zLevel).tex((u + uvWidth) * f, v * f).endVertex();
		bufferbuilder.pos(x, y, zLevel).tex(u * f, v * f).endVertex();
		tessellator.draw();
	}
}
