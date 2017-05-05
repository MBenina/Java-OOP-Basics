package pr1.Vehicles;

public class Car extends Vehicle
{
	private Double diveCardistance;
	private Double refuelCar;

	protected Car(String vehicleName, Double fuelQuantity, Double litersPerKm) 
	{
		super(vehicleName, fuelQuantity, litersPerKm);
	}
	
	public Double getDiveCardistance()
	{
		return this.diveCardistance;
	}
	
	public Double getRefuelCar()
	{
		return this.refuelCar;
	}
	
	protected void setDiveCardistance(Double diveCardistance)
	{
		if(diveCardistance <= 0)
		{
			throw new IllegalArgumentException("Distance  must be possitive value!");
		}
		this.diveCardistance = diveCardistance;
	}
	
	protected void setRefuelCar(Double refuelCar)
	{
		if(refuelCar <= 0)
		{
			throw new IllegalArgumentException("Refueled value must be possitive!");
		}
		this.refuelCar = refuelCar;
	}
	
	@Override
	public void calFuelConsumption() {
		// TODO Auto-generated method stub
		
	}
	

}
