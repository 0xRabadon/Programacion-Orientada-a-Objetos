package cl.uach.info090;

import javax.swing.JOptionPane;

public class IndiceDeMasaCorporal {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Ingresa tu altura en metros\ny tu peso en kilogramos");
		
		int posicionEspacio = input.indexOf(" ");
		String sAltura = input.substring(0,posicionEspacio);
		String sPeso = input.substring(posicionEspacio+1,input.length());
		
		double altura = Double.parseDouble(sAltura);
		double peso = Double.parseDouble(sPeso);
		
		double indiceDeMasaCorporal = peso / Math.pow(altura, 2);
		
		JOptionPane.showMessageDialog(null, "IMC = "+indiceDeMasaCorporal);
		
	}

}
