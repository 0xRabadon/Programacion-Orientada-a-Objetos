package cl.uach.info090;
public class Rot13 {

	public static void main(String[] args) {
//		System.out.println(rot13("ABCDZ _!_ abcdz"));
//		System.out.println(rot13B("ABCDZ _!_ abcdz"));
		System.out.println(rot13("Hola como estas?"));
		System.out.println(rot13("Ubyn pbzb rfgnf?"));
	}
	
	public static String rot13B(String cadena){
		String r = "";
		String mapeo1 = "abcdefghijklmnopqrstuvwxyz";
		mapeo1 += mapeo1.toUpperCase();
		String mapeo2 = "nopqrstuvwxyzabcdefghijklm";
		mapeo2 += mapeo2.toUpperCase();
		for(int i=0;i<cadena.length();i++){
			int j = mapeo1.indexOf(""+cadena.charAt(i));
			if (j != -1) r += mapeo2.charAt(j);
			else r += cadena.charAt(i);
		}
		return r;
	}
	
	public static String rot13(String cadena){
		String r = "";
		for(int i=0;i<cadena.length();i++){
			char letra = cadena.charAt(i);
			if( (letra >= 'A' && letra <= 'M') 
					|| (letra >= 'a' && letra <= 'm')) {
				r = r +  ( (char) (letra + 13) );
			}else if( (letra >= 'N' && letra <= 'Z') 
					|| (letra >= 'n' && letra <= 'z')) {
				r = r +  ( (char) (letra - 13) );
			}else r = r + letra;
			
		}
		
		return r;
	}

}
