package com.yash.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Serializable {
	
	

		public static void main(String[] args) 
		{
			Person person = new Person();
			
			Class cs = person.getClass();
			System.out.println("name of the class:"   +cs.getName());
			
			
			Constructor[]  con = cs.getConstructors();
			for(Constructor ct:con) 
			{
			System.out.println("name of the contructor:"   +ct.getName());
			}
			
			Method [] mtd = cs.getMethods();
			for(Method MT:mtd) 
			{
			System.out.println("name of the methods:"   +MT.getName());
			

		    }

}
}
