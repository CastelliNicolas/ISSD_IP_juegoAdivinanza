package juegoAdivinanza;
import java.util.Random;
import java.util.Scanner;

public class Funciones {
	private Random random = new Random();
	public void adivinarNumero(int max, int min, int intentos ,Scanner scanner) {
		if(max <= min) {
			System.out.print("El rango no es valido.");
			return;
		}
		int nroRan = random.nextInt((max - min) + 1) + min;
		System.out.println("NRO: " + nroRan);
		int nroJug;
		int cont = 1;
		do {
		Formato.imprimirSepMen();
		System.out.println("INTENTO " + cont);
		nroJug = Validaciones.validarInt(scanner, "Ingrese un numero: ");
		scanner.nextLine();
		Funciones.medirProx(nroRan, nroJug);
		cont ++;
		intentos --;
		} while (nroJug != nroRan && intentos > 0);
		Formato.imprimirSepMen();
		System.out.println("El numero era: " + nroRan + "\n");
		if (nroJug == nroRan) {
			System.out.println("FELICIDADES! HAS GANADO. 🏆");			
		}else {
			System.out.println("PERDISTE. TE QUEDASTE SIN INTENTOS. 🛑");			
		}
		
	}
	public static void medirProx(int nroRan, int nroJug) {
		String msg = "";
		if(nroRan < nroJug) {
			msg = "Tu numero esta por encima. 🔺";
			//System.out.println("Tu numero esta por encima.");
		}
		else if(nroRan > nroJug){
			msg = "Tu numero esta por debajo. 🔻";
			//System.out.println();
		} else {
			msg = "Tu numero es correcto. ✔";
		}
		if (nroJug + 1 == nroRan || nroJug - 1 == nroRan) {
			msg += " \nTu numero esta MUY cerca. 🔥🔥🔥";
			//System.out.println("Tu numero esta MUY cerca");
		}
		System.out.println(msg);
		
	}
}
