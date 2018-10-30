/**
 * Programa que muestra los multiplos de 3 hasta 3000
 * @author nacho
 * 18.10.14
 */
package probasicjava2;

public class MultiplosTres {
	public static void main(String[] Args) {
		int res = 0; // Se inicializa la variable que almacenara el resultado
		for (int i = 0; res < 3000; i++) { // El bucle se repetira hasta que el resultado sea mayor de 3000
			res = 3 * i; // El resultado es 3 por el numero de ejecucion del bucle.
			System.out.println(res); // se imprime el resultado por pantalla
		}
	}
}
