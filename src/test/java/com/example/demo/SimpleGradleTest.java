package com.example.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleGradleTest {

	@Test
	public void testSimple() {
		assertEquals(new Message().getMessage(),"This is a simple gradle project.");
	}

}
