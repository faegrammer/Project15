package de.dviol.control;

import de.dviol.attributes.GlobalDimension;
import de.dviol.level.LevelI;
import de.dviol.model.PlayerI;

public interface ControllerI {
		

	void moveAll(int x, int y);
	void initGame();
	void initLevel(LevelI level);
	void tearDownLevel();

}
