/**
 * Programa que dibuja un cuadrado con asterisco con las dimensiones que le introduzcas
 * @author nacho
 * 18.10.13
 */
package probasicjava2;

import java.util.Scanner;

public class DibujaAsterisco {
	public static void main(String[] Args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int num = teclado.nextInt();
		teclado.close();

		// Dibuja la linea de arriba
		for (int i = 0; i < num; i++) {
			System.out.print("* ");
		}

		// Dibuja las lineas de enmedio
		System.out.print("\n");
		for (int h = 0; h < num - 2; h++) {

			// Dibuja el asterisco del lado izquierdo
			System.out.print("* ");

			// Dibuja los espacios entre lado y lado
			for (int e = 0; e < num - 2; e++) {
				System.out.print("  ");
			}

			// Dibuja el asterisco del lado derecho y pasa a la linea de abajo
			System.out.print("*\n");

		}

		// Dibuja la linea de abajo
		if (num!=1) {
			for (int w = 0; w < num; w++) {
				System.out.print("* ");
			}
		}

	}
}
