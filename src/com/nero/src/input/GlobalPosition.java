package com.nero.src.input;

import java.awt.Point;

public class GlobalPosition {
	protected Point pos;

	public GlobalPosition(int x, int y) {

		this(new Point(x, y));

	}

	public GlobalPosition(Point p) {
		pos = new Point(p.x, p.y);
	}
	
	public void setPosition(int x, int y) {
		setPos(new Point(x, y));

	}
	
	public Point getPos() {
		return pos;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}
	
	public void setPos(int x, int y) {
		this.pos = new Point(x,y);
	}
}
