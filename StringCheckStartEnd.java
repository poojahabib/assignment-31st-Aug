package com.yash.string;

import java.util.Scanner;
public class StringCheckStartEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String inputString = sc.nextLine();
        int lastIndex = inputString.length()-1;
        sc.close();
        if((inputString.charAt(0) == 'A' || inputString.charAt(0) == 'a') 
            && (inputString.charAt(lastIndex) == 'T' || inputString.charAt(lastIndex) == 't')){
                System.out.println("String starts with 'A' and ends with 'T'");
           
                }
       
        else{
            System.out.println("String does not starts with 'A' and ends with 'T'");

	}
	}
        
	}
