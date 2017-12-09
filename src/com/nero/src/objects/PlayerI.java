package com.nero.src.objects;

import java.awt.event.KeyEvent;

public interface PlayerI extends MoveablePaintableI {

	int playerWidth = 33;
	int playerHeight = 50;

	void update();
	/**
	 * 
	 * @return true = Player facing right false = Player facing left
	 */
	boolean rightOriented();
	void setVelx(int newVelX);
	void setVelY(int newVelY);
	
	void mayRight(boolean mayRight);
	void mayLeft(boolean mayLeft);
	void mayUp(boolean mayUp);
	void mayDown(boolean mayDown);
	
	boolean wantRight();
	boolean wantLeft();
	boolean wantUp();
	boolean wantDown();
	
	

	void keyPressed(KeyEvent e);

}