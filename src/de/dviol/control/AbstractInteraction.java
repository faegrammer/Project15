package de.dviol.control;

import java.awt.Point;

import de.dviol.attributes.InteractsWithPlayer;

public abstract class AbstractInteraction implements InteractsWithPlayer {

	@Override
	public Point getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPos(Point pos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(Point vektor) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isIntersected() {
		// TODO Auto-generated method stub
		return false;
	}

}
