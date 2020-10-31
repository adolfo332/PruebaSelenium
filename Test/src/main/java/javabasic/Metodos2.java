package javabasic;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	static String heredar = "Mensaje de Texto"; // Se declara la variable heredar como static para heredar

	public static List<String> listadeNombres() { // Se declara la variable listadeNombres como static para heredar
		List<String> listaNombres = new ArrayList<>();
		 listaNombres.add("Maria");
		 listaNombres.add("Wendoli");
		 listaNombres.add("Adolfo");
		 listaNombres.add("Zamora");
		 listaNombres.add("Wendoli");
		return listaNombres;

	}

	public static List<String> listadeNombres2() { // Se declara la variable listadeNombres como static para heredar
		List<String> listaNombres = new ArrayList<>();
		 listaNombres.add("Maria");
		 listaNombres.add("Wendoli");
		 listaNombres.add("Adolfo");
		 listaNombres.add("Zamora");
		 listaNombres.add("Wendoli");
		return listaNombres;

	}
	protected List<Integer> listaNumeros(){ // Cuando heredamos un metodo en protected no se va ver en clase MainMetodos
		List<Integer> listaNumeros = new ArrayList<>();
		 listaNumeros.add(12);
		 listaNumeros.add(5);
		 listaNumeros.add(28);
		 listaNumeros.add(16);
		 listaNumeros.add(2);
		 listaNumeros.add(12);
		return listaNumeros;
	}
}
