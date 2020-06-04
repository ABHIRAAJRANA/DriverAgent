package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class InstalledSWInfo implements SystemInfo {
	
	private static final String CAPTION = "Caption";
	private static final String DESCRIPTION ="Description";
	private static final String NAME = "Name";
	private static final String SKUNUM = "SKUNumber";
	private static final String VENDOR = "Vendor";
	private static final String VERSION = "Version";
	
	

	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(NAME);
		KEYS.add(CAPTION);
		KEYS.add(DESCRIPTION);
		KEYS.add(SKUNUM);
		KEYS.add(VENDOR);
		KEYS.add(VERSION);
	

	}


	public List<String> getInfo() {
	
		return KEYS;
	}
	
	        
	               
	           
	 
	          
	              
	               
	    	
	 
	
	
	
	
	


}
