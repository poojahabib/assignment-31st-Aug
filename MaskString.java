package com.yash.string;

public class MaskString {

	public static void main(String[] args) {
			String str="Pooja Habib";
			String[] arr=str.split(" ");
			String str1="";
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length();j++)
				{
					if(j>1&&j<arr[i].length())
					{
						str1+="X";
						
					}
					else
					{char a=arr[i].charAt(j);
					str1+=a;
					}
				}
				str1+=" ";
				
			}
			
	System.out.println(str1);

	}

}
