package com.java;

import javax.swing.JOptionPane;

public class OperacionesAritmeticasMetodos {
	//Atributos
	
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//Métodos
	
	
	//Método para leer números
	public void leerNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entero: "));
	}
	
	
	//Método para sumar dos números enteros
	
	public void sumar () {
		suma = numero1 + numero2;
		
	}
	
	//Método para restar dos números enteros
	
		public void restar () {
			resta = numero1 - numero2;
			
		}
		
	//Método para multiplicar dos números enteros
		
		public void multiplicar () {
			multiplicacion = numero1*numero2;
			
		}
		
	//Método para dividir dos números enteros
		
		public void dividir () {
			division = numero1 / numero2;
			
		}	
		
		
	//Método para mostrar los resultados en consola de las operaciones aritméticas de los dos números enteros	
		
		public void imprimirResultados() {
			System.out.println("La suma de los números enteros es: " +suma);
			System.out.println("La resta de los números enteros es: " +resta);
			System.out.println("La multiplicación de los números enteros es: " +multiplicacion);
			System.out.println("La división de los números enteros es: " +division);
			
		}
		

}