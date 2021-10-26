package com.yash.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) throws Exception  {
		
	
		   try{
			 int count=0;
		      String s;
		      String[] buffer; 
		      File f1=new File("D:/javaio/file1.txt"); 
		      FileReader fr = new FileReader(f1);
		      BufferedReader bfr = new BufferedReader(fr);
		      Path path = Paths.get("D:/javaio/file1.txt");
              System.out.println("path of the file is:" +path);
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the word to be Searched: ");
		      String wrd=sc.nextLine();
		       
		           
		      while((s=bfr.readLine())!=null)   
		      {
		         buffer=s.split(" ");  
		          for (String chr : buffer) 
		          {
		                 if (chr.equals(wrd))   
		                 {
		                   count++;    
		                 }
		          }
		      }
		      if(count==0)  
		      {
		         System.out.println("Word not found!");
		      }
		      else
		      {
		         System.out.println("Word : "+wrd+" found! Count: "+count);
		      }
		      
		   } catch(IOException e) {
           }
	}
}