package cl.edutecno;

import java.util.Map;
import java.util.TreeMap;

public class MapColecciones {

	public static void main(String[] args) {
		//datos en Json
//		[{	k			v
//			"nombre" = "Karina",
//			"apellido" = "Vajero",
//			"direccion" = "Santiago"
//		  },
//		 {
//			"nombre" = "Karina",
//			"apellido" = "Vajero",
//			"direccion" = "Santiago" 
//		 }
//	
//		]
		
		//{Marte=2, Tierra=1, Urano=27}
		Map<String, Integer> mapPlanet = new TreeMap<String, Integer>();
		
		mapPlanet.put("Tierra", 1);
		mapPlanet.put("Marte", 2);
		mapPlanet.put("Urano", 27);
		
		System.out.println(mapPlanet);
		
		mapPlanet.remove("Marte");
		
		System.out.println(mapPlanet);
		
		System.out.println(mapPlanet.containsValue(1));
		System.out.println(mapPlanet.containsKey("Tierra"));
		
		
		System.out.println(mapPlanet.get("Tierra"));
		mapPlanet.keySet().forEach(System.out::println);
		
		mapPlanet.entrySet().forEach(System.out::println);
	}

}
