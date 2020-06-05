	package com.test.wmi.wmitest.constants;

public enum OSClassName {
	PROCESSOR_CLASS_NAME("Win32_Processor"), RAM_CLASSNAME("Win32_PhysicalMemory"), VIDEO_CONTROLLER_CLASSNAME("Win32_VideoController"), 
	TEMPERATURE_CLASS_NAME("Win32_TemperatureProbe"),
	BATTERY_CLASS_NAME("Win32_Battery"),DISKINFO_CLASS_NAME("Win32_DiskDrive"),INSTALLEDSW_CLASS_NAME("CIM_Product");

	private String className;

	private OSClassName(String className) {
		this.className = className;
	}

	public String value() {
		return this.className;
	}
}
