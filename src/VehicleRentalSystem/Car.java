package VehicleRentalSystem;

public class Car extends Vehicle{
	
	public Car(String id,String brand,double pricePerHour) {
		super(id,brand,pricePerHour);
	}
	
	public double calculateRent(int hours) {
		return hours*getPricePerHour();
	}

}
