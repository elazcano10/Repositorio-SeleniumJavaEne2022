package com.java.herencia;

public class Padre {
	
	String nombre;
	double estatura;
	
	// Constructor (Superclase)
	public Padre(String nombre, double estatura) {
		this.nombre = nombre;
		this.estatura = estatura;
	}
	
	// Metodo
	public String colorOjos() {
		return "Café";
	}
	
	// Metodo
		public String colorOjos(String colorOjos) {
			return colorOjos;
		}
	
	public String colorCabello() {
		return "Negro";
	}

}
