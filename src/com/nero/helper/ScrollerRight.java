package com.nero.helper;

import java.awt.Color;

import com.nero.src.input.Controller;

public class ScrollerRight extends ScrollerFather {

	public ScrollerRight(int x, int y, boolean visible, int width, int height) {
		super(x, y, visible, Color.green, width, height);

	}

	@Override
	public void update() {
		if (isIntersected()) {
			Controller.getInstance().moveAllNPO(Controller.getPlayer().getAbsMaxXSpeed(), 0);
		}
	}

}
