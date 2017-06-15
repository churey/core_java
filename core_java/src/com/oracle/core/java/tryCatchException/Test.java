package com.oracle.core.java.tryCatchException;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			int i = 1/0;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
