package com.nero.src.input;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class EnviromentallyMovedPaintable extends EnviromentallyMoved implements EnviromentallyMovedPaintableI {
	protected String imagePath;

	public EnviromentallyMovedPaintable(int x, int y, int width, int height, String imagePath) {
		super(x, y, width, height);
		this.imagePath = imagePath;
		// TODO Auto-generated constructor stub
	}

	public EnviromentallyMovedPaintable(Point p, int width, int height, String imagePath) {
		this(p.x, p.y, width, height, imagePath);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.input.EnviromentallyMovedPaintableI#getImage()
	 */
	@Override
	public Image getImage() {

		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));

		return i.getImage();
	}

	// Methode um Gegner zu malen
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nero.src.input.EnviromentallyMovedPaintableI#paint(java.awt.Graphics2D)
	 */
	@Override
	public void paint(Graphics2D g2d) {

		g2d.drawImage(getImage(), pos.x, pos.y, null);
		// g2d.fill(getEnemyBounds());

	}

}
