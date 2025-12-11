package VehicleRentalSystem;

public interface RentalService {
	
	void addVehicle(Vehicle vehicle);
	void showAvailableVehicles();
	Rental rentVehicle(String vehicleId,Customer customer,int hours);

}
