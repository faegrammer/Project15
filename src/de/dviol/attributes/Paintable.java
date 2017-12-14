package de.dviol.attributes;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public interface Paintable extends Inworldobject {

	default void Paint(Graphics2D g2d) {
		g2d.drawImage(getImage(),x(),y(),null);
	}
	String getImagePath();
	default Image getImage() {
		return new ImageIcon(getClass().getResource(getImagePath())).getImage();
	}
}
