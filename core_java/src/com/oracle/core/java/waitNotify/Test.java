package com.oracle.core.java.waitNotify;

public class Test {
	public void handle() {
		new Thread() {
			@Override
			public void run() {
				Object o1 = new Object();
				synchronized(o1) {
					try {
						o1.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	
	public static void main(String[] args) {
		new Test().handle();
	}
}
