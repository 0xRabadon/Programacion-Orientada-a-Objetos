package cl.uach.info090;
public class FiltrarCadenas {

	public static void main(String[] args) {
		System.out.println(soloValidos("sds#v%a45w5&.1w665/ws/[r5w"));
		System.out.println(soloNumeros("sd%sva45%w51w/66&\5ws]r5w"));
	}
	public static String soloValidos(String cadena){
		String validos = "0123456789aeiou._!";
		String r = "";
		for(int i = 0;i<cadena.length(); i++){
			if(validos.indexOf(cadena.charAt(i)) != -1){
				r += cadena.charAt(i);
			}
		}
		return r;
	}

	public static String soloNumeros(String cadena){
		String validos = "0123456789";
		String r = "";
		for(int i = 0;i<cadena.length(); i++){
			if(validos.indexOf(cadena.charAt(i)) != -1){
				r += cadena.charAt(i);
			}
		}
		return r;
	}
	
}
