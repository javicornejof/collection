package cl.edutecno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		//iterar, modificar, destacar métodos para los ArrayList
		
		ArrayList<String> listLenguajes = new ArrayList<String> ();
		//["Java","Kotlin","Phyton",""JavaScript", "C#"]
		listLenguajes.add("Java");
		listLenguajes.add("Kotlin");
		listLenguajes.add("Phyton");
		listLenguajes.add("JavaScript");
		listLenguajes.add("C#");
		
		System.out.println(listLenguajes.get(0));//obtener una posición del indice
		
		//agregando datos mediante Arrays.asList()
		ArrayList<String> listLenguajes2 = new ArrayList<String>(Arrays.asList("C++", "Pascal", "Basic", "R", "Ruby", "GO"));
		
		
		listLenguajes.addAll(listLenguajes2);//agregando un arreglo completo a otro arreglo con el método addAll
		System.out.println(listLenguajes);
		System.out.println(listLenguajes.size());//el tamaño del arreglo
		
		
		listLenguajes.set(0, "SQL");//sustituye directamente el valor contenido en el indice
		System.out.println(listLenguajes);
		
		listLenguajes.add(0, "Java");//añade el valor en el indice indicado, desplazando el indice hacia la derecha
		System.out.println(listLenguajes);
		
		listLenguajes.remove(1);//removiendo un elemento a traves de su indice
		System.out.println(listLenguajes);
		
		listLenguajes.remove("GO");
		System.out.println(listLenguajes);
		
		listLenguajes.add("GO");
		listLenguajes.add("GO");
		listLenguajes.add("GO");
		
		listLenguajes.remove("GO");
		System.out.println(listLenguajes);
		
		System.out.println(listLenguajes.indexOf("Pascal"));
		listLenguajes.add(9,"Ruby");
		System.out.println(listLenguajes.lastIndexOf("Ruby"));
		
		
		List<String> list = new ArrayList<String>(Arrays.asList("GO"));
		
		listLenguajes.removeAll(list);
		System.out.println(listLenguajes);
		
		List<String> listCiudades = new ArrayList<String>(Arrays.asList("Chillan", "Santiago", "Valparaiso", "La Serena", "Algarrobo", "Coquimbo"));
		
		ListIterator<String> ciudadesChile = listCiudades.listIterator();
		System.out.println(ciudadesChile.hasNext());
		
		System.out.println(ciudadesChile.hasPrevious());
		
		listCiudades.stream().sorted().forEach(valor -> valor.equals("Chillan"));
		long cuenta = listCiudades.stream().filter(elemento -> elemento.equals("Chillan")).count();
		System.out.println(cuenta);
		
		List<String> listaCollect = listCiudades.stream().filter(elemento -> elemento.equals("Chillan")).collect(Collectors.toList());
		System.out.println(listaCollect);
		
		List<String> listDistintos = listLenguajes.stream().distinct().collect(Collectors.toList());
		System.out.println(listDistintos);
	}

}
