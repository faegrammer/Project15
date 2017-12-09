
package com.nero.src.input;

import java.awt.Point;

public class EnviromentallyMoved extends GlobalPosition {

	public EnviromentallyMoved(int x, int y) {
		super(x, y);
	}

	public EnviromentallyMoved(Point p) {
		super(p);
	}

	public static int environmentVelX;
	public static int environmentVelY;

	public void update() {

		pos.x += environmentVelX;
		pos.y += environmentVelY;

	}

	public static int getEnvironmentVelX() {
		return environmentVelX;
	}

	public static void setEnvironmentVelX(int environmentVelX) {
		EnviromentallyMoved.environmentVelX = environmentVelX;
	}

	public static int getEnvironmentVelY() {
		return environmentVelY;
	}

	public static void setEnvironmentVelY(int environmentVelY) {
		EnviromentallyMoved.environmentVelY = environmentVelY;
	}

}
