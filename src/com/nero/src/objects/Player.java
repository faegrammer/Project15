package com.nero.src.objects;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import com.nero.helper.Exit;
import com.nero.helper.ScrollerDown;
import com.nero.helper.ScrollerLeft;
import com.nero.helper.ScrollerRight;
import com.nero.helper.ScrollerUp;
import com.nero.helper.Sound;
import com.nero.src.Game;
import com.nero.src.input.Controller;
import com.nero.src.input.EnviromentallyMoved;
import com.nero.src.input.InternerLvLcreator;
import com.nero.src.objects.doors.DoorBlau;
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

public class Player extends MoveablePaintable implements PlayerI {
	// TODO
	// // Malfunktion
	// public void paint(Graphics2D g2d) {
	//
	// g2d.drawImage(getImage(),pos.x,pos.y - 13, null); Warum -13?
	//
	// }

	// Ausmasse + woher kriegt er sein Bildchen her

	// Attribute wie schnell der Typ ist
	private int bewegungsgeschwindigkeit = 5;
	private int sprungkraft = 0;
	private int sprunkonstante = 15;
	private int springer = sprunkonstante;
	private boolean allowSpace = true;
	public static boolean darfRechts, darfLinks = true;

	public static boolean SchluesselBlau = false;
	public static boolean SchluesselGelb = false;
	public static boolean SchluesselGruen = false;
	public static boolean SchluesselOrange = false;
	public static boolean SchluesselPink = false;
	public static boolean SchluesselSilber = false;

	private int maxFallingSpeed = 6;

	// Faellt der oder nicht?

	private boolean falling = true;
	private boolean init = true;
	private boolean boden = true;

	Sound w;
	Sound s;

	private final int gravity = 1;
	private int fallingSpeed = 0;
	private boolean nachRechtsGucken = true;

	// private String springenLinksBild
	// ="/images/spielfigur/spielfigurSchuss.gif";
	private final static String imagePathStehen = "/images/spielfigur/spielfigurStehen.gif";
	private final static String fallenLinksBild = "/images/spielfigur/Spieler_links_springen.png";
	private final static String stehenLinksBild = "/images/spielfigur/Spielerlinks.png";
	private final static String laufenRechtsBild = "/images/spielfigur/Spieler_rechts_laufen_animiert.gif";

	// private String springenRechtsBild=springenLinksBild;
	private final static String fallenRechtsBild = "/images/spielfigur/Spieler_rechts_springen.png";
	private final static String stehenRechtsBild = "/images/spielfigur/Spielerrechts.png";
	private final static String laufenLinksBild = "/images/spielfigur/Spieler_links_laufen_animiert.gif";

	// Jetzt wird die BlockListe eingefuegt

	public Player(int x, int y) {
		super(x, y, playerWidth, playerHeight, imagePathStehen);
		w = new Sound("/Sound/laufen.wav");
		s = new Sound("/Sound/Sprung.wav");
	}

