package javabasic.Ejemplos;

import javax.swing.JOptionPane;

public class Ejemplo5 {

	public static void main(String[] args) {

		System.out.println("OPERADORES ARIMETICOS");

		String numero1 = JOptionPane.showInputDialog("Introduce el Número 1");
		int dato1 = Integer.parseInt(numero1);

		String numero2 = JOptionPane.showInputDialog("Introduce el Número 2");
		int dato2 = Integer.parseInt(numero2);

		JOptionPane.showConfirmDialog(null, "Resultado SUMA: " + (dato1 + dato2));
		JOptionPane.showConfirmDialog(null, "Resultado RESTA: " + (dato1 - dato2));
		JOptionPane.showConfirmDialog(null, "Resultado MULTIPLICACION: " + (dato1 * dato2));
		JOptionPane.showConfirmDialog(null, "Resultado DIVISION: " + (dato1 / dato2));
		JOptionPane.showConfirmDialog(null, "Resultado MODULO: " + (dato1 % dato2));

	}
}
