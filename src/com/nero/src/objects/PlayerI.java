package com.nero.src.objects;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import com.nero.helper.Sound;
import com.nero.src.objects.doors.Identitaeten;

public interface PlayerI {

	int playerWidth = 33;
	int playerHeight = 50;

	void update(LinkedList<InteractsWithPlayer> interact);

	// Kollissionfunktion mit Gegner ,BlICHWAREINUMLAUTcken und Exit und was dann
	// passiert
	void collission(LinkedList<InteractsWithPlayer> interact);

	// Das man sich ueberhaupt bewegen kann
	void keyPressed(KeyEvent e);

	void keyTyped(KeyEvent e);

	void keyReleased(KeyEvent e);

	// Kollissionsviereck
	Rectangle getBounds();

	int returnPlayerX();

	int returnPlayerY();

	void deleteInventory();

	int getBewegungsgeschwindigkeit();

	void setBewegungsgeschwindigkeit(int bewegungsgeschwindigkeit);

	int getSprungkraft();

	void setSprungkraft(int sprungkraft);

	int getSprunkonstante();

	void setSprunkonstante(int sprunkonstante);

	int getSpringer();

	void setSpringer(int springer);

	boolean isAllowSpace();

	void setAllowSpace(boolean allowSpace);

	int getMaxFallingSpeed();

	void setMaxFallingSpeed(int maxFallingSpeed);

	boolean isFalling();

	void setFalling(boolean falling);

	boolean isInit();

	void setInit(boolean init);

	boolean isBoden();

	void setBoden(boolean boden);

	Sound getW();

	void setW(Sound w);

	Sound getS();

	void setS(Sound s);

	int getFallingSpeed();

	void setFallingSpeed(int fallingSpeed);

	boolean isNachRechtsGucken();

	void setNachRechtsGucken(boolean nachRechtsGucken);

	int getGravity();
	
	boolean hasKey(Identitaeten identitaet);

}