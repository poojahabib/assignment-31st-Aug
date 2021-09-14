package com.yash.string;

public class StringReplaceChar {

	public static void main(String[] args) {
		String org= "halo";
	      String [] temp=org.split("");
	      int len= temp.length;
	      String newString = "";
	      for(int i=0;i<len;i++)
	      {
	          if(temp[i].matches("a"))
	              temp[i]="e";
	          newString=newString+temp[i]+"";

	      }
	        System.out.println(newString);
	}

}
