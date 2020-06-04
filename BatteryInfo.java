package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class BatteryInfo implements SystemInfo {
	
	private static final String CAPTION ="Caption";
	private static final String CHEMISTRY="Chemistry";
	
	
	

	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(CAPTION);
		KEYS.add(CHEMISTRY);
		
		

	}


	public List<String> getInfo() {
	
		return KEYS;
	}
}
