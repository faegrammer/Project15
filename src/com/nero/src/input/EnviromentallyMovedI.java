package com.nero.src.input;

import java.awt.Rectangle;

public interface EnviromentallyMovedI extends GlobalPositionI {

	void update();

	Rectangle getBounds();

	int getVelX();

	int getVelY();

}