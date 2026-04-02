package dia18Marzo;

import java.util.ArrayList;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.id = "1234wr23";
		p1.altura = 1.75;
		p1.hijos = new ArrayList<Persona>();
		p1.hijos.add(new Persona());
		
		Persona p2 = new Persona();
		p2.id = "9876sd89";
		p2.altura = 1.60;
		p2.hijos = new ArrayList<Persona>();
		p2.hijos.add(p2);
	}

}