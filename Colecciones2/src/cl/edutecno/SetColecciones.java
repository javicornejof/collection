package cl.edutecno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetColecciones {

	public static void main(String[] args) {
		
		//no permite datos duplicados y el orden de insercción no lo mantiene
		Set<String> listLenguajes = new HashSet<String>(Arrays.asList("GO","Fortran","Pascal", "JavaScript"));
		listLenguajes.add("Java");
		listLenguajes.add("Kotlin");
		listLenguajes.add("Java");
		listLenguajes.add("Kotlin");
		
		System.out.println(listLenguajes);
		
		//no permite datos duplicados y mantiene orden de insercción
		Set<String> listCiudades = new LinkedHashSet<String>(Arrays.asList("Chillan","Osorno","Santiago", "Valparaiso","Valparaiso"));
		System.out.println(listCiudades);
		
		Set<String> listPaises = new TreeSet<String>(Arrays.asList("Chile","Chile","Alemania","España", "Argentina","Belgica"));
		listPaises.add("Holanda");
		System.out.println(listPaises);
		
		List<String> lista = listPaises.stream().collect(Collectors.toList());
		System.out.println(lista);
		
		Set<String> set = lista.stream().collect(Collectors.toSet());
		System.out.println(set);
	}

}
