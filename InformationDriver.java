package com.test.wmi.wmitest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.profesorfalken.wmi4java.WMI4Java;
import com.test.wmi.wmitest.constants.OSClassName;
import com.test.wmi.wmitest.helper.StringUtil;

public class InformationDriver {

	public static void main(String[] args) {
		Map<String, String> classMap = new HashMap<String, String>();
		classMap.put("PROCESSOR", OSClassName.PROCESSOR_CLASS_NAME.value());
		classMap.put("RAM", OSClassName.RAM_CLASSNAME.value());
		classMap.put("VIDEO", OSClassName.VIDEO_CONTROLLER_CLASSNAME.value());
		classMap.put("TEMPRATURE", OSClassName.TEMPERATURE_CLASS_NAME.value());
		classMap.put("BATTERY", OSClassName.BATTERY_CLASS_NAME.value());
		classMap.put("DISKDRIVE", OSClassName.DISKINFO_CLASS_NAME.value());
		classMap.put("SOFTWARES INSTALLED", OSClassName.INSTALLEDSW_CLASS_NAME.value());
		for (Entry<String, String> pair : classMap.entrySet()) {
			Map<String, String> systemInfo = StringUtil.buildMap(WMI4Java.get().getRawWMIObjectOutput(pair.getValue()));

			List<String> keyList = SystemInfoFactory.getSystemInfo(pair.getValue()).getInfo();

			System.out.println("\n######## " + pair.getKey() + " Information START ##############");

			for (String key : keyList) {
				System.out.println(key + ": " + systemInfo.get(key));
			}

			System.out.println("######## " + pair.getKey() + " Information  END ##############");

		}

	}

}
