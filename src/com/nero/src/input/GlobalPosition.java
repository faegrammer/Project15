
package com.nero.src.input;

public class GlobalPosition {

	public int x;
	public int y;
	public static int environmentVelX;
	public static int environmentVelY;

	/*
	 * Fuer die Faulen, die nie unendlich oft die X und Y Attribute machen wollen
	 * ist das ne gute alternative
	 */

	public GlobalPosition(int x, int y) {

		this.x = x;
		this.y = y;

	}

}
