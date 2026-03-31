package dia18Marzo;

import java.util.ArrayList;

public class Persona {
	public String id;  //El private hace que la variable solo se vea en la clase donde esta definida, osea no es publica
	public double altura;
	public ArrayList<Persona> hijos;
	
	public Persona(String id) {
		setId(id);
		
	}
	
	void crecer(double valor){
		if (valor >= 0 && valor <= 2) {
			altura += valor;
		}
	}
	 public String getId() {
		 return id;
	 }
	 private void setId(String id) {
		 if (id != null && id.length()>0)
			 this.id =id;
		 else this.id = "UNKNOWN";
	 }
	
	 public double getAltura() {
		 return altura;
	 }
}
