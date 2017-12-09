package com.nero.helper;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;

//Ja auch der Ausgang braucht ein Objekt, der Globalposition ausgibt

public class Exit extends EnviromentallyMoved {

	// Meh... woher bild du haben?

	public String imagePath = "/images/obstacles/Tor.png";

	// Breite und Hoehe des Objekts im Attribut festgehalten

	public int exitWidth = 40;
	public int exitHeight = 40;

	// x und y wert an GlobalPosition ...
	public Exit(int x, int y) {

		super(x, y);

	}

	// Updaten musst du auch noch? Spaeter zum Scrollen ja.. mal schauen ob ich's
	// verwende

	// Erschafft das Kollissionsviereck
	public Rectangle getExitBounds() {

		return new Rectangle(pos.x,pos.y, exitWidth, exitHeight);
	}

	// Paint Klasse um es ueberhaupt darstellen zu koennen....
	public void paint(Graphics2D g2d) {

		g2d.drawImage(getImage(), pos.x,pos.y, null);

	}

	// Methode um das Bild zu holen
	public Image getImage() {

		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));

		return i.getImage();

	}


}
