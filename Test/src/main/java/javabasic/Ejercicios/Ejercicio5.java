// 5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

package javabasic.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Calcular el área de un círculo(pi*R2)");
		
		String informacion = JOptionPane.showInputDialog("Introduce el Radio");
		double radio = Double.parseDouble(informacion);
		
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es "+ area);
	
	}
}
