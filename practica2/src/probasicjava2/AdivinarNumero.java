/**
 * Programa que compara un numero introducido con un numero aleatorio
 * @author nacho
 * 18.10.15
 */
package probasicjava2;

import javax.swing.JOptionPane;

public class AdivinarNumero {

	public static void main(String[] args) {
		// Se muestra que te deja selecionar tres opciones, su respuesta se almacenaen la variable b
		int b = JOptionPane.showInternalConfirmDialog(null, "Bienvenido a mi programa, ¿Deseas jugar?", "Welcome",
				JOptionPane.YES_NO_CANCEL_OPTION, 2);
		// Se analiza la opcion marcada 
		switch (b) {
		// En caso de marcar la primera opcion  
		case 0:
			// Se muestra un dialogo en la pantalla pidiendo un numero y lo almacena 
			String numS = JOptionPane.showInputDialog(null, "Estoy pensando en un numero del 1 al 10, ¿Cual es?",
					"Adivina", 3);
			// Si no has introducido ningun numero 
			if (numS == null) {
				JOptionPane.showMessageDialog(null, "GOOD BYE", "GOOD BYE", 1);
				break;
			}
			// Si has introducido un numero
			int num = Integer.parseInt(numS); // Convierte el numero introducido a integer
			int numRan = 1 + (int) (Math.random() * 10); // Se crea una variable que almacena un numero aleatorio del 1 al 10
			// Si el numero aleatorio es igual que el que introducimos
			if (num == numRan) {
				JOptionPane.showMessageDialog(null, "Enhorabuena, el numero que estaba pensando era " + numRan,
						"Congratulation", 1);
			// Si el numero aleatorio no es igual que el que introducimos
			} else {
				JOptionPane.showMessageDialog(null, "Fallaste jajaja El numero era " + numRan, "Fail", 0);
			}
			break;
		// En caso de marcar la segunda opcion
		case 1:
			JOptionPane.showMessageDialog(null, "ok", ".|.", 0);
			break;
		// En caso de marcar la tercera opcion
		case 2:
			JOptionPane.showMessageDialog(null, "GOOD BYE", "GOOD BYE", 1);
		}

	}

}
