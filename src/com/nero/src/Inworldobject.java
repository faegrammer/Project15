package com.nero.src;

import java.awt.Rectangle;

import com.nero.src.input.GlobalPositionI;

public interface Inworldobject extends GlobalPositionI {

	public void update();

	public Rectangle getBounds();

}
