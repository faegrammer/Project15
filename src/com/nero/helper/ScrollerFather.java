package com.nero.helper;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.nero.src.input.GlobalPosition;

public class ScrollerFather extends GlobalPosition {

	// Attribut zum steuern der Sichtbarkeit der Bouncer
	private boolean visible;
	private int width;
	private int height;

	// Farbe des Bouncers
	private Color color;

	public ScrollerFather(int x, int y, boolean visible, Color color,int width,int height) {
		
		// Leitet die x und y Koordinate an Global Position weiter
		super(x, y);
		// Steuert das Attribut "visible"
		this.visible = visible;
		// Steuert das Attribut "color"
		this.color = color;
		this.width = width;
		this.height = height;

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

		return new Rectangle(x, y, width,height);

	}

	// Updaten musst du auch noch? Spaeter zum Scrollen ja.. mal schauen ob ich's
	// verwende
	public void update() {

		//x += -GlobalPosition.environmentVelX;
		//y += -GlobalPosition.environmentVelY;

	}
	
	public int returnScrollerX(){
		
		return this.x;
		
	}
	
   public int returnScrollerY(){
		
		return this.y;
		
	}
	
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
		
		
	}

	
	
}
