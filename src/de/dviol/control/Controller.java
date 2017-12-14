package de.dviol.control;

import java.util.LinkedList;

import de.dviol.attributes.GlobalDimension;
import de.dviol.model.PlayerI;

public class Controller implements ControllerI {

	private static Controller controllerSingleton;
	
	private PlayerI player;
	private LinkedList<GlobalDimension> gameObjects;
	
	
	
	private Controller() {
	 gameObjects = new LinkedList<GlobalDimension>();
	}
	
	public static Controller getInsance() {
		return controllerSingleton == null ? new Controller() : controllerSingleton;
	}
	

	public PlayerI getPlayer() {
		return player;
	}


	@Override
	public void moveAll(int x, int y) {

		for (GlobalDimension globalDimension : gameObjects) {
			globalDimension.move(x, y);
		}
		
	}


	@Override
	public void initGame() {
		// TODO Auto-generated method stub
		
	}

}
