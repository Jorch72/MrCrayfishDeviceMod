package com.mrcrayfish.device.api.app.component;

import com.mrcrayfish.device.api.app.Application;

import net.minecraft.client.gui.FontRenderer;

public class TextField extends TextArea {

	/**
	 * Default text field constructor
	 * 
	 * @param left how many pixels from the left
	 * @param top how many pixels from the top
	 * @param width the width of the text field
	 */
	public TextField(int left, int top, int width) 
	{
		super(left, top, width, 15);
	}
}
