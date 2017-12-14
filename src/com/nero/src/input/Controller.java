package com.nero.src.input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.nero.src.Inworldobject;
import com.nero.src.Visible;
import com.nero.src.objects.InteractsWithPlayer;
import com.nero.src.objects.PlayerI;

public class Controller {

	// Hier kommen die Listen..
	public static LinkedList<Inworldobject> interact = new LinkedList<Inworldobject>();

	public static Controller c;

	private Controller() {
		interact = new LinkedList<Inworldobject>();
	}

	public static Controller getInstance() {
		return c == null ? new Controller() : c;
	}

	public static PlayerI p;

	public int tempLevel = 1;

	/**
	 * Moves all NonPlayableObjects relativ to their Position according to this x
	 * and y values
	 * 
	 * @param x
	 *            The movement from the initial x position plus this x
	 * @param y
	 *            The movement from the initial y position plus this y
	 */
	public void moveAllNPO(int x, int y) {
		for (Inworldobject iwObj : interact) {
			iwObj.move(x, y);

		}
	}

	// Vernichtet alle bisherigen Listenobjekte
	public static void removeAllExceptNotList() {
		interact.removeAll(interact);

	}

	public void update(LinkedList<InteractsWithPlayer> interact) {

		for (InteractsWithPlayer interactsWithPlayer : interact) {

			interactsWithPlayer.update();
		}

		p.update();

	}

	// Malt alles
	public void paint(Graphics2D g2d) {
		for (Inworldobject interactsWithPlayer : interact) {
			if (interactsWithPlayer instanceof Visible) {
				((Visible) interactsWithPlayer).paint(g2d);
			}
		}
		p.paint(g2d);
	}

	public static PlayerI getPlayer() {
		return p;
	}

}
