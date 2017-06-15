package com.oracle.core.java.fastfail;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		for (String s : list) {
			list.remove(s);
		}
	}
}
