package com.java.metodos;

import javax.swing.JOptionPane;

public class Bisiesto {

	public static void main(String[] args) {
		int anio = 0;
		int dato;
		boolean bisiesto;
		dato=leerAnio(anio);
		System.out.println("Año ingresado: "+dato);
		bisiesto=isLeapYear(dato);
		System.out.println("¿El año es bisiesto:? "+bisiesto);


		
		
	}
	
	
	public static int  leerAnio(int x){
		
		 x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año a evaluar: "));
		int anio = x;
		return anio;
		
	}


	public static boolean isLeapYear(int dato) {
		
		if(dato >=1 && dato <=9999)
		{
			if((dato % 4 == 0 && dato % 100 != 0) || (dato % 100 == 0 && dato % 400 == 0))
			return true;
			else
			return false;
		}
		else
			return false;
		
		
	}

}
