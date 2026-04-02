package cl.uach.info090.actividad1;

import java.util.Scanner;

public class IndiceMasaCorporal {

	public static void main(String[] args) {
		double peso;
		double altura;
		double IMC;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cual es tu peso?:");
		peso = sc.nextDouble();
		System.out.print("¿Cuanto mides?:");
		altura = sc.nextDouble();
		sc.close();
		
		IMC = peso/(altura*altura);
		System.out.print("Tu IMC es:" + IMC + " ");
		
		if (IMC < 16.0) {
			System.out.print("Estas severamente delgado");
		} else if (IMC < 16.9) {
			System.out.print("Estas moderadamente delgado");
		} else if (IMC < 18.4) {
			System.out.print("Estas delgado");
		} else if (IMC < 24.9) {
			System.out.print("Estas normal :D");
		} else if (IMC < 29.9) {
			System.out.print("Estas con sobrepeso");
		} else if (IMC < 34.9) {
			System.out.print("Estas con obesidad Tipo I");
		} else if (IMC < 39.9) {
			System.out.print("Estas con obesidad Tipo II");
		} else {
			System.out.print("Estas con obesidad Tipo III");
		}
	}

}