package com.nero.helper;

import java.awt.Color;

import com.nero.src.input.Controller;

public class ScrollerDown extends ScrollerFather {

	public ScrollerDown(int x, int y, boolean visible, int width, int height) {
		super(x, y, visible, Color.yellow, width, height);

	}

	@Override
	public void update() {
		if (isIntersected()) {
			Controller.getInstance().moveAllNPO(0, Controller.getPlayer().getAbsMaxYSpeed());
		}

	}

}
