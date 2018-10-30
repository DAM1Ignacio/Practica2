/**
 * Programa que muestra todos los numeros primos de un intervalo
 * @author nacho
 * 18.10.14
 */
package probasicjava2;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		// Se pide el intervalo de numeros a evaluar
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero del intervalo de numeros a evaluar");
		int int1 = teclado.nextInt();
		System.out.println("Introduce el ultimo numero del intervalo de numeros a evaluar");
		int int2 = teclado.nextInt();
		// Si el numero es menor que uno o uno, imprime el uno
		if (int1 <= 1)
			System.out.println("1");
		teclado.close();

		// Bucle que se ejecutara una vez por cada numero compredido en el intervalo

		for (int i = int1; i <= int2; i++) {
			boolean prim = false;
			/*
			 * Este bucle lo dividira hasta que el divisor sea igual que el numero el bucle
			 * Le dara valor true al bolean prim si es primo
			 */

			for (int div = 2; div < i; div++) {
				double resto = i % div;
				if (resto == 0) {
					prim = false;
					break;
				}
				prim = true;
			}
			// Si el bolean prim es true mosrtara el numero en pantalla
			if (prim) {
				System.out.println(i);
			}
		}
	}

}
