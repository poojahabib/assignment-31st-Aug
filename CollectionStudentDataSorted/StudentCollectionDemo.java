package com.yash.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentCollectionDemo {

	 class SortStudentBasedOnFirstName implements Comparator<StudentDemo>{
			@Override
			public int compare(StudentDemo o1, StudentDemo o2) {
				return o1.getStudentFirstName().compareTo(o2.getStudentFirstName());
			}
	 }
	
	 class SortStudentBasedOnLastName implements Comparator<StudentDemo>{
		 @Override
			public int compare(StudentDemo o1, StudentDemo o2) {
			 return o1.getStudentLastName().compareTo(o2.getStudentLastName());
			}
	 }
			
		

		public static void main(String[] args) {

			List<StudentDemo> listOfStudent=new ArrayList<>();
			try(Scanner scanner=new Scanner(System.in)){
				
				for(int i=1;i<=2;i++) {
					System.out.println("============Record:"+i+"===========");
					System.out.print("Roll No:");
					int rollNo=scanner.nextInt();
					System.out.print("Student First Name:");
					String studentFirstName=scanner.next();
					System.out.print("Student Last Name:");
					String studentLastName=scanner.next();
					System.out.print("Age:");
					int age=scanner.nextInt();
					System.out.print("Semester 1 Marks:");
					int sem1Marks=scanner.nextInt();
					System.out.print("Semester 2 Marks:");
					int sem2Marks=scanner.nextInt();
					System.out.print("Semester 3 Marks:");
					int sem3Marks=scanner.nextInt();
					
					
					
					StudentDemo student=new StudentDemo();
					student.setRollNo(rollNo);
					student.setStudentFirstName(studentFirstName);
					student.setStudentLastName(studentLastName);
					student.setAge(age);
					student.setSem1Marks(sem1Marks);
					student.setSem2Marks(sem2Marks);
					student.setSem3Marks(sem3Marks);
					listOfStudent.add(student);
					
					System.out.println("=======================");
					
				}
				
			}catch(InputMismatchException e) {
				System.err.println("--Error processing please try again later--");
			}
			
			System.out.println("--data entered by user --");
			for(StudentDemo student:listOfStudent) {
				System.out.println(student);
			}
			
			
			Collections.sort(listOfStudent);
			
			System.out.println("--data sorted based on roll no--");

			for(StudentDemo student:listOfStudent) {
				System.out.println(student);
			}

			System.out.println("--data sorted based on student first name--");
			Collections.sort(listOfStudent, new StudentCollectionDemo().new SortStudentBasedOnFirstName());
			
			for(StudentDemo student:listOfStudent) {
				System.out.println(student);
	 		}
			
			
			System.out.println("--data sorted based on student last name--");
            Collections.sort(listOfStudent, new StudentCollectionDemo().new SortStudentBasedOnLastName());
			
			for(StudentDemo student:listOfStudent) {
				System.out.println(student);
			}
			
			
			
			
			System.out.println("--data sorted based on student ages--");
			Collections.sort(listOfStudent,new Comparator<StudentDemo>() {
				@Override
				public int compare(StudentDemo o1, StudentDemo o2) {
	               if(o1.getAge()>o2.getAge()) {
	            	   return 1;
	               }else if(o1.getAge()<o2.getAge()) {
	            	   return -1;
	               }else {
					return 0;
	               }
				}	
			});
			
			for(StudentDemo student:listOfStudent) {
				System.out.println(student);
			}
		
	}

		//@Override
		public int compare(StudentDemo o1, StudentDemo o2) {
			// TODO Auto-generated method stub
			return 0;
		}

}
