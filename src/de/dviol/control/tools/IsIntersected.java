package de.dviol.control.tools;

import de.dviol.attributes.GlobalDimensionI;
import de.dviol.control.Controller;

public abstract class IsIntersected {

	
	public boolean isIntersected(GlobalDimensionI object1) {
		// TODO Auto-generated method stub
		return Controller.getInstance().getPlayer().getBounds().intersects(object1.getBounds());
	}

}
