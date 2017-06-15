package com.oracle.core.java.enum1;

public enum Color {
	BLUE("blue"), RED("red"), BLACK("black");
	
	private String value;
	
	private Color(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
