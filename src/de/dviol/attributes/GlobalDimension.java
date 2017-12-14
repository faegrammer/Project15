package de.dviol.attributes;

import java.awt.Point;

public abstract class GlobalDimension implements GlobalDimensionI {

	private Point position;
	private int width,height;
	
	public GlobalDimension(Point position) {
		this(position,0,0);
	}
	
	public GlobalDimension(int x, int y) {
		this(x,y,0,0);
	}
	
	
	public GlobalDimension(Point position,int width, int height) {
	 this(position.x,position.y,width,height);	
	}
	
	public GlobalDimension(int x, int y,int width, int height) {
		this.position = new Point(x,y);
		this.width = width;
		this.height = height;
	}
	
	public int x() {
		return position.x;
	}
	
	public int y() {
		return position.y;
	}
	
	
	
	@Override
	public Point getPositionRef() {
		return position;
	}
	

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setPosition(Point position) {
		this.position = new Point(position);
	}

	@Override
	public void setPosition(int x, int y) {
		setPosition(new Point(x,y));
	}

	@Override
	public void move(int x, int y) {
		position = new Point(x() + x, y() + y);
	}

	@Override
	public void move(Point vektor) {
		move(vektor.x,vektor.y);
	}

}
