package com.nero.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.nero.src.input.EnviromentallyMoved;

public class Coin {
	
	private int x;
	private int y;
	private String imagePath= "/images/obstacles/Muenze.png";
	
	
	public Coin(int x, int y){
		
		this.x = x;
		this.y = y;
		
		
	}
	
	public void paint(Graphics2D g2d){
		g2d.drawImage(returnImage(),x,y,null );
		
		
	}
	
	public Image returnImage(){
		
		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
		return i.getImage();
		
	}
	
	public Rectangle getCoinBounds(){
		
		return new Rectangle(x, y, 50,50);
		
	}
	
	public void update(){
		
	this.x += EnviromentallyMoved.environmentVelX;
	this.y += EnviromentallyMoved.environmentVelY;
		
		
	}

}
