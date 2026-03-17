package cl.uach.info090;

import javax.swing.JOptionPane;

public class CuentaPrimos { 
	
	public static void main(String[] args) {
		// 1. pedir al usuario 2 numeros
		String input = JOptionPane.showInputDialog("Ingresa dos números enteros, separados por espacio");
		String[] strNums = input.split(" ");
		
		int num1 = Integer.parseInt(strNums[0]);
		int num2 = Integer.parseInt(strNums[1]);
		// 2. verificar el menor y el mayor 		
		// swap si num1>num2
		if(num1 > num2){
			int temp = num1;
			num1  = num2;
			num2 = temp;
		}
		// 3. iterar desde el menor al mayor
		for(int i = num1; i <= num2; i++){
//			3.1 por cada numero, si es primo imprimir en pantalla
			if(esPrimo(i)) System.out.println(i);
		}
		
		
		
	}
	
	public static boolean esPrimo(int n){
		if(n == 0) return false;
		if(n > 0 && (n == 1 || n == 2)) return true;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0) return false;
		}
		return true;
	}
	
	
}
