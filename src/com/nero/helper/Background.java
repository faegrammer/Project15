package com.nero.helper;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;


public class Background {
	
	private String imagePath= "/images/Cave.jpg";
	private int x = 0;
	private int y = 0;
	
	
	
	
	public void paint(Graphics2D g2d){
		
		g2d.drawImage(getBackgroundImage(),x, y,null );
		
	}
	

	
	
	
	
	public Image getBackgroundImage(){
		
		ImageIcon i = new ImageIcon(getClass().getResource(imagePath));
		
		return i.getImage();
		
		
	}

}
