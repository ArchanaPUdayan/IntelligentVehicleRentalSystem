package VehicleRentalSystem;

public class Bike extends Vehicle{
	
	public Bike(String id,String brand,double pricePerHour) {
		super(id,brand,pricePerHour);
		
	}

	@Override
	public double calculateRent(int hours) {
		// TODO Auto-generated method stub
		return hours * getPricePerHour();
	}

}
