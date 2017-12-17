package de.dviol.model.antagonists;

public class Path {

	private PathNode pathtracker;
	
	public Path() {
		
	
	}
	
	
	private class PathNode {

		private int ticks;
		private int count;
		public int getxSpeed() {
			return xSpeed;
		}

		public int getySpeed() {
			return ySpeed;
		}

		private int xSpeed;
		private int ySpeed;
		private PathNode next;

		/**
		 * 
		 * @param ticks
		 *            How much updates it take until this PathNode expires
		 * @param xSpeedOfObject
		 *            The speed on the x-Axis in which the Object absolutely will
		 *            move on this Node
		 * @param ySpeedOfObject
		 *            The speed on the y-Axis in which the Object absolutely will
		 *            move on this Node
		 * @param direction
		 *            The direction will be going See
		 *            {@link de.dviol.model.antagonists.Directions} s for further
		 *            Information
		 */
		public PathNode(int ticks, int xSpeedOfObject, int ySpeedOfObject,
				Directions direction, PathNode next) {
			this.ticks = ticks;
			this.count = 0;
			this.next = next;
			switch (direction) {
				case DOWN :
					this.xSpeed = 0;
					this.ySpeed = ySpeedOfObject;
					break;
				case DOWNLEFT :
					this.xSpeed = -xSpeedOfObject;
					this.ySpeed = ySpeedOfObject;
					break;
				case DOWNRIGHT :
					this.xSpeed = xSpeedOfObject;
					this.ySpeed = ySpeedOfObject;
					break;
				case LEFT :
					this.xSpeed = -xSpeedOfObject;
					this.ySpeed = 0;
					break;
				case RIGHT :
					this.xSpeed = xSpeedOfObject;
					this.ySpeed = ySpeedOfObject;
					break;
				case UP :
					this.xSpeed = 0;
					this.ySpeed = -ySpeedOfObject;
					break;
				case UPLEFT :
					this.xSpeed = -xSpeedOfObject;
					this.ySpeed = -ySpeedOfObject;
					break;
				case UPRIGHT :
					this.xSpeed = xSpeedOfObject;
					this.ySpeed = -ySpeedOfObject;
					break;
				case STOP :
					this.xSpeed = 0;
					this.ySpeed = 0;
					break;	
				default :
					break;

			}

		}
		
		public PathNode getActiveNode() {
			if(ticks == count++) {
				return next;
			}
			return this;
		}




	}

}
