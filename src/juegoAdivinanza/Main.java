package juegoAdivinanza;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Funciones func = new Funciones();
		int op;
		do {
			System.out.println("Menú de dificultades");
			System.out.println("1. Fácil (1-50, 10 intentos)");
			System.out.println("2. Medio (1-100, 7 intentos)");
			System.out.println("3. Difícil (1-200, 5 intentos) ");
			System.out.println("4. Personalizada (crea tu desafio)");
			System.out.println("5. Salir \n");
			op = Validaciones.validarInt(scanner, "Ingrese la dificultad: ");
			scanner.nextLine();
			int min = 1;
			switch (op){
				case 1:
					Formato.imprimirSep();
					func.adivinarNumero(50, min, 10, scanner);
					Formato.imprimirSep();
					break;
				case 2:
					Formato.imprimirSep();
					func.adivinarNumero(100, min, 7, scanner);
					Formato.imprimirSep();
					break;
				case 3:
					Formato.imprimirSep();
					func.adivinarNumero(200, min, 5, scanner);
					Formato.imprimirSep();
					break;
				case 4:
					Formato.imprimirSep();
					int customMax = Validaciones.validarInt(scanner, "Ingresa el numero maximo del rango: ");
					Formato.imprimirSepMen();
					int customMin = Validaciones.validarInt(scanner, "Ingresa el numero minimo del rango: ");				
					Formato.imprimirSepMen();
					int customTry = Validaciones.validarInt(scanner, "Ingresa el numero de intentos: ");				
					func.adivinarNumero(customMax, customMin, customTry, scanner);
					Formato.imprimirSep();
			}
		} while (op != 5);
		scanner.close();
	}
}
