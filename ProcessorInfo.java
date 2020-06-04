package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class ProcessorInfo implements SystemInfo {
	
	private static final String COMPUTER_NAME = "PSComputerName";
	
	private static final String NAME = "Name";

	private static final String ARCHITECTURE = "Architecture";

	private static final String PROCESSOR_ID = "ProcessorId";

	private static final String NUMBER_OF_CORE = "NumberOfCores";

	private static final String MAX_CLOCK_SPEED = "MaxClockSpeed";

	private static final String MANUFACTURER = "Manufacturer";
	
	private static final String LOGICAL_PROCESSOR = "NumberOfLogicalProcessors";
	
	
	
	
	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(NAME);
		KEYS.add(ARCHITECTURE);
		KEYS.add(PROCESSOR_ID);
		KEYS.add(NUMBER_OF_CORE);
		KEYS.add(MAX_CLOCK_SPEED);
		KEYS.add(COMPUTER_NAME);
		KEYS.add(MANUFACTURER);
		KEYS.add(LOGICAL_PROCESSOR);
		

	}

	public List<String> getInfo() {
		return KEYS;
	}

}

