package pr1.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import lab3ShapesNB.Shape;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		List<Vehicle> vehicles = new ArrayList<>();
		try 
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			String[] carParam = input.readLine().split("\\s+");
			String car = carParam[0];
			double  fuelQuantity =  Double.parseDouble(carParam[1]);
			double litersPerKm = Double.parseDouble(carParam[2]);
			vehicles.add(new Car(car, fuelQuantity, litersPerKm));
			
			String[] truckParam = input.readLine().split("\\s+");
			String truck  = truckParam[0];
			double  fuelQuantitytr =  Double.parseDouble(carParam[1]);
			double litersPerKmtr = Double.parseDouble(carParam[2]);
			vehicles.add(new Truck(truck, fuelQuantitytr, litersPerKmtr)); 

			BufferedReader commandsN  = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(commandsN.readLine());
		
			for (int i = 0; i < n; i++) 
			{
				String[] inputDriveRefuel = commandsN.readLine().split("\\s+");
				if(inputDriveRefuel[0] == "Drive")
				{
					if(inputDriveRefuel[1] == "Car")
					{
						
					}else
					{
						
					}
				}
			}
		} 
		catch (IllegalArgumentException error) 
		{
			System.out.println(error.getMessage());
		}
	}

}
