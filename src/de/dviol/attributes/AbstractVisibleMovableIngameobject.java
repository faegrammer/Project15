package de.dviol.attributes;

import java.awt.Point;

public abstract class AbstractVisibleMovableIngameobject
		extends
			AbstractInworldObject
		implements
			Paintable,
			Selfmoving {
	private int velX,velY;
	private int maxVelX, maxVelY = 0;
	public final static String PATHT_TO_IMAGES = "/images/";
	private String imagePath;

	public AbstractVisibleMovableIngameobject(int x, int y, int width,
			int height, int maxVelx, int maxVely, String imagePath) {
		super(x, y, width, height);
		this.maxVelX = maxVelx;
		this.maxVelY = maxVelx;
		this.imagePath = imagePath;

	}

	public AbstractVisibleMovableIngameobject(Point position, int width,
			int height, int maxVelx, int maxVely, String imagePath) {
		this(position.x,position.y,width,height,maxVelx,maxVely,imagePath);
	}

	public AbstractVisibleMovableIngameobject(Point position) {
		super(position);
	}

	public AbstractVisibleMovableIngameobject(int x, int y) {
		super(x, y);
	}

	@Override
	public void update() {

	}

	@Override
	public int getVelX() {
		return velX;
	}

	@Override
	public int getVelY() {
		return velY;
	}

	public int getMaxVelX() {
		return maxVelX;
	}

	public int getMaxVelY() {
		return maxVelY;
	}

	@Override
	public String getImagePath() {
		return imagePath;
	}

}
