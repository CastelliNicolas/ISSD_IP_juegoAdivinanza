package juegoAdivinanza;

public class Formato {
	// Metodo que imprime una linea separadora
	public static void imprimirSep() {
		System.out.println("\n##################################################\n");
	}
	// Metodo que imprime una linea separadora menor
	public static void imprimirSepMen() {
		System.out.println("_______________________________\n");
	}
	// Metodo que imprime parte del titulo de las dificultades segun sus intentos y su rango
	public static void imprimirModo(int max, int min, int intentos) {
		System.out.println("ADIVINA EL NUMERO DEL " + min + " AL "
				+ max +" | "+  intentos + " INTENTOS");
	}
}
