package cl.uach.info090;
/**
 * Ejemplos de manejo de cadenas (String) 
 * 
 * Cadenas de caracteres en Java son objetos de la clase String
 * y como son objetos tienen metodos que nos permiten relizar procesamiento
 * basico. Creamos String en forma parecida a declarar e inicializar 
 * variables int o double. Sin embargo objetos Strings funcionan muy
 * distinto a variables de tipo primitivo. 
 *  
 * @author Julio Guerra
 *
 */

public class Ejemplo2Strings {

	public static void main(String[] args) {
		// Declarar una variable String 
		// (formalmente una 'referencia' a un objeto String)
		String myName;
		
		// Crear un objeto String
		// Sin embargo el objeto String no se 'crea' hasta que se 
		// inicializa la variable. Notar que literales String en Java 
		// van entre dobles comillas, como "hola"
		myName = "Andrei no nada";
		
		// Para manipular Strings, podemos usar metodos de la clase String 
		// como length, charAt, indexOf, equals, etc. 
		// Un metodo se invoca desde el objeto y no es el objeto pasado al método
		// No es length(myName), sino myName.length()
		int l = myName.length();
		for(int i = 0; i<l; i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}

			System.out.println(myName.charAt(i));
		}
		
		// Pero tambien hay etodos que no son "desde un objeto"
		double d = 10323.141;
		System.out.println(Math.sqrt(d));
		
		
		// Tambien podemos concatenar Strings con el operador + 
		System.out.println(myName + " <-> " + myName.toUpperCase());
		
		// el metodo charAt devuelve un caracter de una posicion de la cadena
		// por ejemplo myName.charAt(0) devuelve el primer caracter 'V'
		// tener en cuenta que el caracter 'V' es distinto del String "V"
		// (notar las comillas simples para caracteres y dobles para String)
		// El siguente ejemplo manipula los caracters de a uno del String myName
		// aprovechando el hecho de que los caracteres son en realidad numeros del
		// codigo de caracteres que encodifican (ver tabla ASCII)
		String caseInverted = "";
		for(int i = 0; i<l; i++){
			char c = myName.charAt(i);
			if(c >= 'a' && c <= 'z') caseInverted += (char)(c-'a'+'A');
			else if(c >= 'A' && c <= 'Z') caseInverted += (char)(c+'a'-'A');
		}
		System.out.println(caseInverted);
		
	}

}
