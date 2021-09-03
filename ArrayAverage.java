package com.yash.array;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] scores = new int[]{78, 59, 65, 35, 98};
	       
	       int sum = 0;
	       for(int i=0; i < scores.length ; i++) {
	       
	        sum = sum + scores[i];
	       }
	        double average = sum / scores.length;
	      
	        System.out.println("Average value of the array elements is : " + average);
	}

	  
}
