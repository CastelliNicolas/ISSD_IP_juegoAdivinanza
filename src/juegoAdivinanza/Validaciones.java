package juegoAdivinanza;
import java.util.InputMismatchException;
import java.util.Scanner;
// Creamos la clase Validaciones que contiene metodos para validar diferentes entradas
public class Validaciones {
	// Metodo que valida una variable de tipo INT
	public static int validarInt(Scanner scanner, String mensaje) {
		// Creamos una variable que guarda el valor valido
		int intValido = 0;
		// Booleano que hace de bandera para la verificacion
		boolean validEntry = false;
		// Imprime por pantalla el mensaje ingresado como argumento
		System.out.print(mensaje);
		// Ciclo While que se ejecuta hasta que el valor sea valido
		while(!validEntry) {
			// Intentamos el bloque Try, si tendriamos un error se ejecuta el bloque de catch
			try {
				int n = scanner.nextInt();
				intValido = n;
				validEntry = true;
			} catch (InputMismatchException e){
				//Capturamos el error de InputMismatch
				System.out.println("\nError. La entrada debe ser un valor numérico.");
				// Se limpia la entrada de scanner
				scanner.next();
				System.out.print("\nPor favor, " + mensaje.toLowerCase());	
			}
		}
		// Devolvemos el valor valido
		return intValido;
	}
}