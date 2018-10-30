/**
 * Programa que calcula ecuaciones de segundo grado completas
 * @author nacho
 * 18.10.14
 */
package probasicjava2;

import java.util.Scanner;

public class EcuacionGrado2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// pide datos
		System.out.println("Introduce el valor de a");
		int a = teclado.nextInt();
		System.out.println("Introduce el valor de b");
		int b = teclado.nextInt();
		System.out.println("Introduce el valor de c");
		int c = teclado.nextInt();
		teclado.close();
		double resx1 = 0;
		double resx2 = 0;
		// Resultados datos excepcionales
		if (a == 0 & b == 0) {
			System.out.println("Los valores introducidos hacen que la ecuacion sea degenerada");
		} else if (a == 0 & b != 0) {
			resx1 = (-b + -c / b) / 2 * a;
			resx2 = resx1;
		} else { // Calcula ecuacion
			resx1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			resx2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		}

		// Muestra resultado
		System.out.println("En la ecuacion " + a + "x^2 + " + b + "x + " + c + " = 0\n" + "El resultado seria : \n"
				+ "x1 = " + resx1 + "\nx2 = " + resx2);
	}

}
