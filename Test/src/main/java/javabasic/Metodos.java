package javabasic;

public class Metodos {
	
	int  numero1, numero2;
	
	
	public Metodos() { // El constructor es un metodo que se llama igual que la clase
		               // No se esta recibiendo nada por parametro	
		               // Java lo crea automaticamente por defaul
	}
	public Metodos(int numero1, int numero2) {// Se esta recibiendo un int por parametros
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	
	
	// Metodos creados
	public void mostrarMensaje() {  // Declara un metodo tipo Void
		
		System.out.println("Hola Mundo");
	}
	
	public int sumatoria() { // Dlecara un metodo tipo Int
		
		// int sumatoria = numero1+numero2; // forma 1
		//return sumatoria; // forma1
		
		return numero1+numero2; //forma 2
	}
	
	public String mostrarNombre(String nombre) { // Declara un metodo tipo String
		System.out.println(nombre);
		return nombre;	
	}
 
	public static void prueba() {
		System.out.println("Metodo estatico");
	}

}
