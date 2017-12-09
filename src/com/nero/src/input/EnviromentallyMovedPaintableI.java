package com.nero.src.input;

import java.awt.Graphics2D;
import java.awt.Image;

public interface EnviromentallyMovedPaintableI extends EnviromentallyMovedI {

	Image getImage();

	// Methode um Gegner zu malen
	void paint(Graphics2D g2d);

}