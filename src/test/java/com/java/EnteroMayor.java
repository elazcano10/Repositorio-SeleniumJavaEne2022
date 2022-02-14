package com.java;

import javax.swing.JOptionPane;



public class EnteroMayor {
	
	
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int numero3;
		int enteroMayor;
		
		

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número entero: "));
		
		
		System.out.println("El primer número es: "+numero1);
		System.out.println("El segundo número es: "+numero2);
		System.out.println("El tercer número es: "+numero3);
		
		enteroMayor=mayorEntero(numero1, numero2, numero3);
		System.out.println("El entero mayor es: "+enteroMayor);
		
		
		
}

		
	 public static int mayorEntero(int a, int b, int c) {
		 
		int numMayor = a;
		 
		if(b>numMayor)
			numMayor = b;
		
		if(c>numMayor)
			numMayor=c;
		return numMayor;
		 
	 }
		  


	
}

