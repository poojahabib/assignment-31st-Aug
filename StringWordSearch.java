package com.yash.string;

public class StringWordSearch {

	public static void main(String[] args) {
		String original = "Java is Object Oriented. Java is platform independent. Java is simple.";
		String word = "Java";
		String temp[] = original.split(" ");
		int count = 0;
		for (int i = 0; i< temp.length; i++)
		{
			if (word.equals(temp[i]))
				count++;
		}
		System.out.println("The string is: " + original);
		System.out.println("The word " + word + " occurs " + count + " times in the string");

	}

	}


