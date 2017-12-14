package de.dviol.attributes;

import java.awt.Point;

public abstract class AbstractInworldObject extends GlobalDimension implements Inworldobject {

	public AbstractInworldObject(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public AbstractInworldObject(Point position, int width, int height) {
		super(position, width, height);
		// TODO Auto-generated constructor stub
	}

	public AbstractInworldObject(Point position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	public AbstractInworldObject(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	



}
