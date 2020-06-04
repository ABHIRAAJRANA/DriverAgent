package com.test.wmi.wmitest;

import java.util.ArrayList;
import java.util.List;

public class RamInfo implements SystemInfo {

	private static final String TYPE_DETAIL = "TypeDetail";

	private static final List<String> KEYS = new ArrayList<String>();

	static {
		KEYS.add(TYPE_DETAIL);

	}

	public List<String> getInfo() {
		return KEYS;
	}

}