	public Player(Point p) {
		this(p.x, p.y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#update(java.util.LinkedList)
	 */
	@Override
	public void update() {

		// Das er sich ueberhaupt mit der Geschwindigkeit bewegt + Collission
		pos.x += velX;
		pos.y += velY;
		pos.y += fallingSpeed;
		pos.y -= sprungkraft;

		// Falle ich?
		if (falling) {

			if (nachRechtsGucken) {
				imagePath = fallenRechtsBild;
			} else {
				imagePath = fallenLinksBild;
			}

			fallingSpeed += gravity;

			if (fallingSpeed > sprungkraft) {

				fallingSpeed = sprungkraft + maxFallingSpeed;

			}

		} else {
			if (velX == 0) {
				if (nachRechtsGucken) {
					imagePath = stehenRechtsBild;
				} else {
					imagePath = stehenLinksBild;
				}
			}

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {

		case KeyEvent.VK_RIGHT:
			nachRechtsGucken = true;
			velX = bewegungsgeschwindigkeit;

			if (init) {
				if (boden) {
					w.playSound();
				} else {
					w.stopSound();
				}
				init = false;
			}

			if (!falling) {

				imagePath = laufenRechtsBild;

			}
			break;
		case KeyEvent.VK_LEFT:
			nachRechtsGucken = false;

			imagePath = laufenLinksBild;
			if (init) {
				if (boden) {
					w.playSound();
				} else {
					w.stopSound();
				}
				init = false;
			}
			velX = -bewegungsgeschwindigkeit;

			break;
		case KeyEvent.VK_SPACE:

			if (allowSpace) {

				if (!falling) {
					if (boden) {
						// s.playSoundOnce();
						// boden = false;
					}
					sprungkraft = sprunkonstante;

				} else {

					sprungkraft = 0;

				}
			}

			break;
		case KeyEvent.VK_U:
			Controller.removeAllExceptNotList();
			++Game.level;
			InternerLvLcreator.internerLvlControl();
			break;
		case KeyEvent.VK_D:
			Controller.removeAllExceptNotList();
			--Game.level;
			InternerLvLcreator.internerLvlControl();
			break;

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {

		switch (e.getKeyCode()) {

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {

		switch (e.getKeyCode()) {

		case KeyEvent.VK_R:
			Controller.removeAllExceptNotList();
			InternerLvLcreator.internerLvlControl();
			break;

		case KeyEvent.VK_RIGHT:
			imagePath = stehenRechtsBild;
			velX = 0;
			init = true;
			w.stopSound();

			break;
		case KeyEvent.VK_LEFT:
			imagePath = stehenLinksBild;
			velX = 0;
			init = true;
			w.stopSound();

			break;
		case KeyEvent.VK_SPACE:

			if (!nachRechtsGucken) {
				imagePath = fallenLinksBild;
			} else {
				imagePath = fallenRechtsBild;
			}

			sprungkraft = 0;

			break;

		}

	}

	// Kollissionsviereck
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getBounds()
	 */
	@Override
	public Rectangle getBounds() {

		return new Rectangle(pos.x, pos.y, playerWidth, playerHeight + 1);
	}

	// Hol das bild her!

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#returnPlayerX()
	 */
	@Override
	public int returnPlayerX() {

		return pos.x;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#returnPlayerY()
	 */
	@Override
	public int returnPlayerY() {

		return pos.y;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#deleteInventory()
	 */
	@Override
	public void deleteInventory() {
		SchluesselBlau = false;
		SchluesselGelb = false;
		SchluesselGruen = false;
		SchluesselOrange = false;
		SchluesselPink = false;
		SchluesselSilber = false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getBewegungsgeschwindigkeit()
	 */
	@Override
	public int getBewegungsgeschwindigkeit() {
		return bewegungsgeschwindigkeit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setBewegungsgeschwindigkeit(int)
	 */
	@Override
	public void setBewegungsgeschwindigkeit(int bewegungsgeschwindigkeit) {
		this.bewegungsgeschwindigkeit = bewegungsgeschwindigkeit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getSprungkraft()
	 */
	@Override
	public int getSprungkraft() {
		return sprungkraft;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setSprungkraft(int)
	 */
	@Override
	public void setSprungkraft(int sprungkraft) {
		this.sprungkraft = sprungkraft;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getSprunkonstante()
	 */
	@Override
	public int getSprunkonstante() {
		return sprunkonstante;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setSprunkonstante(int)
	 */
	@Override
	public void setSprunkonstante(int sprunkonstante) {
		this.sprunkonstante = sprunkonstante;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getSpringer()
	 */
	@Override
	public int getSpringer() {
		return springer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setSpringer(int)
	 */
	@Override
	public void setSpringer(int springer) {
		this.springer = springer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#isAllowSpace()
	 */
	@Override
	public boolean isAllowSpace() {
		return allowSpace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setAllowSpace(boolean)
	 */
	@Override
	public void setAllowSpace(boolean allowSpace) {
		this.allowSpace = allowSpace;
	}

	public static boolean isDarfRechts() {
		return darfRechts;
	}

	public static void setDarfRechts(boolean darfRechts) {
		Player.darfRechts = darfRechts;
	}

	public static boolean isDarfLinks() {
		return darfLinks;
	}

	public static void setDarfLinks(boolean darfLinks) {
		Player.darfLinks = darfLinks;
	}

	public static boolean isSchluesselBlau() {
		return SchluesselBlau;
	}

	public static void setSchluesselBlau(boolean schluesselBlau) {
		SchluesselBlau = schluesselBlau;
	}

	public static boolean isSchluesselGelb() {
		return SchluesselGelb;
	}

	public static void setSchluesselGelb(boolean schluesselGelb) {
		SchluesselGelb = schluesselGelb;
	}

	public static boolean isSchluesselGruen() {
		return SchluesselGruen;
	}

	public static void setSchluesselGruen(boolean schluesselGruen) {
		SchluesselGruen = schluesselGruen;
	}

	public static boolean isSchluesselOrange() {
		return SchluesselOrange;
	}

	public static void setSchluesselOrange(boolean schluesselOrange) {
		SchluesselOrange = schluesselOrange;
	}

	public static boolean isSchluesselPink() {
		return SchluesselPink;
	}

	public static void setSchluesselPink(boolean schluesselPink) {
		SchluesselPink = schluesselPink;
	}

	public static boolean isSchluesselSilber() {
		return SchluesselSilber;
	}

	public static void setSchluesselSilber(boolean schluesselSilber) {
		SchluesselSilber = schluesselSilber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getMaxFallingSpeed()
	 */
	@Override
	public int getMaxFallingSpeed() {
		return maxFallingSpeed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setMaxFallingSpeed(int)
	 */
	@Override
	public void setMaxFallingSpeed(int maxFallingSpeed) {
		this.maxFallingSpeed = maxFallingSpeed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#isFalling()
	 */
	@Override
	public boolean isFalling() {
		return falling;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setFalling(boolean)
	 */
	@Override
	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#isInit()
	 */
	@Override
	public boolean isInit() {
		return init;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setInit(boolean)
	 */
	@Override
	public void setInit(boolean init) {
		this.init = init;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#isBoden()
	 */
	@Override
	public boolean isBoden() {
		return boden;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setBoden(boolean)
	 */
	@Override
	public void setBoden(boolean boden) {
		this.boden = boden;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getW()
	 */
	@Override
	public Sound getW() {
		return w;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setW(com.nero.helper.Sound)
	 */
	@Override
	public void setW(Sound w) {
		this.w = w;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getS()
	 */
	@Override
	public Sound getS() {
		return s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setS(com.nero.helper.Sound)
	 */
	@Override
	public void setS(Sound s) {
		this.s = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getFallingSpeed()
	 */
	@Override
	public int getFallingSpeed() {
		return fallingSpeed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setFallingSpeed(int)
	 */
	@Override
	public void setFallingSpeed(int fallingSpeed) {
		this.fallingSpeed = fallingSpeed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#isNachRechtsGucken()
	 */
	@Override
	public boolean isNachRechtsGucken() {
		return nachRechtsGucken;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#setNachRechtsGucken(boolean)
	 */
	@Override
	public void setNachRechtsGucken(boolean nachRechtsGucken) {
		this.nachRechtsGucken = nachRechtsGucken;
	}

	public static int getPlayerwidth() {
		return playerWidth;
	}

	public static int getPlayerheight() {
		return playerHeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nero.src.objects.PlayerI#getGravity()
	 */
	@Override
	public int getGravity() {
		return gravity;
	}

	public static String getImagepathstehen() {
		return imagePathStehen;
	}

	public static String getFallenlinksbild() {
		return fallenLinksBild;
	}

	public static String getStehenlinksbild() {
		return stehenLinksBild;
	}

	public static String getLaufenrechtsbild() {
		return laufenRechtsBild;
	}

	public static String getFallenrechtsbild() {
		return fallenRechtsBild;
	}

	public static String getStehenrechtsbild() {
		return stehenRechtsBild;
	}

	public static String getLaufenlinksbild() {
		return laufenLinksBild;
	}

}
