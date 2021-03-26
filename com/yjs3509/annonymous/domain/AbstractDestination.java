package com.yjs3509.annonymous.domain;

public abstract class AbstractDestination {

	private int distanceInKM;
	
	public AbstractDestination(int distanceInKM) {
		this.distanceInKM = distanceInKM;
	}
	
	public abstract String getTo();
}
