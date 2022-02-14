package com.java;
import javax.swing.JOptionPane;

public class LimiteVelocidad {

	public static void main(String[] args) {
		
		int vel;
		//String zona;
		int zona;		
		
		vel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del vehículo en km/hr(entero): "));
	//	zona = JOptionPane.showInputDialog("Ingrese el valor entero de acuerdo a la zona en la que conduce (1: Carretera, 2: Zona Escolar, 3: Calle)");
		
		zona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero de acuerdo a la zona en la que conduce (1: Carretera, 2: Zona Escolar, 3: Calle)"));
		
		System.out.println("La velocidad del vehículo es: "+vel+"km/hr");

		//System.out.println("La zona en la que se conduce el vehículo es: "+zona);
		
		limiteVelocidad(vel, zona);
		
		
	}
	
	public static void limiteVelocidad(int x, int y) {
		int velocidadActual=x;
		int lugar = y;
		//String ubicacion = lugar;
		
		//velocidadActual = x;
		int velLimCarretera = 110;
		int velLimEscuela = 10;
		int velLimCalle = 40;
		
		
		 switch(lugar) {
		 case 1:
			 // Block code
			 	if(velocidadActual>velLimCarretera)
					System.out.println("Vas conduciendo en carretera a exceso de velocidad");
				
				else
					System.out.println("Vas conduciendo en carretera, respetando el límite de velocidad");
				
			 	break;
			 
		 case 2:
			 	if(velocidadActual>velLimEscuela)
					System.out.println("Vas conduciendo en zona escolar a exceso de velocidad");
				
				else
					System.out.println("Vas conduciendo en zona escolar, respetando el límite de velocidad");
			 	break;
			 
		 case 3:
			 if(velocidadActual>velLimCalle)
					System.out.println("Vas conduciendo en calle a exceso de velocidad");
				
				else
					System.out.println("Vas conduciendo en calle, respetando el límite de velocidad");
			 	break;
			 
			 
			 default:
				 System.out.println("Lugar desconocido, velocidad no determinada");
				 break;
		 }
		
//		if(ubicacion == "carretera" && velocidadActual>velLimCarretera)
//			System.out.println("Vas conduciendo en carretera a exceso de velocidad");
//		
//		else
//			System.out.println("Vas conduciendo en carretera, respetando el límite de velocidad");
//		
//		if(ubicacion == "escuela" && velocidadActual>velLimEscuela)
//			System.out.println("Vas conduciendo en zona escolar a exceso de velocidad");
//		
//		else
//			System.out.println("Vas conduciendo en zona escolar, respetando el límite de velocidad");
//		
//		if(ubicacion == "calle" && velocidadActual>velLimCalle)
//			System.out.println("Vas conduciendo en calle a exceso de velocidad");
//		
//		else
//			System.out.println("Vas conduciendo en calle, respetando el límite de velocidad");
	} 

}