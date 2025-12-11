package VehicleRentalSystem;

import java.util.HashMap;
import java.util.Map;

public class RentalServiceImpl implements RentalService{
	
	private Map<String,Vehicle> vehicles = new HashMap<>();

	@Override
	public void addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicles.put(vehicle.getVehicleId(), vehicle);
		
	}

	@Override
	public void showAvailableVehicles() {
		// TODO Auto-generated method stub
		vehicles.values().stream().filter(Vehicle::isAvailable)
		.forEach(System.out::println);
		
	}

	@Override
	public Rental rentVehicle(String id, Customer customer, int hours) {
		// TODO Auto-generated method stub
		Vehicle v=vehicles.get(id);
		if(v!=null && v.isAvailable()) {
			v.setAvailable(false);  //mark it as rented.
			return new Rental(v,customer,hours); //create a rental record
		}
		System.out.println("Vehile not available!");
		return null;
	}

}
