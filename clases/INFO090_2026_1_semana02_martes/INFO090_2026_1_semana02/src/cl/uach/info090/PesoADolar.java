package cl.uach.info090;

import javax.swing.JOptionPane;
/**
 * Este programa muestra la declaración, inicialización y uso de constantes
 * La palabra reservada "final" tansforma la declaración en una constante, lo que signfica que
 * su valor no puede ser cambiado posteriormente. 
 * Las constantes se nombran en mayúculas y separando palabras con underscore "_"
 * 
 * @author Julio D. Guerra
 *
 */
public class PesoADolar { 
	static final double CONVERSION_PESOS_POR_DOLAR = 685.2;
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Ingresa una cantidad en pesos chilenos");
		
		double dolares = Double.parseDouble(input) * CONVERSION_PESOS_POR_DOLAR;
		
		JOptionPane.showMessageDialog(null, input + " pesos = "+dolares+" dolares");

	}

}
