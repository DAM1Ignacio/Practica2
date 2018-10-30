/**
 * Programa que calcula el factorial de el numero introducido
 * @author nacho
 * 18.10.14 
 */
package probasicjava2;

import java.util.Scanner;

public class CalcFactorial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Introduccion de datos por consola
		int num;
		do { 
			System.out.println("Introduce un numero entero");
			num = teclado.nextInt(); // Pide un valor
		} while (num < 0); // Filtro para valores negativos
		int res = 1;	
		teclado.close();

		// calcula el factorial
		if (num == 0) {
			res = 1;
		} else {
			for (int i = 1; i <= num; i++) {
				res *= i;
			}
		}

		// Muestra el resultado
		System.out.println("El factorial de " + num + " es: " + res); 
	
	}

}
