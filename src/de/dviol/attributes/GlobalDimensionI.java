package de.dviol.attributes;

import java.awt.Point;
import java.awt.Rectangle;

public interface GlobalDimensionI {
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

	default boolean isLeft(GlobalDimensionI otherPos) {
		return getRightCorner() < otherPos.getLeftCorner();
	}

	default boolean isOnTop(GlobalDimensionI otherPos) {
		return getLowerCorner() < otherPos.getUpperCorner();
	}
	
	default Rectangle getBounds() {
		return new Rectangle(getPos().x,getPos().y,getWidth(),getHeight());
	}
	

}
