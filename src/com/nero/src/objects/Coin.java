package com.nero.src.objects;

import java.awt.Point;

import com.nero.src.input.EnviromentallyMovedPaintable;

public class Coin extends EnviromentallyMovedPaintable implements Collectable {

	private final static int SIZE = 50;
	private static final String coinImagePath = "/images/obstacles/Muenze.png";

	public Coin(int x, int y) {

		this(x, y, SIZE, SIZE);

	}

	public Coin(int x, int y, int width, int height) {
		super(x, y, width, height, coinImagePath);
	}

	public Coin(Point p, int width, int height) {
		this(p.x, p.y, width, height);
	}

	public Coin(Point p) {
		this(p, SIZE, SIZE);
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub

	}

	// public void paint(Graphics2D g2d) {
	// g2d.drawImage(returnImage(), x, y, null);
	//
	// }
	//
	// public Image returnImage() {
	//
	// ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
	// return i.getImage();
	//
	// }
	//
	// public Rectangle getCoinBounds() {
	//
	// return new Rectangle(x, y, 50, 50);
	//
	// }

}
