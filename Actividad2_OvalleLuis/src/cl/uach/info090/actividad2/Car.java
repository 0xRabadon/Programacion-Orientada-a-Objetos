package cl.uach.info090.actividad2;

public class Car {
	private double milesPerGallon; // rendimiento de millas por galon
	private double tankCapacity;  // capacidad el estanque
	private double mileage; // kilometraje (millaje)
	private double gas;  // bencina de la 93 a $1555 DDD:
	
	public Car(double milesPerGallon, double tankCapacity) {
		this.milesPerGallon = milesPerGallon;
		this.tankCapacity = tankCapacity;
		this.mileage = 0.0; // suponiendo que es un auto nuevo
		this.gas = 0.0; // suponiendo que tiene el estanque vacio
	}
	
	public void drive(double miles) {
		if (miles <= 0) {
			System.out.println("Error, un auto no puede andar 0 millas o millas negativas");
		}
		
		double maxMillas = this.gas * this.milesPerGallon; // Calculo de cuanto se puede andar con lo que hay en el estanque
		
		if (miles <= maxMillas) {
			this.mileage = this.mileage + miles;
			this.gas -= (miles / this.milesPerGallon);
		}
		else //caso en que se recorran más millas que lo que hay de bencina
		{
			this.mileage += maxMillas;
			this.gas = 0.0;
			System.out.println("Sin bencina. Solo recorriste " + maxMillas + "millas.");
		}
		
	}
	
	public void putGas(double gallons) {
		if (gallons <= 0) return;
		
		if (this.gas + gallons > this.tankCapacity) { //si se echa mas bencina al estanque arroja error
			System.out.println("Error, no puedes echarle más al estanque, es peligroso :c");
		}
		else
		{
			this.gas += gallons;
		}
	}
	
	public double GetMilesPerGallon() {
		return milesPerGallon;
	}
	public double getTankCapacity() {
		return tankCapacity;
	}
	public double getMileage() {
		return mileage;
	}
	public double getGas() {
		return gas;
	}
}