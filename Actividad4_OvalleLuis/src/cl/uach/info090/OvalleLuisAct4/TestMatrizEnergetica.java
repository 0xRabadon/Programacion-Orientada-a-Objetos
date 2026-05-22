package cl.uach.info090.OvalleLuisAct4;

import java.util.ArrayList;

public class TestMatrizEnergetica {
	public static String reporte(ArrayList<MatrizEnergetica> matriz) {
		String resultado = "";
	    
	    for (int i = 0; i < matriz.size(); i++) {
	        MatrizEnergetica m = matriz.get(i);
	        
	        double total = m.totalMw();
	        double limpios = m.mwLimpios();
	        double bonos = m.bonosCarbono();
	        
	        double porcentaje = 0;
	        if (total > 0) {
	            porcentaje = (limpios / total) * 100;
	        }
	        resultado += "matriz energética " + (i + 1) + ", ";
	        resultado += total + " MW, ";
	        resultado += porcentaje+ "% energías limpias; ";
	        resultado += bonos + " bonos de carbono\n";
	    }
	    return resultado;
    }
	public static void main(String[] args) {
        ArrayList<MatrizEnergetica> lista = new ArrayList<>();
        MatrizEnergetica m1 = new MatrizEnergetica();
        m1.agregarPlanta(new PlantaCarbon(53.4));
        m1.agregarPlanta(new PlantaSolar(46.0, false));
        lista.add(m1);
        
        MatrizEnergetica m2 = new MatrizEnergetica();
        m2.agregarPlanta(new PlantaEolica(24.2, true));
        m2.agregarPlanta(new PlantaEolica(36.1, false));
        m2.agregarPlanta(new PlantaSolar(145.9, true));
        lista.add(m2);
        
        MatrizEnergetica m3 = new MatrizEnergetica();
        m3.agregarPlanta(new PlantaCarbon(345.4));
        m3.agregarPlanta(new PlantaCarbon(666.3));
        m3.agregarPlanta(new PlantaCarbon(1.0));
        lista.add(m3);
        
        System.out.println(reporte(lista));
	}
}