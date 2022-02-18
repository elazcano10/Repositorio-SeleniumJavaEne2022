package com.java.metodos;

import javax.swing.JOptionPane;

public class Decimal {

	public static void main(String[] args) {
		
        double x,y;
     
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número decimal: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro número decimal: "));
		
		boolean comparanum = areEqualByThreeDecimalPlaces(x, y);
		System.out.println(comparanum);
		System.out.println("El primer número es: " +x);
		System.out.println("El segundo número  es: " +y);
		
		

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y)
	{
		int a, b;
	    a = (int)(x*100000);
		b = (int)(y*100000);
		
//		 (x) = (int) x;
//		 (y) = (int) y;
		
		if(a==b)
		{	
			System.out.println("Los numeros son iguales en sus primeros 3 decimales");
			return true;
		
		}
		else
		{
			
			System.out.println("Los numeros son diferentes");
			return	false;
			
		}
	}

}
