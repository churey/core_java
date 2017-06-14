package com.oracle.core.java.extendsInit;

import java.io.IOException;

public class Child extends Parent {
	public Child() {
		System.out.println("Child init.");
	}
	
	public Child(String name) {
		System.out.println("name Child init.");
	}
	@Override
	public String getName() throws IOException {
		return null;
	}
}
