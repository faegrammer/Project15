package com.nero.src.objects;

import java.awt.Point;

import com.nero.src.input.EnviromentallyMoved;

public class Moveable extends EnviromentallyMoved {
	protected int velX;
	protected int velY;

	public Moveable(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Moveable(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update() {

		super.update();
		pos.x += velX;
		pos.y += velY;
	}

}
