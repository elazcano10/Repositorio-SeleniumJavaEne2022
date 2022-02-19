package com.java.poo;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person() {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
//	
//	public Person(String firstName, String lastName, int age) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		
//	}

// GETTERS AND SETTERS
	
	

	//M�todo 1
	public String getFirstName() {
		return firstName;
		
	}
	
	//M�todo 2
	public String getLastName() {
		return lastName;
		
	}
	
	//M�todo 3
	public int getAge() {
		return age;
		
	}
	
	//M�todo 4
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	//M�todo 5
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//M�todo 6
	public void setAge(int age) {
		if(age<0&&age>100) {
			this.age = 0;
		}else {
			this.age = age;
		}
		
	}	
	
	
	//M�todo 7
	public boolean isTeen() {
		if(age>12&&age<20) {
			return true;
		}else {
			return false;
		}
		
	}	
	
	//M�todo 8
	public String getFullName() {
		if(firstName.isEmpty())
			return lastName;
		else  
			if(lastName.isEmpty())
				return firstName;
		
		return firstName+" "+lastName;
		
		
	}


	
}
