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

	// Und meine Ex gibt es auch hier.. ach nein.. nur der Ausgang
	static Exit ex;

	// Alles Temporaer.. nichts von dauer.. buhuhu...
	Block tempBlock;
	Ghostly tempEnemy;
	Coin tempCoin;

	static KeyBlau kb;
	static KeyGelb kg;
	static KeyGruen kgr;
	static KeyOrange kor;
	static KeyPink kp;
	static KeySilber ks;

	static DoorBlau db;
	static DoorGelb dg;
	static DoorGruen dgr;
	static DoorOrange dor;
	static DoorPink dp;
	static DoorSilber ds;

	BouncerToDown tempBouncerToDown;
	BouncerToUp tempBouncerToUp;
	BouncerToRight tempBouncerToRight;
	BouncerToLeft tempBouncerToLeft;

	/*
	 * Merkhilfe: BouncerToDown Gelb BouncerToUp Blau BouncerToRight Gruen
	 * BouncerToLeft Rot
	 */

	public Controller() {


	}

	public static void closeTheDoors() {
		DoorFather

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

	public static PlayerI returnPlayer() {

		return p;

	}

	public static DoorBlau returnDoorBlau() {

		return db;

	}

	public static DoorGruen returnDoorGruen() {

		return dgr;

	}

	public static DoorOrange returnDoorOrange() {

		return dor;

	}

	public static DoorGelb returnDoorGelb() {

		return dg;

	}

	public static DoorPink returnDoorPink() {

		return dp;

	}

	public static DoorSilber returnDoorSilber() {

		return ds;

	}

	public static KeyBlau returnKeyBlau() {

		return kb;

	}

	public static KeyGruen returnKeyGruen() {

		return kgr;

	}

	public static KeyOrange returnKeyOrange() {

		return kor;

	}

	public static KeyGelb returnKeyGelb() {

		return kg;

	}

	public static KeyPink returnKeyPink() {

		return kp;

	}

	public static KeySilber returnKeySilber() {

		return ks;

	}

	// Update....
	public void update(LinkedList<InteractsWithPlayer> interact) {
		// sd.update();
		// su.update();
		// sr.update();
		// sl.update();

	for (InteractsWithPlayer interactsWithPlayer : interact) {
		interactsWithPlayer.update();
	}

		p.update(interact);
		ex.update();

		/*
		 * if(tempLevel != Game.level){
		 * 
		 * lvlControl(); tempLevel = Game.level; System.out.println("heyho");
		 * 
		 * }
		 */

		for (int i = 0; i < e.size(); i++) {

			this.tempEnemy = e.get(i);
			tempEnemy.update();
			tempEnemy.Collission(btu, btr, btd, btl);

		}

		for (int k = 0; k < b.size(); k++) {

			this.tempBlock = b.get(k);
			tempBlock.update();

		}

		for (int k = 0; k < btd.size(); k++) {

			this.tempBouncerToDown = btd.get(k);
			tempBouncerToDown.update();

		}
		for (int k = 0; k < btu.size(); k++) {

			this.tempBouncerToUp = btu.get(k);
			tempBouncerToUp.update();

		}
		for (int k = 0; k < btr.size(); k++) {

			this.tempBouncerToRight = btr.get(k);
			tempBouncerToRight.update();

		}
		for (int k = 0; k < btl.size(); k++) {

			this.tempBouncerToLeft = btl.get(k);
			tempBouncerToLeft.update();

		}

		for (int l = 0; l < Controller.co.size(); l++) {

			this.tempCoin = Controller.co.get(l);
			tempCoin.update();

		}

	}

	// Malt alles
	public void paint(Graphics2D g2d) {

		dg.paint(g2d);
		db.paint(g2d);
		dgr.paint(g2d);
		dor.paint(g2d);
		dp.paint(g2d);
		ds.paint(g2d);
		kb.paint(g2d);
		kg.paint(g2d);
		kgr.paint(g2d);
		kor.paint(g2d);
		kp.paint(g2d);
		ks.paint(g2d);

		p.paint(g2d);
		ex.paint(g2d);

		for (int k = 0; k < b.size(); ++k) {

			this.tempBlock = b.get(k);
			tempBlock.draw(g2d);

		}
		for (int i = 0; i < co.size(); i++) {

			this.tempCoin = co.get(i);
			tempCoin.paint(g2d);

		}

		for (int i = 0; i < e.size(); i++) {

			this.tempEnemy = e.get(i);
			tempEnemy.paint(g2d);

		}

		for (int k = 0; k < btd.size(); k++) {

			this.tempBouncerToDown = btd.get(k);
			tempBouncerToDown.paint(g2d);

		}
		for (int k = 0; k < btu.size(); k++) {

			this.tempBouncerToUp = btu.get(k);
			tempBouncerToUp.paint(g2d);

		}
		for (int k = 0; k < btr.size(); k++) {

			this.tempBouncerToRight = btr.get(k);
			tempBouncerToRight.paint(g2d);

		}
		for (int k = 0; k < btl.size(); k++) {

			this.tempBouncerToLeft = btl.get(k);
			tempBouncerToLeft.paint(g2d);

		}

	}

	// Alle hinzufueg, listen und lICHWAREINUMLAUTschfunktionen...
	public static void addBouncerToDown(BouncerToDown b2d) {

		btd.add(b2d);

	}

	public static void addCoin(Coin coi) {

		co.add(coi);

	}

	public static void removeCoin(Coin coi) {

		co.remove(coi);

	}

	public static void removeBouncerToDown(BouncerToDown b2d) {

		btd.remove(b2d);

	}

	public static void addBouncerToUp(BouncerToUp b2u) {

		btu.add(b2u);

	}

	public void removeBouncerToUp(BouncerToUp b2u) {

		btu.remove(b2u);

	}

	public static void addBouncerToRight(BouncerToRight b2r) {

		btr.add(b2r);

	}

	public void removeBouncerToRight(BouncerToRight b2r) {

		btr.remove(b2r);

	}

	public static void addBouncerToLeft(BouncerToLeft b2l) {

		btl.add(b2l);

	}

	public void removeBouncerToLeft(BouncerToLeft b2l) {

		btl.remove(b2l);

	}

	public static void addBlock(Block block) {

		b.add(block);
	}

	public static void removeBlock(Block block) {

		b.remove(block);

	}

	public static LinkedList<Block> getBlockBounds() {
		return b;
	}

	public static void addEnemy(Ghostly enemy) {

		e.add(enemy);

	}

	public static void removeEnemy(Ghostly enemy) {

		e.remove(enemy);

	}

	public static LinkedList<Ghostly> getEnemyBounds() {
		return e;
	}

	public static LinkedList<BouncerToDown> getBtdBounds() {
		return btd;
	}

	public static LinkedList<BouncerToUp> getBtuBounds() {
		return btu;
	}

	public static LinkedList<BouncerToRight> getBtrBounds() {
		return btr;
	}

	public static LinkedList<BouncerToLeft> getBtlBounds() {
		return btl;
	}

	public static LinkedList<Coin> getCoinBounds() {
		return co;
	}

}
