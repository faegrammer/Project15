package com.nero.helper;

import java.awt.Color;

import com.nero.src.input.Controller;
import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.objects.Player;

public class ScrollerDown extends ScrollerFather {

	public ScrollerDown(int x, int y, boolean visible, int width, int height) {
		super(x, y, visible, Color.yellow, width, height);

	}

	@Override
	public void interact() {
		
		
		EnviromentallyMoved.environmentVelY = -Controller.p.getFallingSpeed();
		
		
	}

}
