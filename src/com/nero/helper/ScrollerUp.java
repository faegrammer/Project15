package com.nero.helper;

import java.awt.Color;

import com.nero.src.input.Controller;

public class ScrollerUp extends ScrollerFather {

	public ScrollerUp(int x, int y, boolean visible, int width, int height) {
		super(x, y, visible, Color.black, width, height);

	}

	@Override
	public void update() {
		if (isIntersected()) {
			Controller.getInstance().moveAllNPO(0, -Controller.getPlayer().getAbsMaxYSpeed());
		}

	}

}
