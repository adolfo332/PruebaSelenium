// 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
package javabasic.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	 
	public static void main(String[] args) {
	
		String ingresa = JOptionPane.showInputDialog(null, "Ingresa el número "); // FORMA 1
		int numero = Integer.parseInt(ingresa);
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número ")); // FORMA 2 Convertir una variable directamente
		
		if (numero2%2==0) {
			
			System.out.println("El numero " + numero + " es divisible entre 2");
			
		}else {
			System.out.println("El numero " + numero + " no es divisible entre 2");
		}
}
}
