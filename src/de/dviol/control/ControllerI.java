package de.dviol.control;

import de.dviol.level.LevelI;

public interface ControllerI {
		

	void moveAll(int x, int y);
	void initGame();
	void initLevel(LevelI level);
	void tearDownLevel();
	void update();

}
