package cl.uach.info090.actividad1;

import java.util.Scanner;

public class IndiceMasaCorporal {

	public static void main(String[] args) {
		double peso;
		double altura;
		double IMC;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cual es tu peso?");
		peso = sc.nextDouble();
		System.out.print("¿Cuanto mides?");
		altura = sc.nextDouble();
		
		IMC = peso/(altura*altura);
		
		System.out.print(IMC);
		sc.close();
	}

}
