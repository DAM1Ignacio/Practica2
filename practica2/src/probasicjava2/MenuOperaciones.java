/**
 * Menu para realizar operaciones con 2 numeros
 * @author nacho
 * 18.10.14
 */
package probasicjava2;

import java.util.Scanner;

public class MenuOperaciones {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int res; // variable que almacena la opcion elegida en el menu
		do {
			// Muestra las opciones del menu
			System.out.println("" + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. dividir\n" + "5. Salir");

			res = teclado.nextInt();
			// Variables que se utilizan en las operaciones
			int num1;
			int num2;
			int total;
			// Switch que evalua la opcion del menu
			switch (res) {
			// Caso suma
			case 1:
				System.out.println("Introduce el valor 1");
				num1 = teclado.nextInt();
				System.out.println("Introduce el valor 2");
				num2 = teclado.nextInt();
				total = num1 + num2;
				System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + total);
				break;
			// Caso Resta
			case 2:
				System.out.println("Introduce el valor 1");
				num1 = teclado.nextInt();
				System.out.println("Introduce el valor 2");
				num2 = teclado.nextInt();
				total = num1 - num2;
				System.out.println("El resultado de " + num1 + " - " + num2 + " es: " + total);
				break;
			// Caso Multiplicacion
			case 3:
				System.out.println("Introduce el valor 1");
				num1 = teclado.nextInt();
				System.out.println("Introduce el valor 2");
				num2 = teclado.nextInt();
				total = num1 * num2;
				System.out.println("El resultado de " + num1 + " x " + num2 + " es: " + total);
				break;
			// Caso division
			case 4:
				System.out.println("Introduce el valor 1");
				num1 = teclado.nextInt();
				System.out.println("Introduce el valor 2");
				num2 = teclado.nextInt();
				total = num1 / num2;
				System.out.println("El resultado de " + num1 + " : " + num2 + " es: " + total);
				break;
			}

		} while (res != 5); // Se saldra del bucle cuando el valor introducido sea 5

		teclado.close();

	}

}
