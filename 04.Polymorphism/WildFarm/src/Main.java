//package animals;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
		String line = "";
 /*
		FileReader fr = new FileReader("input.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = null;
*/
		//List<Animal> newAnimalList = new ArrayList<>();
		//List<Food> foodList = new ArrayList<>();
		//Map<Animal, Food> animalsMap = new TreeMap<Animal, Food>();

		int countRolls = 0;
		Animal animal = null;
		Food food = null;
		
		while((line = br.readLine()) != null &&  !line.equals("End"))
		{
				countRolls++;
				if(countRolls % 2 != 0)
				{
					//  checks if odd!
					String[] animalProp = line.split("\\s+");
					System.out.println(animalProp.length);
					System.out.println(animalProp[0]);
					String type = animalProp[0];
					String animalName = animalProp[1];
					Double animalWeight = Double.parseDouble(animalProp[2]);
					String livingRegion = animalProp[3];

					switch (type)
					{
					case "Cat":
						String catBreed = animalProp[4];
						//newAnimalList.add(new Cat(animalName, type, animalWeight, livingRegion, catBreed));
						animal = new Cat(animalName, type, animalWeight, livingRegion, catBreed);
						break;
					case "Mouse":
						//newAnimalList.add(new Mouse(animalName, type, animalWeight, livingRegion));
						animal = new Mouse(animalName, type, animalWeight, livingRegion);
						break;
					case "Zebra":
						//newAnimalList.add(new Zebra(animalName, type, animalWeight, livingRegion));
						animal = new Zebra(animalName, type, animalWeight, livingRegion);
						break;
					case "Tiger":
						//newAnimalList.add(new Tiger(animalName, type, animalWeight, livingRegion));
						animal = new Tiger(animalName, type, animalWeight, livingRegion);
						break;
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
						food = new Vegetable(quantity);
						break;
					case "Meat":
						food = new Meat(quantity);
						break;
					default:
						System.out.println("This is not a food!");
					}
				}

				//animalsMap.put(animal, food);
		}
		animal.makeSound();
		animal.eatFood(food);
		System.out.println(animal);
//		for (Animal animal : animalsMap)
//		{
//
//			animal.makeSound();
//
//			Food food = (Food) foodList.get(0);
//
//			animal.eatFood(food);
//
//			System.out.println(animal);
//		}
//
//		for(Map.Entry<Animal, Food> animalsMap.)
//
//	
//
//		if (bf != null)
//		{
//		bf.close();
//		}

	}

}
