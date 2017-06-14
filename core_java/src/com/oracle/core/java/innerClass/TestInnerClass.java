package com.oracle.core.java.innerClass;

public class TestInnerClass {
	public static void main(String[] args) {
		final String firstName = "first name";
		InnerClass inner = new InnerClass(){
			@Override
			public String getName() {
				return firstName;
			}

			@Override
			public void handleName() {
				
			}
		};
		
		
		inner.getName();
		System.out.println(inner.getName());
	}
}
