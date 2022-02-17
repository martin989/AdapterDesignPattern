
public class RacingCar {
	private int topRacingSpeed;
	private int topNormalSpeed;
	private String make;
	private String model;
	private String year;
	private double fuelCapacity;
	
	
	public RacingCar(int topRacingSpeed, int topNormalSpeed, String make, String model, String year, double fuelCapacity) {
		this.topRacingSpeed = topRacingSpeed;
		this.topNormalSpeed = topNormalSpeed;
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelCapacity = fuelCapacity;
	}

	public int getTopSpeedRacingMode() {
		return topRacingSpeed;
	}

	public int getTopSpeedNormalMode(){
		return topNormalSpeed;
	}


	public String getMake(){
		return make;
	}


	public String getModel(){
		return model;
	}


	public String getYear(){
		return year;
	}


	public double getCarFuelCapacity(){
		return fuelCapacity;
	}

}
