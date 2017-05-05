package pr1.Vehicles;

public class Truck extends Vehicle
{

	protected Truck(Double fuelQuantity, Double fuelConsumptionPerKm)
	{
		super(fuelQuantity, fuelConsumptionPerKm);
	}

	@Override
	public void driveDistance(Double distance) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void refuel(Double fuelQuantity) 
	{
		Double fuelConsumption = super.getFuelConsumptionPerKm();
		double fuelToTravellDistance = distance * fuelConsumption;
		
        if (fuelToTravellDistance > fuelQuantity)
        {
            throw new InvalidOperationException("Truck needs refueling");
        }
        fuelQuantity -= fuelToTravellDistance;

	}



}
