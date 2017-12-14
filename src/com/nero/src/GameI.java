package com.nero.src;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public interface GameI {

	// Und hier ist die Methode dazu:
	void initGame();

	void update();

	void addKeyListener();

	void paint(Graphics g);

	void start();

	void stop();

	void run();

	// Die Funktion, dass die Eingabe ueberhaupt funktioniert
	void keyPressed(KeyEvent e);

	GameI returnGame();

	Image returnBoxImage();

	Image returnBlueImage();

	Image returnYellowImage();

	Image returnGreenImage();

	Image returnPinkImage();

	Image returnSilverImage();

	Image returnOrangeImage();

}