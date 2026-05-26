package cl.uach.info090.act5;

public class Rut {
	private String Rut;
	public Rut(String rut) {
		// Encontre este metodo para poder eliminar el guion o los punto del string, lo bakan es que quitara todo lo que no sea numeros :D
		String num = rut.replaceAll("[^0-9]",""); 
		
		if (num.length() > 8) {
		// generalmente los ruts son de 7 u 8 sin Dv, si lo excede, el codigo quitara el ultimo digito y lo calculara de nuevo
			this.Rut = num.substring(0, num.length() - 1);
		} else {
			this.Rut = num;
		}
	}
	
	public char computeDv() {
		
		int sum = 0;
		int j = 2;
		
		for (int i = getRut().length() - 1; i >= 0; i--) {
			int num = Character.getNumericValue(getRut().charAt(i));
			sum += num * j;
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
			return (char) ('0' + resto);
		}
	}
	
	public String getRut() {
		return Rut;
	}
	
	public String toString() {
		char verichar = computeDv();
		String verificador = "-" + Character.toString(verichar);
		String Dv = getRut() + verificador;
		return Dv;
	}
	
}
