package com.oracle.core.java;
/**
 * 1） 相同方法名字
	2） 相同的返回值
	3） 不同的参数类型或者参数个数不同
 *
 */
public class MethodOverload {
	public void getName() {
		
	}
	
	
	public void getName(String firstName) {
		
	}
	
	public void getName(int age) {
		
	}
}
