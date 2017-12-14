package de.dviol.attributes;

import java.awt.Point;
import java.awt.Rectangle;

public interface GlobalDimensionI {
	Point getPositionRef();

	default int getRightCorner() {
		return getLeftCorner() + getWidth();
	}

	default int getLeftCorner() {
		return getPositionRef().x;
	}

	default int getUpperCorner() {
		return getPositionRef().y;

	}

	default int getLowerCorner() {
		return getUpperCorner() + getHeight();
	}
	
	int x();
	int y();

	int getWidth();

	int getHeight();

	void setPosition(Point pos);

	void setPosition(int x, int y);

	void move(int x, int y);

	void move(Point vektor);

	default boolean isLeft(GlobalDimensionI otherPos) {
		return getRightCorner() < otherPos.getLeftCorner();
	}

	default boolean isOnTop(GlobalDimensionI otherPos) {
		return getLowerCorner() < otherPos.getUpperCorner();
	}
	
	default Rectangle getBounds() {
		return new Rectangle(getPositionRef().x,getPositionRef().y,getWidth(),getHeight());
	}
	

}
