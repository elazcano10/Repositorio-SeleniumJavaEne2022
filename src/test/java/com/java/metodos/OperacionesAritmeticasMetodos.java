package com.java.metodos;

import javax.swing.JOptionPane;

public class OperacionesAritmeticasMetodos {
	//Atributos
	
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//M�todos
	
	
	//M�todo para leer n�meros
	public void leerNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro n�mero entero: "));
	}
	
	
	//M�todo para sumar dos n�meros enteros
	
	public void sumar () {
		suma = numero1 + numero2;
		
	}
	
	//M�todo para restar dos n�meros enteros
	
		public void restar () {
			resta = numero1 - numero2;
			
		}
		
	//M�todo para multiplicar dos n�meros enteros
		
		public void multiplicar () {
			multiplicacion = numero1*numero2;
			
		}
		
	//M�todo para dividir dos n�meros enteros
		
		public void dividir () {
			division = numero1 / numero2;
			
		}	
		
		
	//M�todo para mostrar los resultados en consola de las operaciones aritm�ticas de los dos n�meros enteros	
		
		public void imprimirResultados() {
			System.out.println("La suma de los n�meros enteros es: " +suma);
			System.out.println("La resta de los n�meros enteros es: " +resta);
			System.out.println("La multiplicaci�n de los n�meros enteros es: " +multiplicacion);
			System.out.println("La divisi�n de los n�meros enteros es: " +division);
			
		}
		

}