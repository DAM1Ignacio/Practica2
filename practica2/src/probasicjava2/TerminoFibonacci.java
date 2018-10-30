/**
 * Programa que calcula el valor de un término determinado de la sucesión de Fibonacci .
 * @author nacho
 * 18.10.14
 */
package probasicjava2;

import java.util.Scanner;

public class TerminoFibonacci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Se pide un termino del cual queremos saber su valro
		System.out.println("Escribe el termino del que deseas saber su valor");
		int ter = teclado.nextInt();
		teclado.close();
		// Si es un valor positivo
		if (ter >= 0) {
			// Si el termino es 0 su valor sera 0 si no, su valor inicial sera 1
			int c = ter == 0 ? c = 0 : 1;
			int a = 1;
			int b = 1;
			/*
			 * Bucle que se ejecuta solo si el termino es mayor que dos.
			 *  Se aplica la formula de fibonacci
			 */
			for (int i = 2; i < ter; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			// Se muestra el resultado
			System.out.println("El valor del termino " + ter + " es " + c);
			// Si es un valor negativo
		} else {
			System.out.println("Error, el programa no acepta numeros negativos");
		}
	}

}
