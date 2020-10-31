package javabasic.Ejemplos;

import javax.swing.JOptionPane;

public class DEMOIF {

	String nombre;

	public DEMOIF() {

		pideNombre();

		escribemensaje();

	}

	private void pideNombre() {

		nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre");
	}

	private void escribemensaje() {

		if (nombre == null) {
			JOptionPane.showMessageDialog(null, "Oprimiste Cancelar");
		} else

		if (nombre.equals("")) {
			JOptionPane.showMessageDialog(null, "No ingresaste ningun nombre");
		} else {
			JOptionPane.showMessageDialog(null, "hola " + nombre);
		}
	}

	public static void main(String[] args) {

		new DEMOIF();
	}
}