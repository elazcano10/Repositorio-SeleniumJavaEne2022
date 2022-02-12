package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		
		Padre padre1 = new Padre("Jose", 1.80);
		System.out.println("Jose tiene los ojos de color: "+ padre1.colorOjos());
		
//		Padre padre3 = new Hijo("PA", 1.54);
	
		Hijo hijo1 = new Hijo("Juan", 1.75);
		System.out.println("Juan tiene los ojos de color: "+ hijo1.colorOjos());
		System.out.println("Juan tiene el cabello de color: "+ hijo1.colorCabello());
		
		Nieto nieto1 = new Nieto("Juanito", 1.20);
		System.out.println("Juanito tiene los ojos de color: "+ nieto1.colorOjos("Negro"));
		System.out.println("Juanito tiene el cabello de color: "+ nieto1.colorCabello());
		System.out.println("Juanito es de Profesion: "+ nieto1.profesion());

	}

}
