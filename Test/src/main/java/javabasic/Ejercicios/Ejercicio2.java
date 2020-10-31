//2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
package javabasic.Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero1 = 60;
		int numero2 = 60;

		System.out.println("CONDICIONAL IF");
		
		if(numero1>=numero2) {

			if(numero1==numero2) {
				System.out.println("El numero "+numero1+" y "+numero2+" son iguales ");
			}else {
				System.out.println("El numero "+numero1+" es mayor "+numero2);	
		}
		}else{
				System.out.println("El numero "+numero2+" es mayor "+numero1);	
				}			
			
		}

}
