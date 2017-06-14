package com.oracle.core.java;

public class StaticMethod {
	public static void staticMethod() {
//		noStaticMethod();
	}
	
	public void noStaticMethod() {
		staticMethod();
	}
}
