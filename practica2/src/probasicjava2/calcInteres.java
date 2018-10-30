/**
 * Programa que calcula el interes producido y el capital acumulado
 * @author nacho
 * 18.10.13
 */
package probasicjava2;
import java.util.Scanner;

public class calcInteres {
	public static void main(String[] Args) {
		Scanner teclado = new Scanner(System.in);
		
		// pide los datos
		System.out.println("Introduce el capital inicial");
		double capInicial = teclado.nextDouble();
		System.out.println("Introduce el tipo de interes anual");
		double interesAnual = teclado.nextDouble();
		System.out.println("Introduce el numero de años");
		double numYear = teclado.nextDouble();
		
		// Calcula la formula
		double resulInteres = interesAnual * numYear;
		double resulCapital = capInicial+(capInicial*(interesAnual/100)*numYear);
		
		// Muestra el resutado
		System.out.println("El interes producido ha sido : " + resulInteres);
		System.out.println("El capital total acumulado ha sido : " + resulCapital);
		
		teclado.close();
	}
}
