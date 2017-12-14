package de.dviol.model;

import java.awt.Point;

import de.dviol.attributes.AbstractVisibleMovableIngameobject;

public class Player extends AbstractVisibleMovableIngameobject
		implements
			PlayerI {

	public Player(int x, int y, int width, int height, int maxVelx, int maxVely,
			String imagePath) {
		super(x, y, width, height, maxVelx, maxVely, imagePath);
		// TODO Auto-generated constructor stub
	}

	public Player(Point position, int width, int height, int maxVelx,
			int maxVely, String imagePath) {
		super(position, width, height, maxVelx, maxVely, imagePath);
		// TODO Auto-generated constructor stub
	}

	public Player(Point position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	public Player(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

}
