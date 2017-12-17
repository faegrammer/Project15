package de.dviol.attributes;

import java.util.LinkedList;

import de.dviol.model.antagonists.PathNode;

public interface Antagonist extends Selfmoving,Paintable {

	final String PATH_TO_ANTAGONIST = AbstractVisibleMovableIngameobject.PATHT_TO_IMAGES + "/antagonist/";
	default void update() {
		getPathNodeList().get(getCount())
	}
	
	LinkedList<PathNode> getPathNodeList();
	long getCou
}
