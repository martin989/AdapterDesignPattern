
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 ICarSpec iCarSpec = new CarSpec(100, 110, "GMC", "Acadia", "2022", 10.2);  
		 System.out.println("Top speed is " + iCarSpec.getMaxSpeed() + " MPH");  
		 System.out.println("This is a " + iCarSpec.getfullCarname());  
		 System.out.println("This car holds " + iCarSpec.getCarFuelCap() + " gallons of fuel.");  
	}

}
