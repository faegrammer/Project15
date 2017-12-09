package com.nero.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.ImageIcon;

import com.nero.helper.BouncerToDown;
import com.nero.helper.BouncerToLeft;
import com.nero.helper.BouncerToRight;
import com.nero.helper.BouncerToUp;
import com.nero.src.input.EnviromentallyMoved;

public class Enemy extends Moveable{

	// Bildpfad
	private String imagePath;
	private String imagePathToRight = "/images/hazard/enemy/gegnerrechts.gif";
	private String imagePathToLeft = "/images/hazard/enemy/gegnerlinks.gif";

	// Breite und HICHWAREINUMLAUThe
	private int enemyWidth = 40;
	private int enemyHeight = 40;

	// Geschwindigkeit von Enemy


	public Enemy(int x, int y, boolean nachrechts) {
		super(x, y);
	Random r = new Random();
	
	if(r.nextBoolean()){
		
		imagePath = "/images/hazard/enemy/gegnerlinks.gif";
		
	}else{
		
		imagePath = "/images/hazard/enemy/gegnerrechts.gif";
	}
		
		
		

	}

	// Collission mit den Bouncern
	public void Collission(LinkedList<BouncerToUp> btu,
			LinkedList<BouncerToRight> btr, LinkedList<BouncerToDown> btd,
			LinkedList<BouncerToLeft> btl) {

		for (int i = 0; i < btu.size(); i++) {

			if (getEnemyBounds().intersects(btu.get(i).getBounds())) {
				// Bricht die Schleife ab
				i = btu.size();
				// Veraenderung der Geschwindigkeit
				velY = -4;
				velX = 0;
			}

		}
		for (int i = 0; i < btd.size(); i++) {

			if (getEnemyBounds().intersects(btd.get(i).getBounds())) {

				i = btd.size();
				velY = 4;
				
				velX = 0;

			}

		}
		for (int i = 0; i < btr.size(); i++) {

			if (getEnemyBounds().intersects(btr.get(i).getBounds())) {

				i = btr.size();
				velX = 4;
				velY = 0;
				imagePath = imagePathToRight; 

			}

		}
		for (int i = 0; i < btl.size(); i++) {

			if (getEnemyBounds().intersects(btl.get(i).getBounds())) {

				i = btl.size();
				velX = -4;
				velY = 0;
				
				imagePath = imagePathToLeft;

			}

		}

	}

	// Methode um Gegner zu malen
	public void paint(Graphics2D g2d) {

		g2d.drawImage(getEnemyImage(), pos.x, pos.y, null);
		// g2d.fill(getEnemyBounds());

	}

	// Funktion um das bild zu bekommen
	public Image getEnemyImage() {

		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));

		return i.getImage();

	}

	// Kollissionsdreieck
	public Rectangle getEnemyBounds() {

		return new Rectangle(pos.x, pos.y, enemyWidth, enemyHeight);
	}
	
	public void setPosition(int x, int y){
		pos.x = x;
		pos.y = y;
		
		
	}

}
