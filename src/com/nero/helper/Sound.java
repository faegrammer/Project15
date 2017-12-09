package com.nero.helper;

import java.applet.Applet;
import java.applet.AudioClip;

import com.nero.src.Game;


public class Sound {
	
	private AudioClip clip;
	public AudioClip clipper = null;
	public static boolean doing = true;
	private String filname;
	

	public Sound(String filename){
		this.filname = filename;

}
	
	

	public void playMusic(){
		try{
			
			clip = Applet.newAudioClip(Sound.class.getResource(this.filname));
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		try{
			new Thread(){
		
				@Override
				public void run(){
				if(Game.soundOn){	
					clip.loop();}
					
				}	
			
		}.start();}
		catch(Exception e){
			
			e.printStackTrace();
		}	
		
		
	}
	
	public void playSound(){
			
		try{
			
		 this.clipper = Applet.newAudioClip(Sound.class.getResource(this.filname));
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		try{
		
				this.clipper.loop();}
			
			
		
		catch(Exception e){
			
			e.printStackTrace();
		}	
		
		
	}
	
	public void playSoundOnce(){
		try{
			
			 this.clipper = Applet.newAudioClip(Sound.class.getResource(this.filname));
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
			try{
			
					this.clipper.play();}
				
				
			
			catch(Exception e){
				
				e.printStackTrace();
			}	
		
		
	}
	
	public void stopSound(){
		
		
		try{
			
		this.clipper.stop();
			
		}catch(Exception e){
			
			//e.printStackTrace();
		}
		
		
	}
	
  
	
	
	

}
