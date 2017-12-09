package com.nero.src.objects.doors;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.EnviromentallyMovedPaintable;
import com.nero.src.objects.InteractsWithPlayer;

public abstract class DoorFather extends EnviromentallyMovedPaintable implements InteractsWithPlayer {

	public static final int doorWidth = 50;
	public static final int doorHeight = 50;
	public final Identitaeten identity;
	private static String imageOpen;
	private static String imageClosed;
	private boolean closed;
	private static LinkedList<DoorFather> listOfDoors = new LinkedList<DoorFather>();

	public DoorFather(Point p, int width, int height,Identitaeten identity, String imagePathClosed, String imagePathOpen) {
		this(p.x, p.y, width, height,identity, imagePathClosed, imagePathOpen);
	}

	public DoorFather(Point p,Identitaeten identity, String imagePathClosed, String imagePathOpen) {
		this(p, doorWidth, doorHeight,identity, imagePathClosed, imagePathOpen);
	}

	public DoorFather(int x, int y,Identitaeten identity, String imagePathClosed, String imagePathOpen) {

		this(x, y, doorWidth, doorHeight,identity, imagePathClosed, imagePathOpen);
	}

	public DoorFather(int x, int y, int width, int height,Identitaeten identity, String imagePathClosed, String imagePathOpen) {
		super(x, y, width, height, imagePathClosed);
		imageClosed = imagePathClosed;
		imageOpen = imagePathOpen;
		this.identity = identity;
		DoorFather.listOfDoors.add(this);
		closed = true;
	}
	
	public static void resetAllDoors() {
		for (DoorFather doorFather : listOfDoors) {
			doorFather.switchToClosed();
		}
	}

	public void switchToOpen() {
		
		imagePath = imageOpen;
		closed = false;
	}

	public void switchToClosed() {
		imagePath = imageClosed;
		closed = true;
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
	@Override
	public void interact() {
		
	}

}
