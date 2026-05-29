package herencia_ej1;

public class Estudiante extends Persona{
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal ) {
		super(nombre,apellidos,edad); //inicializa lo que ya esta hecho en Persona
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("Edad: " + getEdad());
		System.out.println("Codigo estudiante: " + codigoEstudiante);
		System.out.println("Nota Final: " + notaFinal);
	}
}
