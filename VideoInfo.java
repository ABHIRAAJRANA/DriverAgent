package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class VideoInfo implements SystemInfo {
	
	private static final String NAME = "Name";
	private static final String ADAPTER = "AdapterCompatibility";
	private static final String DACTYPE = "AdapterDACType";
	private static final String ADP_RAM = "AdapterRAM";
	private static final String CREATION_CLASS = "CreationClassName";
	private static final String VIDEO_PROCESSOR = "VideoProcessor";
	private static final String DESCRIPTION = "Description";
	

	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(NAME);
		KEYS.add(ADAPTER);
		KEYS.add(DACTYPE);
		KEYS.add(ADP_RAM);
		KEYS.add(CREATION_CLASS);
		KEYS.add(VIDEO_PROCESSOR);
		KEYS.add(DESCRIPTION);

	}


	public List<String> getInfo() {
	
		return KEYS;
	}
	
	        
	               
	           
	 
	          
	              
	               
	    	
	 
	
	
	
	
	


}
