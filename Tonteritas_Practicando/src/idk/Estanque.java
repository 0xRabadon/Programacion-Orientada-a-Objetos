package idk;

public class Estanque {
	private double capacidad;
	private double estado;
	
	public Estanque(double capacidad) {
		if (capacidad<=0) capacidad =1000;
		this.capacidad = capacidad;
		this.estado = 0.0;
	}
	public Estanque(){
		this(1000);
	}
	public void llenar(double cantidad) {
		if (cantidad<=0) {
			System.out.println("No se puede ingreesar numeros negativos o 0.");
		} else if (capacidad<cantidad) {
			estado = capacidad;
			System.out.println("Te excediste, llenaste mas de lo permitido");
		}else {
			estado = estado + cantidad;
		}
	}
	public void vaciar(double cantidad) {
		if (cantidad<=0) {
			System.out.println("Error, no se puede vaciar negativamente o 0.");
		}else {
			estado -= cantidad;
			if (estado<0) {
				estado = 0.0;
			}
		}
	}
	public double getCapacidad() {
		return capacidad;
	}
	public double getEstado() {
		return estado;
	}
}
