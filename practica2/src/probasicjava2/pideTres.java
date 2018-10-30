/**
 * Programa que pide 3 numeros y los muestra ordenados
 * @author ignacio
 * 18.10.11
 */
package probasicjava2;
import java.util.Scanner;

public class pideTres {
	public static void main (String[] Args) {
		
		Scanner teclado = new Scanner(System.in); // Se inicia el objeto teclado
		
		// Se pide que se introduzcan 3 datos y se almacenan
		System.out.println("Intrduce el primer dato");
		int num0 = teclado.nextInt();
		System.out.println("Introduce el segundo dato");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el tercer dato");
		int num2 = teclado.nextInt();
		teclado.close(); // Se cierra el objeto teclado
		// variables auxiliares que se utilizaran posteriormente
		int aux;
		int aux2;
		
		// Se analiza el orden de los numeros
		if (num0 > num1 & num0 > num2) {
			if (num2>num1) {
				aux = num1;
				num1=num2;
				num2=aux;
			}
		}
		if (num1 > num0 & num1 > num2) {
			if (num0 > num2) {
				aux = num1;
				num1 = num0;
				num0= aux;
			}else {
				aux = num0;
				num0 = num1;
				aux2= num2;
				num2 = aux;
				num1 = aux2;
			}
		}
		if (num2 > num1 & num2 > num0) {
			if (num1 > num0) {
				aux = num0;
				num0 = num2;
				num2 = aux;
			}else {
				aux = num0;
				num0 = num2;
				aux2 = num1;
				num1= aux;
				num2=aux2;
			
			}
		}

		// Se muestra por pantalla los numeros ordenados
		System.out.println("\n"+num2+"\t"+num1+"\t"+num0);
	}
}
