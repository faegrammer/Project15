package com.nero.src.objects;

import com.nero.src.Inworldobject;
import com.nero.src.input.Controller;

public interface InteractsWithPlayer extends Inworldobject {
	default boolean isIntersected() {
		return getBounds().intersects(Controller.getPlayer().getBounds());
	}

}
