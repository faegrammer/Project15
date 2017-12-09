package com.nero.helper;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.nero.src.input.EnviromentallyMoved;

//Erklaerung Bouncer: Objekt um Gegner leicht einen Bewegungsbefehl zu geben

public class BouncerFather extends EnviromentallyMoved {

	// Attribut zum steuern der Sichtbarkeit der Bouncer
	private boolean visible;

	// Farbe des Bouncers
	private Color color;

	public BouncerFather(int x, int y, boolean visible, Color color) {
		// Leitet die x und y Koordinate an Global Position weiter
		super(x, y);
		// Steuert das Attribut "visible"
		this.visible = visible;
		// Steuert das Attribut "color"
		this.color = color;

	}

	// Paint Klasse um es ueberhaupt darstellen zu koennen....
	public void paint(Graphics2D g2d) {
		// Wenn sichtbar, dann zeig's mir auch an.
		if (visible) {
			g2d.setColor(color);
			g2d.fill(getBounds());

		}

	}

	// Erschafft das Kollissionsviereck
	public Rectangle getBounds() {

		return new Rectangle(pos.x, pos.y, 10, 10);

	}

	


}
