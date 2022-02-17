
public class CarSpec extends RacingCar implements ICarSpec {
	
	
	public CarSpec(int topRacingSpeed, int topNormalSpeed, String make, String model, String year,
			double fuelCapacity) {
		super(topRacingSpeed, topNormalSpeed, make, model, year, fuelCapacity);
	}

	@Override
	public int getMaxSpeed() {
		return getTopSpeedRacingMode() >=  getTopSpeedNormalMode() ? getTopSpeedRacingMode() : getTopSpeedNormalMode() ;
	}

	@Override
	public String getfullCarname() {
		return getYear() + " " + getMake() + " " + getModel();
	}

	@Override
	public double getCarFuelCap() {
		return getCarFuelCapacity();
	}

}
