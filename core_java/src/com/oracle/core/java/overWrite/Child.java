package com.oracle.core.java.overWrite;

import java.io.IOException;

public class Child extends Parent {
	@Override
	public String getName() throws IOException {
		return null;
	}
}
