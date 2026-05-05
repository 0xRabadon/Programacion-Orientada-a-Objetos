package cl.uach.info090.OvalleLuisAct4;

public class PlantaSolar extends PlantaEnergetica implements EnergiaLimpia{
	
	private boolean zeroEmision;
	
	public PlantaSolar(double mw,boolean zeroEmision) {
		super(mw);
		this.zeroEmision = zeroEmision;
		}
	
	@Override
	public double bonosCarbono() {
		double carbono = this.getMw()/10;
		return carbono;
	}
	
	@Override
	public boolean esZeroEmision() {
		return zeroEmision;
	}
	
}
