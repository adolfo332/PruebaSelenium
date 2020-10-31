//3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Sergio”.
package javabasic.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		System.out.println("Ejemplo Variable String");

		Scanner teclea1 = new Scanner(System.in);
		String nombre1 = teclea1.next();

		System.out.println("Bienvenido "+ nombre1);

	}

}
