package tonteras_para_practicar_clases;

public class AutoTest {

	public static void main(String[] args) {
		Auto miAuto = new Auto(); // declaramos nuestro primer auto un kia azul
		
		miAuto.kilometraje = 0.0;
		miAuto.patente = "ABC123";
		miAuto.color = "azul";
		miAuto.marca = "kia";
		
		Auto otroAuto = new Auto(); // declaramos otro auto un toyota blanco y negro
		
		otroAuto.kilometraje = 313123.231313131;
		otroAuto.patente = "AE86";
		otroAuto.marca = "Toyota";
		otroAuto.color = "panda";
		
		miAuto.selMarca("nissan");
		String marca1;
		
	}

}
