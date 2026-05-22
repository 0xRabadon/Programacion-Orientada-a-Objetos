package cl.uach.info090.act5;

public class Rut {
	private String Rut;
	public Rut(String rut) {
		this.Rut = rut;
	}
	public char computeDv() {
		int sum = 0;
		int j = 2;
		
		for (int i = getRut().length() - 1; i >= 0; i--) {
			sum = sum + Character.getNumericValue(getRut().charAt(i)*j);
			j += 1;
			if (j == 8) {
				j = 2;
			}
		}
		
		int resto = 11 - (sum % 11);
		if (resto == 11) {
			return '0';
		} else if (resto == 10){
			return 'K';
		} else {
			return (char) ('0'+resto);
		}
	}
	public String getRut() {
		return Rut;
	}
	public String toString() {
		char verichar = computeDv();
		String verificador = Character.toString(verichar);
		String rutDv = getRut() + verificador;
		return rutDv;
	}
		
}
