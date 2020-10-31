package javabasic.Ejemplos;

import javax.swing.JOptionPane;

public class DEMOIFOR {

	String nombre;

	public DEMOIFOR() {

		pideNombre();

		escribemensaje();

	}

	private void pideNombre() {

		nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre");
	}

	private void escribemensaje() {

		if (nombre == null || nombre.equals("")) {
			JOptionPane.showMessageDialog(null, "No diste tu nombre");
		} else {

	
			JOptionPane.showMessageDialog(null, "hola " + nombre);
		}
	}

	public static void main(String[] args) {

		new DEMOIFOR();
	}
}
