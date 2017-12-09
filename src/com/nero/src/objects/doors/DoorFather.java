package com.nero.src.objects.doors;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.EnviromentallyMovedPaintable;

public class DoorFather extends EnviromentallyMovedPaintable {

	public static final int doorWidth = 50;
	public static final int doorHeight = 50;
	private final String imageOpen, imageClosed;

	public DoorFather(Point p, int width, int height, String imagePathClosed, String imagePathOpen) {
		this(p.x, p.y, width, height, imagePathClosed, imagePathOpen);
	}

	public DoorFather(Point p, String imagePathClosed, String imagePathOpen) {
		this(p, doorWidth, doorHeight, imagePathClosed, imagePathOpen);
	}

	public DoorFather(int x, int y, String imagePathClosed, String imagePathOpen) {

		this(x, y, doorWidth, doorHeight, imagePathClosed, imagePathOpen);
	}

	public DoorFather(int x, int y, int width, int height, String imagePathClosed, String imagePathOpen) {
		super(x, y, width, height, imagePathClosed);
		this.imageClosed = imagePathClosed;
		this.imageOpen = imagePathOpen;
	}

	public void switchPictures() {

		imagePath = this.imageOpen;

	}

	public void switchBack() {
		imagePath = this.imageClosed;

	}

	public Rectangle getDoorBoundsOben() {

		return new Rectangle(pos.x + 5, pos.y, width - 10, height - 30);
	}

	public Rectangle getDoorBoundsUnten() {

		return new Rectangle(pos.x + 5, pos.y + 30, width - 10, height - 30);
	}

	public Rectangle getDoorBoundsLinks() {

		return new Rectangle(pos.x, pos.y + 10, width - 30, height - 20);
	}

	public Rectangle getDoorBoundsRechts() {

		return new Rectangle(pos.x + 30, pos.y + 10, width - 30, height - 20);
	}

}
