package com.java;
import java.util.Scanner;

public class NumeroEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entero = new Scanner(System.in);
		 
		 int numero;
		 
		 System.out.print("Ingrese un n�mero entero: ");
		 numero = entero.nextInt();
		 
		if (numero>0 && numero % 2 == 0) {
			
			
				System.out.print("\n\t\tEl n�mero entero es positivo");
				System.out.print("\n\t\tEl n�mero entero es par");

		} 
		else
			if (numero>0 && numero % 2 != 0) {
				
				System.out.print("\n\t\tEl n�mero entero es positivo");
				System.out.print("\n\t\tEl n�mero entero es impar");
			} 
			
			else
				if (numero<0 && numero % 2 == 0) {
					
					System.out.print("\n\t\tEl n�mero entero es negativo");
					System.out.print("\n\t\tEl n�mero entero es par");
				} 
			    else
					if (numero<0 && numero % 2 != 0) {
						
						System.out.print("\n\t\tEl n�mero entero es negativo");
						System.out.print("\n\t\tEl n�mero entero es impar");
					} 
					else
						System.out.print("\n\t\tEl n�mero entero es cero");

	}

}
