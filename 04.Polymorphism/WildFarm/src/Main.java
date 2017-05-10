import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.Cat;
import animals.Mouse;
import animals.Tiger;
import animals.Zebra;
import foods.Food;
import foods.Meat;
import foods.Vegetable;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		List<Animal> newAnimal = new ArrayList<>();
		List<Food> food = new ArrayList<>();
		
		int countRolls = 0;
		//while (!"End".equals(line)) 
		while(!line.equals("End"))
		{
			
				countRolls++;
				if(countRolls % 2 != 0)
				{
					//  checks if odd!
					String[] animalProp = line.split("\\s+"); 
					String type = animalProp[0];
					String animalName = animalProp[1];
					Double animalWeight = Double.parseDouble(animalProp[2]);
					String livingRegion = animalProp[3];
			
					switch (type) 
					{
					case "Cat": 
						String catBreed = animalProp[4];
						newAnimal.add(new Cat(animalName, type, animalWeight, livingRegion, catBreed));
						break;
					case "Mouse":
						newAnimal.add(new Mouse(animalName, type, animalWeight, livingRegion));
						break;
					case "Zebra":
						newAnimal.add(new Zebra(animalName, type, animalWeight, livingRegion));
					case "Tiger":
						newAnimal.add(new Tiger(animalName, type, animalWeight, livingRegion));
					default:
						System.out.println("The input must be an animal");
					}
				} 
				else
				{
					//checks if even
					String[] foodData = line.split("\\s+");
					String foodType = foodData[0];
					int quantity = Integer.parseInt(foodData[1]);
					
					switch (foodType) 
					{
					case "Vegetable":
						food.add(new Vegetable(quantity));
						break;
					case "Meat":
						food.add(new Meat(quantity));
					default:
						System.out.println("This is not a food!");
					}
				}
				
				((Animal) newAnimal).makeSound();
			((Animal) newAnimal).eatFood((Food) food);
			System.out.println(newAnimal);

			
		
		}
		
	}

}
