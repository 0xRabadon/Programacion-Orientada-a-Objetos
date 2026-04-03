package cl.uach.info090.actividad3;

public class Contacto {
	private String nombre;
	private String telefono;
	
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getTelefono(){
		return telefono;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTelefono(String telefono) {
        try {
            Integer.parseInt(telefono);
            this.telefono = telefono;
        } catch (NumberFormatException excepcion) {
            System.out.println("El numero telefonico no es un numero valido, solo debe contener digitos");
        }
		
	}
}
