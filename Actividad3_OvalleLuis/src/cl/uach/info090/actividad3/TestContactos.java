package cl.uach.info090.actividad3;

public class TestContactos {
	public static void main(String[] args) {
        LibroContactos Libro = new LibroContactos();

        Libro.agregarContacto(new Contacto("Luis", "23121234"));
        
        Libro.cargarContactos("contactos.csv");

        for (Contacto c : Libro.listarContactos()) {
            System.out.println("Nombre: " + c.getNombre() + " | Tel: " + c.getTelefono());
        }
	}
}
