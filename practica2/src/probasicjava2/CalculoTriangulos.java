/**
 * Programa que segun los lados de un triangulo te dice de que tipo es
 * @author nacho   
 * 18.10.14
 */
package probasicjava2;

import java.util.Scanner;

public class CalculoTriangulos {

	public static void main(String[] Args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		String res = "S";
		do {
			// Pedir datos
			System.out.println("Introduce el lado a del triangulo");
			double a = teclado.nextDouble();
			System.out.println("Introduce el lado b del triangulo");
			double b = teclado.nextDouble();
			System.out.println("Introduce el lado c del triangulo");
			double c = teclado.nextDouble();
			// Evaluar si es un triangulo
			if (a + b < c || a + c < b || b + c < a) {
				// No es un triaungulo, terminar
				System.out.println("Error, los datos introducios no son validos");
				break;
			}
			// Es triangulo, se evalua de que tipo es y se muestra por pantalla
			if (a == b && a == c) {
				System.out.println("Es un triangulo Equilatero");
			} else if (a == b || a == c || b == c) {
				System.out.println("Es un triangulo Isósceles");
			} else {
				System.out.println("Es un triangulo Escaleno");
			}
			// Preguntar si quiere repetir
			System.out.println("Desea repetir la operacion? S/N");
			res = teclado2.nextLine();

		} while (res.equals("S")); // El bucle se repetira si introduce S
		teclado.close();
		teclado2.close();
	}
}
