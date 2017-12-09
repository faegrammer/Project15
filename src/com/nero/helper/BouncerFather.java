package com.nero.helper;

import java.awt.Color;
import java.awt.Graphics2D;
import com.nero.src.input.EnviromentallyMoved;

//Erklaerung Bouncer: Objekt um Gegner leicht einen Bewegungsbefehl zu geben

public class BouncerFather extends EnviromentallyMoved {

	// Attribut zum steuern der Sichtbarkeit der Bouncer
	private boolean visible;
	private static final int SIZE = 10;

	// Farbe des Bouncers
	private Color color;

	public BouncerFather(int x, int y, boolean visible, Color color) {
		// Leitet die x und y Koordinate an Global Position weiter
		super(x, y, SIZE, SIZE);
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

}
