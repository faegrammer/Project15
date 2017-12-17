package de.dviol.model.antagonists;

import java.awt.Point;

import de.dviol.attributes.AbstractVisibleMovableIngameobject;
import de.dviol.attributes.Antagonist;

public class Ghostly extends AbstractVisibleMovableIngameobject implements Antagonist {

	public final static String PATH_TO_GHOSTLY = Antagonist.PATH_TO_ANTAGONIST + "ghostly.gif";
	public final static int MAXIMUM_VELOCITY = 10;
	
	
	
	public Ghostly(int x, int y, int width, int height) {
		super(x, y, width, height,MAXIMUM_VELOCITY,MAXIMUM_VELOCITY,PATH_TO_GHOSTLY);
		// TODO Auto-generated constructor stub
	}

	public Ghostly(Point position, int width, int height) {
		super(position, width, height,MAXIMUM_VELOCITY,MAXIMUM_VELOCITY,PATH_TO_GHOSTLY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		
	}


}
