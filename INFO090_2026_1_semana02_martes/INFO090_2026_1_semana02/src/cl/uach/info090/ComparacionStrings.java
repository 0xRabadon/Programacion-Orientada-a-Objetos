package cl.uach.info090;

import javax.swing.JOptionPane;
/**
 * Strings son objetos por lo que la comparación con == 
 * compara sus direcciones de memoria, no sus contenidos. 
 * Para comparar Strings usar el método equals o equalsIgnoreCase
 * 
 * @author Julio D. Guerra
 */
// comentarios hechos por raba
public class ComparacionStrings {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Ingresa algo");
		String s2 = JOptionPane.showInputDialog("Ingresa algo");
		
//Metodo erroneo ya que los string no se comparan con ==      ¬raba
		if(s1 == s2){
			System.out.println("iguales");
		}else{
			System.out.println("distintos");
		}
		

//Metodo correcto, equals compara el contenido, no el espacio de memoria      ¬raba
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("iguales");
		}else{
			System.out.println("distintos");
		}
	}
}
