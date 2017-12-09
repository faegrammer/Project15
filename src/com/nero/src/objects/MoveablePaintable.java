package com.nero.src.objects;

import java.awt.Point;

import com.nero.src.Inworldobject;
import com.nero.src.Visible;
import com.nero.src.input.EnviromentallyMovedPaintable;

public abstract class MoveablePaintable extends EnviromentallyMovedPaintable implements Visible, Inworldobject, MoveablePaintableI {
	protected int velX;
	protected int velY;

	public MoveablePaintable(int x, int y, int width, int height, String imagePath) {
		super(x, y, width, height, imagePath);

	}

	public MoveablePaintable(Point p, int width, int height, String imagePath) {
		this(p.x, p.y, width, height, imagePath);
	}

	/* (non-Javadoc)
	 * @see com.nero.src.objects.MoveablePaintableI#update()
	 */
	@Override
	public void update() {

		super.update();
		pos.x += velX;
		pos.y += velY;
	}

}
