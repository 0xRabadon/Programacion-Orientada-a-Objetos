package cl.uach.info090.OvalleLuisAct4;

import java.util.ArrayList;
import java.util.List;

public class MatrizEnergetica {
	private List<PlantaEnergetica> plantas;
	public MatrizEnergetica() {
        this.plantas = new ArrayList<>();
    }

    public void agregarPlanta(PlantaEnergetica planta) {
        this.plantas.add(planta);
    }
	
	public double totalMw() {
		double total = 0;
		for (PlantaEnergetica p : plantas) {
			total += p.getMw();
		}
		return total;
	}
	public double mwLimpios() {
		double totalLimp = 0;
		for (PlantaEnergetica p: plantas) {
			if (p instanceof EnergiaLimpia) {
				totalLimp += p.getMw();
			}
		}
		return totalLimp;
	}
	public double bonosCarbono() {
		double carbono = 0;
		for (PlantaEnergetica p: plantas) {
			if ((p instanceof EnergiaLimpia)) {
				EnergiaLimpia limpia = (EnergiaLimpia) p;
		        carbono += limpia.bonosCarbono();
			}
		}
		return carbono;
	}
}
