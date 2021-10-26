package com.yash.collection1;


public class StudentDemo implements Comparable<StudentDemo>{
		
		private int rollNo;
        private String studentFirstName; 
        private String studentLastName; 
		private int age;
		private int sem1Marks;
		private int sem2Marks;
		private int sem3Marks;
		
		
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSem1Marks() {
			return sem1Marks;
		}
		public void setSem1Marks(int sem1Marks) {
			this.sem1Marks = sem1Marks;
		}
		public int getSem2Marks() {
			return sem2Marks;
		}
		public void setSem2Marks(int sem2Marks) {
			this.sem2Marks = sem2Marks;
		}
		public int getSem3Marks() {
			return sem3Marks;
		}
		public void setSem3Marks(int sem3Marks) {
			this.sem3Marks = sem3Marks;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		
	
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName + ", age=" + age + ",sem1Marks =" + sem1Marks + ",sem2Marks=" + sem2Marks + ",sem3Marks=" + sem3Marks + " ]";
		}
		@Override
		public int compareTo(StudentDemo o) {
			if(this.rollNo>o.rollNo) {
				return 1;
			}else if(this.rollNo<o.rollNo) {
				return -1;
			}else {
			return 0;
			}
		}

	}



