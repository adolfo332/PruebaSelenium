package javabasic.Ejemplos;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		System.out.println("Operadores Arimeticos");
		
		System.out.println("Digite el numero 1");
		Scanner scanner_num1 = new Scanner(System.in);
		int dato_num1 = scanner_num1.nextInt();
		
		System.out.println("Digite el numero 2");
		Scanner scanner_num2 = new Scanner(System.in);
		int dato_num2 = scanner_num2.nextInt();
		
		System.out.println("Suma de N�meros "+""+ (dato_num1 + dato_num2));
		System.out.println("Resta de N�mero "+""+ (dato_num1 - dato_num2));
		System.out.println("Divisi�n de N�mero "+""+ (dato_num1 / dato_num2));
		System.out.println("Multiplicaci�n de N�meros "+""+ (dato_num1 * dato_num2));
		System.out.println("M�dulo de N�mero "+""+ (dato_num1 % dato_num2));
	}
}
 	 	