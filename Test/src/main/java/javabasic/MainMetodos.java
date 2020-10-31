package javabasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class MainMetodos extends Metodos2  { // extends sirve para heredar toda las propiedades de la clase y metodos

	public static void main(String[] args) {
		
		Metodos nombreObjecto = new Metodos();
		Metodos nombreObjecto2 = new Metodos(9,9);
		Metodos2 objecto = new Metodos2();
		
		System.out.println(heredar); // Se esta heredando la variable heredar del el  Metodos2
		
		
		System.out.println("Se llama al Metodo que NO tiene Parametros Asignados");
		System.out.println(nombreObjecto.sumatoria());
		
		System.out.println("Se llama al Metodo que SI tiene Parametros Asignados");
		System.out.println(nombreObjecto2.sumatoria()); // Se manda a llamar el metodo sumatoria
		
		System.out.println("Se llama al Metodo que muestra el MENSAJE ASIGNADO");
		nombreObjecto.mostrarMensaje();
		
		System.out.println("Se llama al Metodo que MOSTRAR NOMBRE");
		String elementoGuardado = nombreObjecto.mostrarNombre("Adolfo");
		System.out.println(elementoGuardado);
		
		System.out.println("Se llama al Metodo ESTATICO");
		Metodos.prueba();

		
		System.out.println("Se llama al Metodo LISTA DE NOMBRES");
		// List<String> listaNombres = objecto.listadeNombres(); // se llama el el metodos2 como objecto
		List<String> listaNombres = listadeNombres(); // Se esta heredando la variable listadeNombre ya no necesita crear una instacia del Metodos2
	
		System.out.println("For con dos puntos");
		for(String nombre : listaNombres) {
			System.out.println(nombre);
			
		}
		System.out.println("For con Index");
		for(int indice=0 ; indice<listaNombres.size();indice++) {
			System.out.println(listaNombres.get(indice));
		}
		
		List<String> nombreSinElementosDuplicados = listaNombres.stream().distinct().collect(Collectors.toList()); // Instruccion para quitar elementos duplicados de una lista
		System.out.println(nombreSinElementosDuplicados);
		Collections.sort(nombreSinElementosDuplicados); //Ordena de forma alfabetica la lista
		System.out.println(nombreSinElementosDuplicados);
	    Collections.sort(nombreSinElementosDuplicados,Collections.reverseOrder());  // Invierte el orden de la lista
		System.out.println(nombreSinElementosDuplicados);
		

		System.out.println("Se llama al Metodo LISTA DE NUMEROS");
		List<Integer> listaNumeros = objecto.listaNumeros();
		
		System.out.println(Collections.max(listaNumeros)); // Selecciona el mayor
		System.out.println(Collections.min(listaNumeros)); // Selecciona el menor
		Collections.sort(listaNumeros); // ordena de menor a mayor la numeración
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros, Collections.reverseOrder()); /// Invierte el orden de la lista
		System.out.println(listaNumeros);

		Object last = null;  // Cliclo para quitar una lista de enteros
		int numCount = 0; //
		Iterator<Integer> i = listaNumeros.iterator(); //
		// hasNext va interando cada uno y nos da un elemento booleano
		while(i.hasNext()) { //
			Object temp = i.next(); //
			if(temp.equals(last)) { //
				i.remove(); //
				numCount ++; // numCount = numCount + 1
			}else {  //
				last = temp; //
			}	
		}
		System.out.println("Contador cuantas veces se repite");
		System.out.println(numCount);
		System.out.println(listaNumeros);
		
		
		System.out.println("For condos puntos");
		for(int numero : listaNumeros) {
			System.out.println(numero);
		}
		
		System.out.println("For con Index");
		for(int indice=0 ; indice<listaNumeros.size();indice++) {
			System.out.println(listaNumeros.get(indice));
		}
		
		// Comparar dos listas de nombres
		List<String> nombres1 = listadeNombres();
		List<String> nombres2 = listadeNombres2();
		
		Collections.sort(nombres1);// Ordenar la lista
		Collections.sort(nombres2);// Ordenar la lista2
		
		boolean isIgual = nombres1.equals(nombres2); // Se declara una variable boolean y se iguala con equals
		System.out.println(isIgual);
		
		if(isIgual == true) {
			System.out.println("Las listas son iguales: Lista 1"+nombres1+" lista2 "+nombres2);		
		}else {
			System.out.println("Las listas no son iguales: Lista 1"+nombres1+" lista2 "+nombres2);
		}
		
		
	}// main

}
