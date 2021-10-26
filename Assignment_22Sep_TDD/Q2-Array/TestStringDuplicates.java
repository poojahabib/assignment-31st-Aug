package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringDuplicates {

	@Test
	public void test() {
        
		StringDuplicates sd = new StringDuplicates();
		
		String str = "Java is Object Oriented and Java is a good programmig Language Too";
		int expected = 2;
		
		int actual = sd.findDuplicateInString(str);
		assertEquals(expected,actual);
	}

}
