package com.yash.reflection;


import java.io.Serializable;

public class Person implements Serializable {
	
		    private int personId;
		    private String personName;
		    private int personAge;
		    private String personLocation;
			public int getPersonId() {
				return personId;
			}
			public void setPersonId(int personId) {
				this.personId = personId;
			}
			public String getPersonName() {
				return personName;
			}
			public void setPersonName(String personName) {
				this.personName = personName;
			}
			public int getPersonAge() {
				return personAge;
			}
			public void setPersonAge(int personAge) {
				this.personAge = personAge;
			}
			public String getPersonLocation() {
				return personLocation;
			}
			public void setPersonLocation(String personLocation) {
				this.personLocation = personLocation;
			}
		    
		}
		
