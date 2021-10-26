package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArrayClass {
	@Test
	public void test()
	{
		ArrayClass arrayclass = new ArrayClass();
		
		int [] arr = {2,3,4,5,6,7,9,10,11};
		int expected = 5;
		
		int actual = arrayclass.findCountOfPrime(arr);
		assertEquals(expected,actual);
	}	
}
