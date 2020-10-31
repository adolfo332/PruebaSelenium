package javabasic.Ejemplos;

public class Ejemplo3 {
	static int numero;
	static double numero3;
  
	public static void main(String[] args) {
		numero3 = 1.5;
		numero = 2;
		int numero2 = 5;
		String cadenaCaracteres;
		boolean verdaderoOfalso;

		System.out.println(numero * numero2 + numero3);
		
		cadenaCaracteres = "Adolfo Hernández Cruz";
		System.out.println(cadenaCaracteres + " Curso de Selenium");

		verdaderoOfalso = cadenaCaracteres.equals("Adolfo Hernández Cruz");

		System.out.println(verdaderoOfalso);

		if (verdaderoOfalso == true) {
			System.out.println("El nombre es igual");
		} else {
			System.out.println("EL nombre no es igual");
		}

		
		
	}

}
