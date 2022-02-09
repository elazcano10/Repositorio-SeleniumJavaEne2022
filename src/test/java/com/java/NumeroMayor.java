package com.java;
import java.util.*;

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner entero = new Scanner(System.in);
		 
		 int num1, num2;
		 
		 System.out.print("Ingrese el primer valor entero: ");
		 num1 = entero.nextInt();
		 
		 System.out.print("Ingrese el segundo valor entero: ");
		 num2 = entero.nextInt();
		 
		if (num1>num2) {
			
			System.out.print("\n\t\tEl primer valor entero es el mayor");
		} 
		else
			if (num2>num1) {
				
				System.out.print("\n\t\tEl segundo valor entero es el mayor");
			} 
			
			else
				System.out.print("\n\t\tLos valores enteros son iguales");	

	}

}
