package com.java.poo;

public class Main {

	public static void main(String[] args) {
		
		// Perro
		Perro chihuahua = new Perro();
//		chihuahua.raza = "Cabeza de venado";
//		chihuahua.color = "cafe";
//		chihuahua.tamano = "chico";
//		chihuahua.nombre = "Mero Macho";
//		chihuahua.numeroPatas = 4; 
		
		Perro perro3;
		
		// Perro 1
		Perro perro1 = new Perro("Chihuahua", "Cafe", "Chico", "Spaiky");
	//	perro1.setRaza("Pomeriano");
		perro1.setNumeroPatas(4);
		System.out.println("Mi perro es de raza "+perro1.getRaza());
		System.out.println("Mi perro es de color "+perro1.getColor());
		System.out.println("Mi perro se llama "+perro1.getNombre());
		System.out.println("Mi perro tiene "+perro1.getNumeroPatas()+" patas");
		
		// Perro 2
//		Perro perro2 = new Perro("San Bernado", "Blanco", "Grande","Cool", 3);
//		perro2.setNumeroPatas(5);
//		System.out.println("Mi perro tiene "+perro2.getNumeroPatas() + " Patas");
//		
		
		
		

	}

}
