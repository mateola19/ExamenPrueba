package Examen;

import java.util.*;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea = "";
		String cadena = "";
		do {
			System.out.println("Introduzca cadenas (para parar escriba 'fin'): ");
			linea = sc.nextLine();
			cadena += linea;
		} while (!linea.equalsIgnoreCase("fin"));
		
		Map<Integer, String> mapa = buscarRepeticiones(cadena);
		System.out.println(mapa);
	}
	
	static Map<Integer, String> buscarRepeticiones(String cadena) {
		Map<Integer, String> mapa = new TreeMap<Integer, String>();
		int contador = 0;
		for (String subcadena : cadena.split("(.)\\1+")) {
			mapa.put(contador, subcadena);
			contador++;
		}	
		return mapa;
	}

}

