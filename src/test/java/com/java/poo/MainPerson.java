package com.java.poo;

public class MainPerson {

	public static void main(String[] args) {
		
	//	Person p = new Person(" ", "Perez", 20);
		
//		System.out.println("La persona se llama: " +p.getFirstName());
//		System.out.println("La persona se apellida: " +p.getLastName());
//		System.out.println("La persona tiene: " +p.getAge()+" años");
//		
		
		Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setLastName("");    // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());
		

	}

}
