package VehicleRentalSystem;

public abstract class Vehicle {
	private String vehicleId;
	private String brand;
	private double pricePerHour;
	private boolean isAvailable=true;
	
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	
	public void setAvailable(boolean Available) {
		this.isAvailable = Available;
	}
	
	public Vehicle(String vehicleId, String brand, double pricePerHour) {
		super();
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.pricePerHour = pricePerHour;
		
	}
	
	public abstract double calculateRent(int hours);
	
	@Override
    public String toString() {
        return vehicleId + " - " + brand + " - " + pricePerHour + "/hour - " +
                (isAvailable ? "Available" : "Not Available");
    }
	
	
	public Vehicle() {
		super();
	}
	
	
	
	

}
