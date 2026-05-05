package cl.uach.info090.OvalleLuisAct4;

public class PlantaEolica extends PlantaEnergetica implements EnergiaLimpia {
	private boolean zeroEmision;
	
	public PlantaEolica(double mw,boolean zeroEmision) {
		super(mw);
		this.zeroEmision = zeroEmision;
		}
	
	@Override
	public double bonosCarbono() {
		double carbono = this.getMw()/20;
		return carbono;
	}
	
	@Override
	public boolean esZeroEmision() {
		return zeroEmision;
	}
}
