package cl.uach.info090;

import javax.swing.JOptionPane;

public class InputOutput {

	public static void main(String[] args) {
		String input = 
				JOptionPane.showInputDialog("Ingresa tu nombre:");
		input = procesaInput(input);
		JOptionPane.showMessageDialog(null,  input);

	}
	
	public static String procesaInput(String in){
		return in.replaceAll(" ","-").replaceAll("_", "-").
				toUpperCase();
	}

}
