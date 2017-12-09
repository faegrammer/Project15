package com.nero.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.Inworldobject;
import com.nero.src.Visible;
import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.GlobalPosition;

public class Coin extends EnviromentallyMoved {
	
	private final static int SIZE = 50;
	private int x;
	private int y;
	private String imagePath = "/images/obstacles/Muenze.png";

	public Coin(int x, int y) {

		this(x, y, SIZE, SIZE);

	}

	public Coin(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public Coin(Point p, int width, int height) {
		super(p, width, height);
	}

	public Coin(Point p) {
		this(p, 50, 50);
	}

	public void paint(Graphics2D g2d) {
		g2d.drawImage(returnImage(), x, y, null);

	}

	public Image returnImage() {

		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
		return i.getImage();

	}

	public Rectangle getCoinBounds() {

		return new Rectangle(x, y, 50, 50);

	}

}
