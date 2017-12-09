package com.nero.helper;

import java.awt.Color;

/*Sohn von Bouncer, der spaeter den Sinn hat, dass die Gegner nach unten gehen,
 *wenn sie ihn beruehren */

public class BouncerToDown extends BouncerFather {

	public BouncerToDown(int x, int y, boolean visible) {
		super(x, y, visible, Color.YELLOW);

	}

}
