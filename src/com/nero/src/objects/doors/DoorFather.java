package com.nero.src.objects.doors;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.GlobalPosition;

public class DoorFather {
	
	protected String imagePathOpen;
	protected String imagePathClosed;
	protected String imagePath;
	protected int width = 50;
	protected int height = 50;
	protected int x;
	protected int y;
	
	public DoorFather(String imagePathOpen, String imagePathClosed,int x, int y){
		
		this.imagePathOpen = imagePathOpen;
		this.imagePathClosed = imagePathClosed;
		this.imagePath = imagePathClosed;
		this.x = x;
		this.y = y;
		
		
	}
	
	public void switchPictures(){
	
		imagePath = this.imagePathOpen;
			
	}
	
	public void switchBack(){
		imagePath = this.imagePathClosed;
		
	}
	
	public Rectangle getBounds(){
		
		return new Rectangle(this.x,this.y,this.width,this.height);
		
	}
	
	public Rectangle getDoorBoundsOben() {

		return new Rectangle(this.x + 5, this.y,
				this.width - 10, this.height - 30);
	}

	public Rectangle getDoorBoundsUnten() {

		return new Rectangle(this.x + 5, this.y + 30,
				this.width - 10, this.height - 30);
	}

	public Rectangle getDoorBoundsLinks() {

		return new Rectangle(this.x, this.y + 10,
				this.width - 30, this.height - 20);
	}

	public Rectangle getDoorBoundsRechts() {

		return new Rectangle(this.x + 30, this.y + 10,
				this.width - 30, this.height - 20);
	}
	
	
	public void paint(Graphics2D g2d){
		
		g2d.drawImage(getImage(),x, y ,null );
		
	}
	
	public Image getImage(){
		
		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
		
		return i.getImage();
		
	}
	
	public void update(){
		
	 this.x += GlobalPosition.environmentVelX;
	 this.y += GlobalPosition.environmentVelY;
		
	}
	
	public void setPosition(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	

}
