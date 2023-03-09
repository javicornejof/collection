package cl.edutecno;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueColecciones {

	public static void main(String[] args) {
		
		Queue<String> paises = new LinkedList<String>(Arrays.asList("Chile", "Alemania", "Colombia", "Venezuela", "Argentina"));
		String headReturn = paises.peek();
		
		System.out.println(headReturn);
		
		paises.poll();
		
		System.out.println(paises);

	}

}
