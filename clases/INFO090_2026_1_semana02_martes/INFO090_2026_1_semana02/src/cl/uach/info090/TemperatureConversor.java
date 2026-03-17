package cl.uach.info090;
import java.util.Scanner;

public class TemperatureConversor {

	static final double C_F1 = 9.0 / 5.0;
	static final double C_F0 = 32;
	static final double C_K = 273.15;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa una temperatura y su unidad en C, F o K");
		String input = s.nextLine();
		String strNum = input.substring(0,input.length()-1);
		String strUni = input.charAt(input.length()-1) + "";
		double temp = Double.parseDouble(strNum);
		
		if(strUni.equalsIgnoreCase("c")){
			System.out.println(temp+"C = "+c2F(temp)+"F\n"+temp+"C = "+c2K(temp)+"K");
		}else if(strUni.equalsIgnoreCase("k")){	
			System.out.println(temp+"K = "+k2F(temp)+"F");
			System.out.println(temp+"K = "+k2C(temp)+"C");	
		}else if(strUni.equalsIgnoreCase("f")){
			System.out.println(temp+"F = "+f2C(temp)+"C");
			System.out.println(temp+"F = "+f2K(temp)+"K");
		
		}else{
			System.out.println("Debes ingresar una unidad valida"); 
		}
	}
	
	public static double c2F(double t){
		return t*C_F1 + C_F0; 	
	}
	public static double f2C(double t){
		return (t-C_F0)/C_F1;
	}
	public static double k2C(double t){
		return t - C_K;
	}
	public static double k2F(double t){
		return c2F(k2C(t)); 
	}
	public static double c2K(double t){
		return t + C_K;
	}
	public static double f2K(double t){
		return c2K(f2C(t));
	}

}