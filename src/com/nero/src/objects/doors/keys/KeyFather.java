package com.nero.src.objects.doors.keys;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.GlobalPosition;

public class KeyFather {
	

	protected String imagePath;
	protected int width = 50;
	protected int height = 50;
	protected int x;
	protected int y;
	public boolean visible;
	
	public KeyFather(String imagePath,int x, int y){
		
		this.imagePath = imagePath;
		this.x = x;
		this.y = y;
		
		
	}
	
	
	
	public Rectangle getBounds(){
		
		return new Rectangle(this.x,this.y,this.width,this.height);
		
	}
	
	public void makeVisibility(){
		
			
			this.visible = true;
		
		
	}
	
	public void hideKey(){
		
		this.visible = false;
	}
	
	
	public void paint(Graphics2D g2d){
		if(visible){
		g2d.drawImage(getImage(),x, y ,null );}
		
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