package com.nero.src.input;

import java.awt.Point;

public interface GlobalPositionI {

	Point getPos();

	default int getRightCorner() {
		return getLeftCorner() + getWidth();
	}

	default int getLeftCorner() {
		return getPos().x;
	}

	default int getUpperCorner() {
		return getPos().y;

	}

	default int getLowerCorner() {
		return getUpperCorner() + getHeight();
	}

	int getWidth();

	int getHeight();

	void setPos(Point pos);

	void setPos(int x, int y);

	void move(int x, int y);

	void move(Point vektor);

	default boolean isLeft(GlobalPositionI otherPos) {
		return getRightCorner() < otherPos.getLeftCorner();
	}

	default boolean isOnTop(GlobalPositionI otherPos) {
		return getLowerCorner() < otherPos.getUpperCorner();
	}

}