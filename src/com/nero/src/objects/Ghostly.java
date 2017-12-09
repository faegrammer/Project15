package com.nero.src.objects;

import java.util.LinkedList;
import com.nero.helper.BouncerToDown;
import com.nero.helper.BouncerToLeft;
import com.nero.helper.BouncerToRight;
import com.nero.helper.BouncerToUp;
import com.nero.src.input.Antagonist;

public class Ghostly extends MoveablePaintable implements Antagonist {

	// Bildpfad
	private static final String imagePathToRight = "/images/hazard/enemy/gegnerrechts.gif";
	private static final String imagePathToLeft = "/images/hazard/enemy/gegnerlinks.gif";

	// Breite und HICHWAREINUMLAUThe
	public static final int enemyWidth = 40;
	public static final int enemyHeight = 40;

	// Geschwindigkeit von Enemy

	public Ghostly(int x, int y, int width, int height, String imagePath) {
		super(x, y, width, height, imagePath);

	}

	public Ghostly(int x, int y, String imagePath) {

		this(x, y, enemyWidth, enemyHeight, imagePath);

	}
	
	public Ghostly(int x, int y) {

		this(x, y, enemyWidth, enemyHeight, imagePathToRight);

	}

	// Collission mit den Bouncern
	public void Collission(LinkedList<BouncerToUp> btu, LinkedList<BouncerToRight> btr, LinkedList<BouncerToDown> btd,
			LinkedList<BouncerToLeft> btl) {

		for (int i = 0; i < btu.size(); i++) {

			if (getBounds().intersects(btu.get(i).getBounds())) {
				// Bricht die Schleife ab
				i = btu.size();
				// Veraenderung der Geschwindigkeit
				velY = -4;
				velX = 0;
			}

		}
		for (int i = 0; i < btd.size(); i++) {

			if (getBounds().intersects(btd.get(i).getBounds())) {

				i = btd.size();
				velY = 4;

				velX = 0;

			}

		}
		for (int i = 0; i < btr.size(); i++) {

			if (getBounds().intersects(btr.get(i).getBounds())) {

				i = btr.size();
				velX = 4;
				velY = 0;
				imagePath = imagePathToRight;

			}

		}
		for (int i = 0; i < btl.size(); i++) {

			if (getBounds().intersects(btl.get(i).getBounds())) {

				i = btl.size();
				velX = -4;
				velY = 0;

				imagePath = imagePathToLeft;

			}

		}

	}

}
