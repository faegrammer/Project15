package com.nero.src.input;

import java.awt.Point;

public abstract class GlobalPosition implements GlobalPositionI {
	protected Point pos;
	protected int width;
	protected int height;

	public GlobalPosition(int x, int y, int width, int height) {

		this(new Point(x, y), width, height);

	}

	public GlobalPosition(Point p, int width, int height) {
		pos = new Point(p.x, p.y);
		this.width = width;
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see com.nero.src.input.GlobalPositionI#getPos()
	 */
	@Override
	public Point getPos() {
		return pos;
	}

	/* (non-Javadoc)
	 * @see com.nero.src.input.GlobalPositionI#setPos(java.awt.Point)
	 */
	@Override
	public void setPos(Point pos) {
		this.pos = pos;
	}

	/* (non-Javadoc)
	 * @see com.nero.src.input.GlobalPositionI#setPos(int, int)
	 */
	@Override
	public void setPos(int x, int y) {
		this.pos = new Point(x, y);
	}
}
