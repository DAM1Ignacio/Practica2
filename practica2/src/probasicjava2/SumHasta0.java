/**
 * Programa que suma los numeros introducidos hasta que introduzcas 0
 * @author nacho
 * 18.10.13
 */
package probasicjava2;

import java.util.Scanner;

public class SumHasta0 {
	public static void main(String[] Args) {
		Scanner teclado = new Scanner(System.in);
		int num; // Se declara la variable num
		int acumulador = 0; // variable en la que se acumulara la suma de los numeros
		// Bucle que se repite hasta que el valor introducido sea 0
		do {
			System.out.println("Introduce un numero :");
			num = teclado.nextInt();
			acumulador += num; // Se van añadiendo los numeros introducidos y sumandose entre ellos
		} while (num != 0); // Condicion para que se termine el bucle
		System.out.println("La suma de todos los numeros es: " + acumulador); // Se muestra el resultado por pantalla
		teclado.close();
	}
}
