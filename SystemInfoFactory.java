package com.test.wmi.wmitest;

import com.test.wmi.wmitest.constants.OSClassName;

public class SystemInfoFactory {

	public static SystemInfo getSystemInfo(String className) {

		if (className == null || className.isEmpty()) {
			return null;
		}

		if (className.equals(OSClassName.PROCESSOR_CLASS_NAME.value())) {
			return new ProcessorInfo();
		} else if (className.equals(OSClassName.RAM_CLASSNAME.value())) {
			return new RamInfo();
		}
		else if (className.equals(OSClassName.VIDEO_CONTROLLER_CLASSNAME.value())){
		
			return new VideoInfo();
		}
		
		else if (className.equals(OSClassName.TEMPERATURE_CLASS_NAME.value())){
			
			return new TemInfo();
		}
		
		else if (className.equals(OSClassName.BATTERY_CLASS_NAME.value())){
			
			return new BatteryInfo();
		}
		
		else if (className.equals(OSClassName.DISKINFO_CLASS_NAME.value())){
			
			return new DiskInfo();
		}
		
       else if (className.equals(OSClassName.INSTALLEDSW_CLASS_NAME.value())){
			
			return new InstalledSWInfo();
		
		

	}

		return null;
  }
	
}
