package sobrecarga;

public class Test {
	public static void main(String[] args) {
		Caballero humano = new Caballero();
		Mago elfo = new Mago();
		
		humano.atacar();
		elfo.atacar();
	}
}
