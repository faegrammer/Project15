package com.nero.helper;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.EnviromentallyMovedPaintable;

//Ja auch der Ausgang braucht ein Objekt, der Globalposition ausgibt

public class Exit extends EnviromentallyMovedPaintable {

	// Meh... woher bild du haben?

	public static final String exitImagePath = "/images/obstacles/Tor.png";

	// Breite und Hoehe des Objekts im Attribut festgehalten

	public static final int exitWidth = 40;
	public static final int exitHeight = 40;

	// x und y wert an GlobalPosition ...
	public Exit(int x, int y) {

		super(x, y,exitWidth,exitHeight,exitImagePath);

	}

//	// Updaten musst du auch noch? Spaeter zum Scrollen ja.. mal schauen ob ich's
//	// verwende
//
//	// Erschafft das Kollissionsviereck
//	public Rectangle getBounds() {
//
//		return new Rectangle(pos.x,pos.y, exitWidth, exitHeight);
//	}
//
//	// Paint Klasse um es ueberhaupt darstellen zu koennen....
//	public void paint(Graphics2D g2d) {
//
//		g2d.drawImage(getImage(), pos.x,pos.y, null);
//
//	}
//
//	// Methode um das Bild zu holen
//	public Image getImage() {
//
//		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
//
//		return i.getImage();
//
//	}


}
