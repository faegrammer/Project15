package com.nero.src.input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.nero.helper.BouncerToDown;
import com.nero.helper.BouncerToLeft;
import com.nero.helper.BouncerToRight;
import com.nero.helper.BouncerToUp;
import com.nero.helper.Exit;
import com.nero.helper.ScrollerDown;
import com.nero.helper.ScrollerLeft;
import com.nero.helper.ScrollerRight;
import com.nero.helper.ScrollerUp;
import com.nero.src.Visible;
import com.nero.src.objects.Block;
import com.nero.src.objects.Coin;
import com.nero.src.objects.Ghostly;
import com.nero.src.objects.InteractsWithPlayer;
import com.nero.src.objects.Player;
import com.nero.src.objects.PlayerI;
import com.nero.src.objects.doors.DoorBlau;
import com.nero.src.objects.doors.DoorFather;
import com.nero.src.objects.doors.DoorGelb;
import com.nero.src.objects.doors.DoorGruen;
import com.nero.src.objects.doors.DoorOrange;
import com.nero.src.objects.doors.DoorPink;
import com.nero.src.objects.doors.DoorSilber;
import com.nero.src.objects.doors.keys.KeyBlau;
import com.nero.src.objects.doors.keys.KeyGelb;
import com.nero.src.objects.doors.keys.KeyGruen;
import com.nero.src.objects.doors.keys.KeyOrange;
import com.nero.src.objects.doors.keys.KeyPink;
import com.nero.src.objects.doors.keys.KeySilber;

public class Controller {

	// Hier kommen die Listen..
	public static LinkedList<InteractsWithPlayer> interact = new LinkedList<InteractsWithPlayer>();
	

	// Darf ich vorstellen.. der Spieler und desssen Startposition
	public static Player p;

	public int tempLevel = 1;


	public Controller() {


	}



	public static void lvlControl() {
		// Einfuehren von allen Objecten in Abhaengigkeit von dem Level..
		// ...mus noch ueberarbeitet werden
		/*
		 * if (Game.level == 1) {
		 * 
		 * ex.setExitPosition(exitpositionx, exitpositiony);
		 * p.setPlayerPosition(50,150);
		 * 
		 * 
		 * 
		 * addBouncerToDown(new BouncerToDown(50, 50, true));
		 * 
		 * for (int i = 0; i <= Window.windowWidth; i += 50) {
		 * 
		 * addBlock(new Block(i, Window.windowHeight - 40)); }
		 * 
		 * for (int i = 0; i <= Window.windowWidth; i += 50) {
		 * 
		 * addBlock(new Block(i, Window.windowHeight + 200)); }
		 * 
		 * addBlock(new Block(50,200)); addBlock(new Block(100,150)); addBlock(new
		 * Block(150,-50)); addBlock(new Block(150,-500)); addBlock(new
		 * Block(150,-150));
		 * 
		 * } else if (Game.level == 2) {
		 * 
		 * ex.setExitPosition(200, 90); p.setPlayerPosition(80, 50);
		 * 
		 * addBlock(new Block(80, 70)); addBlock(new Block(50, 70));
		 * 
		 * }
		 */

	}

	// Vernichtet alle bisherigen Listenobjekte
	public static void removeAllExceptNotList() {
	interact.removeAll(interact);

	}

	public void update(LinkedList<InteractsWithPlayer> interact) {
		
		
	
	for (InteractsWithPlayer interactsWithPlayer : interact) {
		if(interactsWithPlayer.getBounds().intersects(p.getBounds())) {
			interactsWithPlayer.interact();
		}
		
		interactsWithPlayer.update();
	}

		p.update();
	

	}

	// Malt alles
	public void paint(Graphics2D g2d) {
		for (InteractsWithPlayer interactsWithPlayer : interact) {
			if(interactsWithPlayer instanceof Visible) {
				((Visible) interactsWithPlayer).paint(g2d);
			}
		}
		p.paint(g2d);
	}



}
