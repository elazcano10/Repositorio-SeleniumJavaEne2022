package com.java.metodos;

import javax.swing.JOptionPane;

public class AreaCalculator {

public static void main(String[] args) {
		
		double radius=0.0;
		double largo=0.0;
		double ancho=0.0;
		double dato;
		double resultado;
		double resultado2;
		dato=leerRadius(radius);
		System.out.println("El radio ingresado es: "+dato+" u");
		
		if(dato>0) {
			resultado=area(dato);
	    	System.out.println("El área del circulo es: "+resultado +"U^2");
		}
		else
			System.out.println("El radio es negativo, el área es inválida...");
		

		resultado2 = area(largo, ancho);
		System.out.println("El área del rectangulo es: "+resultado2+" U^2" );

	}
	
	public static double leerRadius(double x){
		double radius;
		 x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo: "));
		 if(x<0)
			return -1; 
		 else {
		    radius = x;
			return radius;
		 }
		
	}
	
	public static double  area(double radius){
		
		 return (Math.PI)*(radius * radius);
		
		
	}
	
	
	
	
	public static double area(double largo, double ancho){
		largo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del rectangulo: "));
		ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del rectangulo: "));
		
		if(largo<0||ancho<0) 
		{
			System.out.println("El área del rectángulo es inválida...");
			return -1; 
			
		}
		 else { 
			 	System.out.println("El largo del rectangulo es: "+largo+ " u");
			 	System.out.println("El ancho del rectangulo es: "+ancho+ " u");
			 
			 	return (largo * ancho);
		 }
		
		
	}

}
