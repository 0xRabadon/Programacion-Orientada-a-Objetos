package tonteras_para_practicar_clases;

public class Auto {
	String marca;
	String color;
	String patente;
	double kilometraje;
	
	public void selMarca(String newMarca) {
		marca = newMarca;
	}
	
	public String obtMarca(){
		return(marca);
	}
}
