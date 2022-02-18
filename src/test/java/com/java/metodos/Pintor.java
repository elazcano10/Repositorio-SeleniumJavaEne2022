package com.java.metodos;

import javax.swing.JOptionPane;

public class Pintor {

	public static void main(String[] args) {
		
		int resultado;
		double ancho=0.0;
		double altura=0.0;
		double areaPerBucket=0.0;
		double extraBuckets=0.0;
		
		ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho de la pared: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la pared: "));
		areaPerBucket = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el area: "));
		extraBuckets = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del rectangulo: "));
		
		resultado = getBucketCount(ancho, altura, areaPerBucket, extraBuckets);
		
		System.out.println("Los valores son:"+resultado);
	    System.out.println("valor redondeado de ancho es:"+Math.round(ancho));

	}
	
	
	
	public static int getBucketCount(double ancho, double altura, double areaPerBucket, double extraBuckets){
//		ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho de la pared: "));
//		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la pared: "));
//		areaPerBucket = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el area: "));
//		extraBuckets = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del rectangulo: "));
		if(ancho<0 || altura<0)
		  return -1;
		else
			return (int)  areaPerBucket;
	}

}
