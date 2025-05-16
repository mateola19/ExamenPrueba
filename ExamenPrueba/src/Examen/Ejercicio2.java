package Examen;

import java.util.*;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de personas en la cola: ");
		int personasCola = sc.nextInt();
		System.out.println(personasCola);
		
		System.out.println("Introduzca el numeros de asientos ocupados(n entre 0 y 4) por cada vagon " +
		" (Se entiende que un numero es un vagon si esta separado por un espacio): ");
		int ocupados = sc.nextInt();
		System.out.println(ocupados);
		
		System.out.println("------------------------------------------");
		
		int libres = distribucion(ocupados, personasCola);
		
		List<Integer> nVagones = new ArrayList<Integer>();
		nVagones.add(ocupados);
		
		int vagones = nVagones.size();
		
		System.out.println("El tren ha partido con " + vagones + " vagones");
		
		int asientosLibres = (vagones * 4) - ocupados;//ocupados es un placeholder aqui
		
		System.out.println(asientosLibres + " asientos libres, y " + libres + " personas en tierra.");
		
		System.out.println();
	}
	
	public static int distribucion(int ocupados, int personasCola) {
		do {
			
			if (ocupados == 0) {
				personasCola -= 4;
			} else if(ocupados == 1) {
				personasCola -= 3;
			} else if (ocupados == 2) {
				personasCola -= 2;
			} else if (ocupados == 3) {
				personasCola -= 1;
			} else if (ocupados == 4) {
				personasCola -= 0;
			} else {
				System.out.println("Numero no valido tiene que ser un numero entre 0 y 4");
			}
			
		} while(ocupados > 0);
		
		return personasCola;
	}

}

