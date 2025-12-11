package VehicleRentalSystem;

public class Main {
	public static void main(String[] args) {
		
		RentalService service = new RentalServiceImpl();
		
		service.addVehicle(new Car("C1","BMW",500));
		service.addVehicle(new Car("C2","Audi",450));
		service.addVehicle(new Bike("B1","Yamaha",150));
		
		System.out.println("Available Vehicles :");
		service.showAvailableVehicles();
		
		Customer c1=new Customer("CU1","Archana");
		
		Rental rental = service.rentVehicle("C1", c1, 5);
		System.out.println("\n --- Rental Bill ---");
		System.out.println(rental);
		
	}

}
