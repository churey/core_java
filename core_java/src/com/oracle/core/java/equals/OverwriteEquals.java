package com.oracle.core.java.equals;

public class OverwriteEquals {
	@Override
	public boolean equals(Object o) {
		return this == o;
	}
	
	
	public static void main(String[] args) {
		System.out.println(new OverwriteEquals().equals(new OverwriteEquals()));
		
		
		OverwriteEquals o1 = new OverwriteEquals();
		System.out.println(o1.equals(o1));
	}
}
