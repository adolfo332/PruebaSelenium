//4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
package javabasic.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static void main(String[] args) {

	System.out.println(" Nombre por JOptionPane");
	
	String nombre2 = JOptionPane.showInputDialog("Ingresa tu Nombre");
	
	System.out.println("Bienvenido " + nombre2);
	
	
}
}
