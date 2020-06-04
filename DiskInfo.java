package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class DiskInfo implements SystemInfo {
	
	private static final String SIZE ="Size";
	private static final String CREATION ="CreationClassName";
	private static final String MANUFACTURER ="Manufacturer";
	private static final String TYPE ="MediaType";
	private static final String MODEL ="Model";
	private static final String SERIALNUM = "SerialNumber";
	
	

	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(SIZE);
		KEYS.add(CREATION);
		KEYS.add(MANUFACTURER);
		KEYS.add(TYPE);
		KEYS.add(MODEL);
		KEYS.add(SERIALNUM);

	}


	public List<String> getInfo() {
	
		return KEYS;
	}
	
	        
	               
	           
	 
	          
	              
	               
	    	
	 
	
	
	
	
	


}
