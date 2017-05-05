package pr1.Vehicles;

public abstract class Vehicle 
{
	private String vehicleName;
	private Double fuelQuantity;
	private Double litersPerKm;
		
	protected Vehicle(String vehicleName, Double fuelQuantity, Double litersPerKm) {
		this.setVehicleName(vehicleName);
		this.setFuelQuantity(fuelQuantity);
		this.setLitersPerKm(litersPerKm);
	}

	public String getVehicleName()
	{
		return this.vehicleName;
	}
	
	public Double getFuelQuantity()
	{
		return this.fuelQuantity;
	}
	
	public Double getLitersPerKm()
	{
		return this.litersPerKm;
	}
	
	
	protected void setVehicleName(String vehicleName)
	{
		if(vehicleName == "")
		{
			throw new IllegalArgumentException("name cannot be empty");
		}
		this.vehicleName = vehicleName;
	}
	
	protected void setFuelQuantity(Double fuelQuantity)
	{
		if(fuelQuantity <= 0)
		{
			throw new IllegalArgumentException("Fuel quantity must be possitive value!");
		}
		this.fuelQuantity = fuelQuantity;
	}
	
	protected void setLitersPerKm(Double litersPerKm)
	{
		if(litersPerKm <= 0)
		{
			throw new IllegalArgumentException("Fuel consumption must be possitive value!");
		}
		this.litersPerKm = litersPerKm;
	}
	
	
	public abstract void calFuelConsumption();
	
}
