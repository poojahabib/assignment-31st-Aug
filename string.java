package com.yash.array;

public class stringRepeatedNo {

	public static void main(String[] args) {
		String input=" java is onject oriented java is simple";
		String[] words=input.split(" ");
		int repword=1;
		
		for(int i=0;i<words.length;i++)
		{
			for(" int j=i+1; j<words.length;j++")
			{
				if(words[i].equals(word[j]))
				{
					repword=repword+1;
					words[j]="0";
					
				}
			}
			if(words[i]!="0")
				System.out.println(words[i]+"--"+repword);
			repword=1;
		
		}
	}