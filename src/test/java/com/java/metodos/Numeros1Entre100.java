package com.java.metodos;

import javax.swing.JOptionPane;

public class Numeros1Entre100 {

	public static void main(String[] args) {
		
	 int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entero: "));
	 System.out.println("El n�mero ingresado es: "+n);
	 
	 boolean valida;
	 
	 valida = Num1Al100(n);
	 if(valida==true)
	 {
		 System.out.println("El n�mero ingresado est� dentro del rango");
	     System.out.println("Verdadero");
	 }
	 else 
	 {
		 System.out.println("El n�mero ingresado est� fuera del rango");
		 System.out.println("Falso");
	 }
		
	}
	
	
	public static boolean Num1Al100(int numero) {
		
		if (numero>=1&&numero<=100)
		return true;
		else
			return false;
	}

}
