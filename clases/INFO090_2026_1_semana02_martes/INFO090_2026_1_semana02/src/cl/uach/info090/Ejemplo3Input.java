package cl.uach.info090;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Ejemplos de entrada de datos 
 * 
 * Usaremos como ejemplo JOptionPane.showInputDialog para 
 * desplegar una ventana en la que el usuario puede ingresar 
 * informacion, o la clase Scanner para leer desde consola 
 *  
 * @author Julio Guerra
 *
 */
public class Ejemplo3Input {

	public static void main(String[] args) {
		// showInputDialog muestra a ventana de dialogo conuna caja de texto
		// cuando el usaurio presiona ok, lo que escribió en la caja de texto 
		// se almacena en un objeto String que es referenciado por la variable 
		// name. 
		String name = JOptionPane.showInputDialog("Ingresa tu nombre");

		// solo se leen String. Si necesitamos un numero debemos trasnformarlo!
		int number = Integer.parseInt(
				JOptionPane.showInputDialog("Ingresa un numero del 1 al 10"));
		
		// Tambien podemos usar Scanner. Necesitamos primero crear un objeto Scanner
		// indicando desde donde leera la informacion. En este caso de la entrada 
		// estandar System.in
		Scanner scanner = new Scanner(System.in);
		System.out.println("Y tu telefono?");
		
		String phoneNumber = scanner.next();
		
		System.out.println("Hola "+name + ", tu numero ("+number+") sera "
				+ "sorteado y te comunicaremos por telefono al "+phoneNumber);
	}

}
