package cl.uach.info090.actividad3;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LibroContactos {
	private ArrayList<Contacto> contactos;
	
	public LibroContactos() {
		this.contactos = new ArrayList<>();
	}
	public ArrayList<Contacto> buscarContacto(String nombre) {
	    ArrayList<Contacto> encontrados = new ArrayList<>();
	    for (Contacto c : contactos) {
	        if (c.getNombre().equalsIgnoreCase(nombre)) {
	            encontrados.add(c);
	        }
	    }
	    return encontrados;
	}
	public void agregarContacto(Contacto nuevoContacto) {
           this.contactos.add(nuevoContacto);
		}

	public void eliminarContacto(Contacto contacto) {
		this.contactos.remove(contacto);
	}
	public List<Contacto> listarContactos() {
		return this.contactos;
		
	}
	public void cargarContactos(String archivos) {
		String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(archivos))) {
        	br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    String telefono = partes[1].trim();
                    this.agregarContacto(new Contacto(nombre, telefono));
                }
            }
            System.out.println("Carga de archivos completada.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
	}
}


