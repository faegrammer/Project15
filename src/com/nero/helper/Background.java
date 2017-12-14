package com.nero.helper;

import java.awt.Point;

import com.nero.src.input.Paintable;

public class Background extends Paintable implements BackgroundI {
	private static final String backgroundImagePath = "/images/Cave.jpg";

	public Background(int x, int y, int width, int height, String imagePath) {
		super(x, y, width, height, imagePath);
	}

	public Background(Point p, int width, int height, String imagePath) {
		this(p.x, p.y, width, height, imagePath);
	}

	public Background() {
		this(0, 0, 0, 0, backgroundImagePath);
	}

}
