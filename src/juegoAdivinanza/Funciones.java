package juegoAdivinanza;
import java.util.Random;
import java.util.Scanner;
// Crear la clase Funciones
public class Funciones {
	// Crear el objeto random para la creacion de un numero aleatorio
	private Random random = new Random();
	// Metodo adivinarNumero se ocupa de la totalidad del juego de adivinar un numero aleatorio en X intentos
	public void adivinarNumero(int max, int min, int intentos ,Scanner scanner) {
		int CANT_Int = intentos;
		// Validar que el rango donde se va a elegir el numero aleatorio no sea invalido
		if(max <= min) {
			Formato.imprimirSepMen();
			System.out.print("El rango no es valido. ⚠\n");
			return;
		}
		// Crear numero aleatorio
		int nroRan = random.nextInt((max - min) + 1) + min;
		System.out.println("NRO: " + nroRan);
		// Crear variables y contador de intentos
		int nroJug;
		int cont = 1;
		do {
		Formato.imprimirSepMen();
		System.out.println("INTENTO " + cont + "/" + CANT_Int);
		// Ingresar el valor que cree sea el aleatorio generado
		nroJug = Validaciones.validarInt(scanner, "Ingrese un número: ");
		scanner.nextLine();
		// Metodo medirProx 
		Funciones.medirProx(nroRan, nroJug);
		// Se amuenta el intento para mostrar al jugador en que intento se encuentra
		cont ++;
		// Internamente se va disminuyendo el contador real de intentos hasta finalizar
		intentos --;
		} while (nroJug != nroRan && intentos > 0); // WHILE controla si el numero coincide con el aleatorio o si se acabaron los intentos
		Formato.imprimirSepMen();
		// Mostrar al jugador el numero que se habia generado y que debia adivinar
		System.out.println("El número era: " + nroRan + "\n");
		// Condicion si gana o pierde el jugador imprimir por consola el correspondiente desenlace
		if (nroJug == nroRan) {
			System.out.println("FELICIDADES! HAS GANADO. 🏆");			
		}else {
			System.out.println("PERDISTE. TE QUEDASTE SIN INTENTOS. 🛑");			
		}
		
	}
	// Metodo medirProx señala por consola una pista de donde esta posicionado el numero del jugador con respecto al aleatorio
	public static void medirProx(int nroRan, int nroJug) {
		// Crear variable msg para mostrar por consola la proximidad del numero aleatorio con el del jugador
		String msg = "";
		// En caso que el numero del jugador sea mayor al aleatorio
		if(nroRan < nroJug) {
			msg = "Tu número es demasiado alto. 🔺";
		}
		// En caso que el numero del jugador sea menor al aleatorio
		else if(nroRan > nroJug){
			msg = "Tu número es demasiado bajo. 🔻";
		}
		// // En caso que el numero del jugador sea igual al aleatorio
		else {
			msg = "Tu número es correcto. ✔";
		}
		// En caso de que el jugador se encuentre a solo +- 1 del numero aleatorio
		if (nroJug + 1 == nroRan || nroJug - 1 == nroRan) {
			msg += " \nTu número esta MUY cerca. 🔥🔥🔥";
		}
		// Mostrar por consola el msg resultado para el jugador
		System.out.println(msg);
		
	}
}
