package com.nero.src.objects.doors.keys;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.Paintable;
import com.nero.src.objects.Collectable;
import com.nero.src.objects.doors.Identitaeten;

public class KeyFather extends Paintable implements Collectable {
	public final Identitaeten keyIdent;
	protected static final int keyWidth = 50;
	protected static final int keyHeight = 50;
	public boolean visible;
	private static LinkedList<Identitaeten> idenitaet = new LinkedList<Identitaeten>();

	public KeyFather(int x, int y, Identitaeten keyIdent, String imagePath) {

		super(x, y, keyWidth, keyHeight, imagePath);
		this.keyIdent = keyIdent;

	}

	public void makeVisibility() {

		this.visible = true;

	}

	public void hideKey() {

		this.visible = false;
	}

	public static boolean contains(Identitaeten id) {
		for (Identitaeten identitaeten : idenitaet) {
			if (identitaeten == id) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void interact() {
		idenitaet.add(this.keyIdent);

	}

}