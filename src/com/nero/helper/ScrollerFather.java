package com.nero.helper;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.nero.src.input.GlobalPosition;
import com.nero.src.objects.InteractsWithPlayer;

public abstract class ScrollerFather extends GlobalPosition implements InteractsWithPlayer {

	// Attribut zum steuern der Sichtbarkeit der Bouncer
	private boolean visible;

	// Farbe des Bouncers
	private Color color;

	public ScrollerFather(int x, int y, boolean visible, Color color, int width, int height) {

		// Leitet die x und y Koordinate an Global Position weiter
		super(x, y, width, height);

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
	@Override
	public Rectangle getBounds() {

		return new Rectangle(pos.x, pos.x, getWidth(), getHeight());

	}

}
