//create a student class with attributes -rollNo, studentFirstName,studentLastName and age.
package com.yash.classes;

public class Student {

		  private int rollNo;
	      private String studentFirstName;
		  private String studentLastName;
		  private int studentAge;
		    
		    public Student() {}
		    
		    public Student(int rollNo, String studentFirstName, String studentLastName, int studentAge) {
		        this.rollNo = rollNo;
		        this.studentFirstName = studentFirstName;
		        this.studentLastName = studentLastName;
		        this.studentAge = studentAge;
		    }
		    @Override
		    public String toString() {
		        return "Roll no. = "+rollNo+"\n"+"FirstName= "+studentFirstName+"\n"+"LastName= "+studentLastName+"\n"+"StudentAge= "+studentAge ;
		    }
		    
		    
		   @Override
		    public boolean equals(Object obj) {
		        if(obj!=null && obj instanceof Student )
		        {
		            Student std=(Student)obj;
		            if(this.rollNo==std.rollNo)
		                return true;
		        }
		        return false;
		    }
		   
		    @Override
		    public int hashCode() {
		        return rollNo*studentAge ;
		    }
		    
		    
		    public int getRollNo() {
		        return rollNo;
		    }
		    public void setRollNo(int rollNo) {
		        this.rollNo = rollNo;
		    }
		    public String getStudentFirstName() {
		        return studentFirstName;
		    }
		    public void setStudentFirstName(String studentFirstName) {
		        this.studentFirstName = studentFirstName;
		    }
		    public String getStudentLastName() {
		        return studentLastName;
		    }
		    public void setStudentLastName(String studentLastName) {
		        this.studentLastName = studentLastName;
		    }
		    public int getStudentAge() {
		        return studentAge;
		    }
		    public void setStudentAge(int studentAge) {
		        this.studentAge = studentAge;
		    }
		    public static void main(String[] args) {
		    
		        Student std1=new Student(30, "Pooja", "Habib", 22);
		        Student std2=new Student(30, "Pooja", "Habib", 22);
		    
		        System.out.println(std1.equals(std2));
		        System.out.println(std1);
		        System.out.println(std2);
		        System.out.println(std1.hashCode()==std2.hashCode());

	}

}
