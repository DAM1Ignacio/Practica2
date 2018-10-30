/**
 * Programa que muestra el mayor de los numeros introducidos
 * @author nacho
 * 18.10.13
 */
package probasicjava2;

import java.util.Scanner;

public class muestraMayor {
	public static void main(String[] Args) {

		Scanner teclado = new Scanner(System.in); // Teclado para los enteros
		Scanner teclado2 = new Scanner(System.in); // Teclado para las string

		System.out.println("Introduce un numero: ");
		int numMayor = teclado.nextInt(); // Se almacena un numero
		System.out.println("Desea seguir? S/n ");
		String respuesta; // Almacena la respuesta
		respuesta = teclado2.nextLine();

		while (respuesta.toUpperCase().equals("S")) { // Si la respuesta es S se acciona el bucle
			System.out.println("Introduce un numero: ");
			int num = teclado.nextInt(); // Se pide un numero
			if (num > numMayor) { // El numero solo se almacena si es mayor
				numMayor = num;
			}

			System.out.println("Desea seguir? S/n "); // El bucle se ejecutara si responde S
			respuesta = teclado2.nextLine();
		}
		System.out.println("El numero introducido mayor es : " + numMayor); // Se muestra el numero mayor

		teclado.close();
		teclado2.close();
	}
}
