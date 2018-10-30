/**
 * Programa que pide 8 numeros y muestra la suma de ellos
 * @author nacho
 * 18.10.13
 */
package probasicjava2;

import java.util.Scanner;

public class sumOcho {
	public static void main(String[] Args) {
		Scanner teclado = new Scanner(System.in);

		int acumulador = 0;		// Se crea una variable acumuladora con valor 0

		// Bucle que se repite 8 veces
		for (int i = 0; i < 8; i++) {
			System.out.println("Introduce un numero: ");
			int num = teclado.nextInt();		// Se almacena el valor introducido
			acumulador += num;		// Se suman los valores introducidos
		}

		teclado.close();

		// Se muestra el valor total
		System.out.println("La suma de los 8 numeros es: " + acumulador);		
	}
}
