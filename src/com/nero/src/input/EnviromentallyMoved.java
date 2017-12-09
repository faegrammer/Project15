
package com.nero.src.input;

import java.awt.Point;
import java.awt.Rectangle;

import com.nero.src.Inworldobject;

public abstract class EnviromentallyMoved extends GlobalPosition implements Inworldobject {

	
	
	
	public EnviromentallyMoved(int x, int y, int width, int height) {
		super(x, y,width,height);
	}

	public EnviromentallyMoved(Point p,int width, int height) {
		super(p,width,height);
	}

	public static int environmentVelX;
	public static int environmentVelY;

	@Override
	public void update() {

		pos.x += environmentVelX;
		pos.y += environmentVelY;

	}

	public static int getEnvironmentVelX() {
		return environmentVelX;
	}

	public static void setEnvironmentVelX(int environmentVelX) {
		EnviromentallyMoved.environmentVelX = environmentVelX;
	}

	public static int getEnvironmentVelY() {
		return environmentVelY;
	}

	public static void setEnvironmentVelY(int environmentVelY) {
		EnviromentallyMoved.environmentVelY = environmentVelY;
	}
	@Override
	public Rectangle getBounds() {

		return new Rectangle(pos.x, pos.y, width,height);
	}



}
