package com.nero.src.objects.doors.keys;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.EnviromentallyMovedPaintable;
import com.nero.src.objects.Collectable;

public class KeyFather extends EnviromentallyMovedPaintable implements Collectable {

	protected static final int keyWidth = 50;
	protected static final int keyHeight = 50;
	public boolean visible;

	public KeyFather(int x, int y, String imagePath) {

		super(x, y, keyWidth, keyHeight, imagePath);

	}

	public void makeVisibility() {

		this.visible = true;

	}

	public void hideKey() {

		this.visible = false;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub

	}

}