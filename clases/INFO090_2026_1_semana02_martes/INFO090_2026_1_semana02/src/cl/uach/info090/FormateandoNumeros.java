package cl.uach.info090;

import java.text.DecimalFormat;

public class FormateandoNumeros {
	
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("##.##"); 
		double a = 10.0/3;
		System.out.println(decimalFormat.format(a));
		double b = a;
		
		System.out.println(Math.round(b));
		b = ((int)(b*100))/100.0;
		System.out.println(b);

	}

}
