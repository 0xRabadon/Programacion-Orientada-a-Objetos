package cl.uach.info090;
import javax.swing.JOptionPane;
/**
 * Este programa incluye un método que calcula el dígito verificador del rut, pasado como parámetro String.
 * El programa también muestra como usar JOptionPane para entrada y salida de datos
 * 
 * @author Julio D. Guerra
 *
 */

public class DigitoVerificadorRut {

	public static int calcularDigitoVerificador(String rut){
		if(Integer.parseInt(rut) == 0) return 0; //parseInt parsea una variable ¬raba
		int sum = 0;
		char digito;
		int valorDigito;
		int factor;
		for(int i=0;i<rut.length();i++){
			digito = rut.charAt(rut.length()-1-i);
			valorDigito = digito - '0';
			factor = i%6 + 2;
			sum += factor * valorDigito;
		}
		
		int digitoVerificador = 11 - sum % 11;
		if (digitoVerificador < 10)  return (char) (digitoVerificador  + '0');
		else if (digitoVerificador == 11) return '0';
		else return 'K';
	}
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Ingresa tu rut:");
		if (input == null) {
			JOptionPane.showMessageDialog(null,"Chao!");
		}else{
			char digitoVerificador = (char) calcularDigitoVerificador(input);
			
			JOptionPane.showMessageDialog(null,"El rut es "+input+"-"+digitoVerificador);			
		}
		
	}
	
	

}

/*

		 
 
*/
