package cl.uach.info090;


/**
 * Ejemplos de creacion de variables de distinto tipo
 * usando tipos primitivos. Notar que los tipos primitivos son 
 * en minusculas. 
 * 
 * Cada variable DEBE tener un tipo
 * Hay 8 tipos primitivos en java. Ver detalles en:
 *   https://www.w3schools.com/java/java_data_types.asp
 *  
 * @author Julio Guerra
 *
 */
public class Ejemplo01VariablesYTipos {

	public static void main(String[] args) {
		// Creacion de variables numericas
		
		// declaración de variable int (entera) pero sin inicialización
		int number;
		// inicialización de la variable
		number = 100;
		
		// declaración de variable e inicialización todo-en-uno
		int edad = 22;

		// Ejercicio 1: trata de crear variables byte, short, long
		// en qué casos serviría usarlas?
		
		// declaración e inicialización de numeros con decimales (punto flotante)
		double temperatura = 15.34;
		
		int y = (int) temperatura;
		
		// Ejercicio 2: trata de crear variables float
		// en qué casos serviría usarlas en vez de double?
		
		// Operaciones de número
		// En las siguientes líneas de código, qué se muestra en pantalla??
		// Puedes explicarlo? Cuándo hay decimales y cuando trunca el resultado?
		
		int a = 1;
		int b = 2;
		int c = a/b;
		double d = a/b;
		double d2 = (1.0*a)/b;
		double d3 = ((double)a)/b;
		
		double e = 1.0/b;
		
		//System.out.println(a + " / " + b + " = " + c);
		System.out.println(a + " / " + b + " = " + d);
		//System.out.println("1.0 / "  + b + " = " + e);
		
		// Tipos por defecto y orden de operaciones
		// int y double son los tipos por defecto en números sin y con 
		// decimales. Esto influye en como almacena resultadosde opraciones
		// En el ejemplo anterior, porqué imprime 3.0 y no 3.1????
		// como arreglarlo???
		double x = 2.0 * 0.5 + 21 / 10;
		//System.out.println("2.0*0.5+21/10 = " + f);
		
		// casting (transformando) variables y trasnformaciones por defecto
		//double x = a * d; // x puede almacenar a*d porque es double
		int n = (int) d; // d es double pero forzamos a trasnformarlo en int
		
		// operador modulo (%)
		//System.out.println(10%4);
		System.out.println(Math.round(100/3.0));
		
	}

	
	
}
