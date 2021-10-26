package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayLargestNumber {

	@Test
	public void test() 
		{
			
			ArrayLargestNumber arrayClass = new ArrayLargestNumber();
		   int[] array = {5,4,2,3,1,6};
		   int expected = 4;
		   
		   int actual = arrayClass.ForthLargest(array);
		   assertEquals(expected, actual);
		}
}
