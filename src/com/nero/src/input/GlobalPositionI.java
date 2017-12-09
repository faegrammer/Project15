package com.nero.src.input;

import java.awt.Point;

public interface GlobalPositionI {

	Point getPos();

	void setPos(Point pos);

	void setPos(int x, int y);

	boolean isXBefore(GlobalPositionI otherPos);
	boolean isYBefore(GlobalPositionI otherPos);
	
}