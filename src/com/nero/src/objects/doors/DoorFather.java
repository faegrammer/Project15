package com.nero.src.objects.doors;

import java.awt.Point;

import com.nero.src.input.EnviromentallyMovedPaintable;
import com.nero.src.objects.InteractsWithPlayer;
import com.nero.src.objects.doors.keys.KeyFather;

public abstract class DoorFather extends EnviromentallyMovedPaintable implements InteractsWithPlayer {

	public static final int doorWidth = 50;
	public static final int doorHeight = 50;
	public final Identitaeten identity;
	private static String imageOpen;
	private static String imageClosed;
	private boolean closed = true;
	// private static LinkedList<DoorFather> listOfDoors = new
	// LinkedList<DoorFather>();

	public DoorFather(Point p, int width, int height, Identitaeten identity, String imagePathClosed,
			String imagePathOpen) {
		this(p.x, p.y, width, height, identity, imagePathClosed, imagePathOpen);
	}

	public DoorFather(Point p, Identitaeten identity, String imagePathClosed, String imagePathOpen) {
		this(p, doorWidth, doorHeight, identity, imagePathClosed, imagePathOpen);
	}

	public DoorFather(int x, int y, Identitaeten identity, String imagePathClosed, String imagePathOpen) {

		this(x, y, doorWidth, doorHeight, identity, imagePathClosed, imagePathOpen);
	}

	public DoorFather(int x, int y, int width, int height, Identitaeten identity, String imagePathClosed,
			String imagePathOpen) {
		super(x, y, width, height, imagePathClosed);
		imageClosed = imagePathClosed;
		imageOpen = imagePathOpen;
		this.identity = identity;
		// DoorFather.listOfDoors.add(this);
	}

	public boolean isClosed() {
		return this.closed;
	}

	public void switchToOpen() {
		imagePath = imageOpen;
		this.closed = false;
	}

	@Override
	public void interact() {
		if (KeyFather.contains(identity)) {
			switchToOpen();
		}

	}

}
