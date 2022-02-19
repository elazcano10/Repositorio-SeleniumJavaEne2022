package com.java.metodos;

import javax.swing.JOptionPane;

public class Metodos {

	public static void main(String[] args) {
		
		/*
		 * Caracteristicas de un método
		 * 
		 * #1 - Un metodo no puede escribirse fuera de la clase
		 * #2 - Un metodo no se puede escribir dentro de otro metodo
		 * #3 - El metodo main es el punto de entrada del programa
		 * #4 - Un metodo comienza con { y termina con otra }
		 * #5 - Dentro de un metodo se puede invocar otro metodo
		 * #6 - Un metodo se puede sobrecargar (Overloading)
		 * 
		 */
		
//		algo();
		
//		int suma2Numeros = suma(5,7);
//		int suma3Numeros = suma(2,2,2);
//		double suma2NumerosDouble = suma(2.2,2.3);
//		boolean isReallyHuman = isHuman(true);
//		boolean x;
		double y,x2;
	//	boolean comparanum;
		
	//	boolean numero = isLeapYear(-1);
//		x2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));
//		y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro entero: "));
		
		x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un entero: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro entero: "));
	//	x=isLeapYear(y);
//		JOptionPane.showMessageDialog(null,"Se ingresó el entero: "+y);
	
		
//		System.out.println(suma2Numeros);
//		System.out.println(suma3Numeros);
//		System.out.println(suma2NumerosDouble);
//		//System.out.println(isReallyHuman);
//		System.out.println(numero);
//		System.out.println(x);
//		//System.out.println(suma2NumerosDouble);
//		
		
		boolean comparanum = areEqualByThreeDecimalPlaces(x2, y);
		System.out.println(comparanum);
		System.out.println("El primer numero de uno es:" +x2);
		System.out.println("El primer numero de uno es:" +y);
		
//		int suma = suma(1,2);
//		System.out.println(suma);
		
		int mynumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro entero: "));
		// int mynumber = 130;
	        if(isEven(mynumber) == true)
	            System.out.print("Even Number");
	        else
	            System.out.print("Odd Number");

	        
//	        int tipoBomba = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de bomba (1 u otro numero): "));
//	        try {
//				boolean bomba=dimeSiMotorEsParaAgua(tipoBomba);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	        
	}
	
	
	  public static boolean isEven(int mynumber)
	    {
	        return (mynumber % 2 == 0);
	    }

	  
//	  public boolean dimeSiMotorEsParaAgua(int tipoBomba)
//	    { 
//	        boolean motorEsParaAgua = false;
//	        if(tipoBomba == 1)
//	        {
//	            motorEsParaAgua = true;
//	        }
//	        else
//	        {
//	            motorEsParaAgua = false;
//	        }
//	        return motorEsParaAgua;
//	    }
	
	
	public static boolean areEqualByThreeDecimalPlaces(double x2, double y)
	{
		x2 = x2*1000;
		y= y*1000;
		
		if(x2==y)
		{	
			System.out.println("Los numeros son iguales");
			return true;
		
		}
		else
		{
			System.out.println("Los numeros son diferentes");
			return	false;
		}
	}
	
//	public static boolean isLeapYear(int a) {
//		if (a >= 1 && a <=9999)
//		return true;
//		else
//		return false;
//		
//	}
//	
//	public static void printHello() {
//		System.out.println("HELLO");
//	}
//	
//	public static void validateUserLoginPage() {
//		
//	}
//	
//	public static int suma(int x, int y) {
//		return x+y;	
//	}
//	
//	// OVERLOADING - SOBRECARGA
//	public static double suma(double x, double y) {
//		return x+y;	
//	}
	
	// OVERLOADING - SOBRECARGA
//	public static int suma(int x, int y, int z) {
//		int suma = x+y+z;
//		return suma;	
//	}
//	
//	public static boolean isHuman() {
//		return true;
//	}
//	
//	// OVERLOADING - SOBRECARGA
//	public static boolean isHuman(boolean human) {
//		return human;
//	}
//	
//	public static void algo() {
//		printHello();
//		System.out.println(suma(2,2));
//		System.out.println("El es un humano? "+ isHuman());
//	}
//	
	// QA
//	public static void loginApp(String username, String password) {
//		System.out.println("Entering username "+ username);
//		System.out.println("Entering password "+ password);
//	}
	
	// PROD
//	public static void loginApp(String username, String password, String token) {
//		System.out.println("Entering username "+ username);
//		System.out.println("Entering password "+ password);
//		System.out.println("Entering token "+ token);
//	}

}
