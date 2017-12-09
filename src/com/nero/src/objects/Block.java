package com.nero.src.objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.Game;
import com.nero.src.input.GlobalPosition;

public class Block {

	public String imagePath = "/images/obstacles/Kiste.png";
	// Breite und hICHWAREINUMLAUThe des Blocks
	public static int obstacleWidth = 50;
	public static int obstacleHeight = 50;
	// x und y koordinate des Blocks
	public int x;
	public int y;

	public Block(int x, int y) {

		this.x = x;
		this.y = y;

	}

	// Malmethode

	public void draw(Graphics2D g2d) {

		g2d.drawImage(getObstacleImage(), x, y, null);

		if(Game.allessichtbar){
		  //Kollissionsrechteck Rechts
		  
		  g2d.setColor(Color.YELLOW); g2d.fill(getObstacleBoundsRechts());
		  //Kollissionsrechteck Links
		  
		  g2d.setColor(Color.CYAN); g2d.fill(getObstacleBoundsLinks());
		  //Kollissionsrechteck Oben
		 
		  g2d.setColor(Color.GREEN); g2d.fill(getObstacleBoundsOben());
		  //Kollissionsrechteck Unten
		  
		  g2d.setColor(Color.MAGENTA); g2d.fill(getObstacleBoundsUnten());
		  
		  //Das Gesamte Obstacle als Rechteck ausgedrueckt
		  g2d.setColor(Color.BLACK); g2d.drawRect(x, y,
		  this.getObstacleWidth(), this.getObstacleHeight());
		}}

	// Updatemethode....
	public void update() {

		x += GlobalPosition.environmentVelX;
		y += GlobalPosition.environmentVelY;

	}

	// Alle Kollissionsdreiecke
	public Rectangle getObstacleBoundsOben() {

		return new Rectangle(this.getXCoord() + 5, this.getYCoord(),
				this.getObstacleWidth() - 10, this.getObstacleHeight() - 30);
	}

	public Rectangle getObstacleBoundsUnten() {

		return new Rectangle(this.getXCoord() + 5, this.getYCoord() + 30,
				this.getObstacleWidth() - 10, this.getObstacleHeight() - 30);
	}

	public Rectangle getObstacleBoundsLinks() {

		return new Rectangle(this.getXCoord(), this.getYCoord() + 10,
				this.getObstacleWidth() - 30, this.getObstacleHeight() - 20);
	}

	public Rectangle getObstacleBoundsRechts() {

		return new Rectangle(this.getXCoord() + 30, this.getYCoord() + 10,
				this.getObstacleWidth() - 30, this.getObstacleHeight() - 20);
	}

	public Rectangle getBounds() {

		return new Rectangle(this.getXCoord(), this.getYCoord(),
				this.getObstacleWidth(), this.getObstacleHeight());

	}

	// Funktion um das Bild zu holen
	public Image getObstacleImage() {

		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
		return i.getImage();

	}

	// Getter u. Setter

	public int getXCoord() {

		return this.x;
	}

	public int getYCoord() {
		return this.y;
	}

	public int getObstacleWidth() {

		return obstacleWidth;

	}

	public int getObstacleHeight() {

		return obstacleHeight;

	}
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
		
		
	}

}
