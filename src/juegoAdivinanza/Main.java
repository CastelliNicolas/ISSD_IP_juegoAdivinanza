package juegoAdivinanza;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear objeto Scanner
		Scanner scanner = new Scanner(System.in);
		// Crear objeto Funciones para la utilizacion de sus metodos
		Funciones func = new Funciones();
		// Crear variables
		int op;
		int min = 1;
		// Presentar el juego por consola
		Formato.imprimirSep();
		System.out.println("-------------JUEGO DE ADIVINANZA 1.0-------------");
		System.out.println("Adivina el numero aleatorio. Tienes una cantidad\nlimitada de intentos para intentarlo. "
				+ "Puedes elegir \nla dificultad que prefieras.\n" +"\nBuena suerte. 👍");
		Formato.imprimirSep();
		// Ciclo DOWHILE para el funcionamiento del menu de dificultad
		do {
			// Opciones de dificultad mostradas por consola
			System.out.println("Menú de juego");
			System.out.println("1. Fácil (1-50, 10 intentos)");
			System.out.println("2. Medio (1-100, 7 intentos)");
			System.out.println("3. Difícil (1-200, 5 intentos) ");
			System.out.println("4. Personalizada (crea tu desafio)");
			System.out.println("5. Cerrar el juego \n");
			// Ingresar la dificultad elegida por consola
			op = Validaciones.validarInt(scanner, "Ingrese la opción de juego: ");
			scanner.nextLine();
			// estructura SWITCH para las diferentes dificultades 
			switch (op){
				// Modo Facil 
				case 1:
					Formato.imprimirSep();
					System.out.print("MODO FACIL | ");
					// Setteo del modo facil en un rango de 50 - 1, con 10 intentos.
					func.adivinarNumero(50, min, 10, scanner);
					Formato.imprimirSep();
					break;
				// Modo Intermedio
				case 2:
					Formato.imprimirSep();
					System.out.print("MODO INTERMEDIO | ");
					// Setteo del modo intermedio en un rango de 100 - 1, con 7 intentos.
					func.adivinarNumero(100, min, 7, scanner);
					Formato.imprimirSep();
					break;
				// Modo Dificil
				case 3:
					Formato.imprimirSep();
					System.out.print("MODO DIFICIL | ");
					// Setteo del modo dificil en un rango de 200 - 1, con 5 intentos.
					func.adivinarNumero(200, min, 5, scanner);
					Formato.imprimirSep();
					break;
				// Modo Personalizado. Permite la creacion de una modalidad elegida por el usuario por consola
				case 4:
					Formato.imprimirSep();
					// Ingresar por consola el extremo superior del rango
					int customMax = Validaciones.validarInt(scanner, "Ingresa el numero maximo del rango: ");
					Formato.imprimirSepMen();
					// Ingresar por consola el extremo inferior del rango
					int customMin = Validaciones.validarInt(scanner, "Ingresa el numero minimo del rango: ");				
					Formato.imprimirSepMen();
					// Ingresar la cantidad de intentos con la que se desea jugar
					int customTry = Validaciones.validarInt(scanner, "Ingresa el numero de intentos: ");
					Formato.imprimirSep();
					System.out.print("MODO PERSONALIZADO | ");
					// Con todas las opciones setteadas se crea el modo configurado por consola
					func.adivinarNumero(customMax, customMin, customTry, scanner);
					Formato.imprimirSep();
					break;
				default:
					Formato.imprimirSepMen();
					System.out.println("Opción invalida. ⚠");
					Formato.imprimirSepMen();
					break;
			}
		} while (op != 5); // Ingresar el valor 5 terminara el programa
		System.out.print("Saliendo... Gracias por jugar! 😁");
		scanner.close(); // Cierre de scanner
	}
}
