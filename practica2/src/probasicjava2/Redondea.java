/**
 * Programa para redondear numeros con decimales
 * @author nacho
 * 18.10.14
 */
package probasicjava2;

import java.util.ArrayList;
import java.util.Scanner;

public class Redondea {
	public static void main(String[] Args) {

		Scanner teclado = new Scanner(System.in);// Teclado para numero

		// Mensaje de comienzo del programa
		System.out.println("Programa para redondear.\n" + "Introduce los decimales con . y no , hasta escribir t \n");
		int contadorDatos = 0;
		ArrayList<String> datosTexto = new ArrayList<String>();

		for (; true; contadorDatos++) {
			System.out.println("Introduce un numero con decimales");
			datosTexto.add(teclado.nextLine());

			// Gestiona el fin de la recogida de datos
			if (datosTexto.get(contadorDatos).equals("exit")) {
				break;
			}
		}
		System.out.println("Cuantos decimales se quiere redondear ?");
		double decimales = Double.parseDouble(teclado.nextLine());
		ArrayList<Double> resultados = new ArrayList<Double>();
		int contadorRedondeo = 0;
		
		// Se redondea el numero
		for (; contadorRedondeo < contadorDatos; contadorRedondeo ++) {
			double datoNum = Double.parseDouble(datosTexto.get(contadorRedondeo));
			resultados.add (Math.rint(datoNum * Math.pow(10, decimales)) / Math.pow(10, decimales));
		}
		// Se muestra el numero redondeado
		for(int contadorResultados = 0; contadorResultados<contadorRedondeo; contadorResultados++) {
		System.out.println("El resultado es : " + resultados.get(contadorResultados)); 
		}
		teclado.close();
	}
}
