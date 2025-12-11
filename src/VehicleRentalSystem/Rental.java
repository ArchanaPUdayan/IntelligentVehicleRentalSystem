package VehicleRentalSystem;

public class Rental {
	
	private Vehicle vehicle;
	private Customer customer;
	private int rentalHours;
	public Rental(Vehicle vehicle, Customer customer, int rentalHours) {
		super();
		this.vehicle = vehicle;
		this.customer = customer;
		this.rentalHours = rentalHours;
	}
	
	
	
	public Rental() {
		super();
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public int getRentalHours() {
		return rentalHours;
	}



	public void setRentalHours(int rentalHours) {
		this.rentalHours = rentalHours;
	}



	public double getTotalAmount() {
		return vehicle.calculateRent(rentalHours);
	}
	
	@Override
	public String toString() {
		return "Customer:"+customer.getName()+
				"\nVehicle: "+vehicle.getBrand()+
				"\nHours: "+rentalHours+
				"\nTotal Rent: ₹" + getTotalAmount();
	}

}
