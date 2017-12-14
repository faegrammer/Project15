package de.dviol.control;

import java.awt.Point;

import de.dviol.attributes.InteractsWithPlayer;

public abstract class Interaction implements InteractsWithPlayer {


	@Override
	public boolean isIntersected() {
		return getBounds().intersects(Controller.getPlayer().getBounds());
	}

}
