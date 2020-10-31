package javabasic.Ejemplos;

import javax.swing.JOptionPane;

public class DEMOWHILE {
	String nombre;

	public DEMOWHILE() {

		pideNombre();

		escribemensaje();

	}

	private void pideNombre() {

		nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre");
	}

	private void escribemensaje() {

		while (nombre == null || nombre.equals("")) {
			JOptionPane.showMessageDialog(null, "Debe escribir su Nombre");
		} 

	
			JOptionPane.showMessageDialog(null, "hola " + nombre);
		
	}

	public static void main(String[] args) {

		new DEMOWHILE();
	}
}
