package javabasic.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		String cap1 = JOptionPane.showInputDialog("Ingresa el NUM 1");
		int num1 = Integer.parseInt(cap1);
		String cap2 = JOptionPane.showInputDialog("Ingresa el NUM 2");
		int num2 = Integer.parseInt(cap2);
		
		String numero1 = JOptionPane.showInputDialog("Ingresa el numero1");
		String numero2 = JOptionPane.showInputDialog("Ingresda el numero 2");
		
		System.out.println("El resultado de la suma: " + (Integer.parseInt(numero1) + Integer.parseInt(numero2)));
		System.out.println("El resultado de la resta: " + (Integer.parseInt(numero1) - Integer.parseInt(numero2)));
		System.out.println("El resultado de la multiplicaci�n: " + (Integer.parseInt(numero1) * Integer.parseInt(numero2)));
		System.out.println("El resultado de la divici�n: " + (Integer.parseInt(numero1) / Integer.parseInt(numero2)));
		
	System.out.println("Ejemplocon declarci�n de variables");
	
	
	System.out.println("El resultado de la suma es: " + (num1 + num2));
	System.out.println("El resultado de la resta es: " + (num1 - num2));
	System.out.println("El resultado de la multiplicaci�n es: " + (num1 * num2));
	System.out.println("El resultado de la divici�n es: " + (num1 / num2));
	
		
	}
		
}



