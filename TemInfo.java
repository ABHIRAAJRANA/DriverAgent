package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class TemInfo implements SystemInfo {
	
	private static final String ACCURACY = "Accuracy";
	private static final String CREATIONCLASS ="CreationClassName";
	private static final String NAME = "Name";
	
	

	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(ACCURACY);
		KEYS.add(CREATIONCLASS);
		KEYS.add(NAME);
		

	}


	public List<String> getInfo() {
	
		return KEYS;
	}
}
