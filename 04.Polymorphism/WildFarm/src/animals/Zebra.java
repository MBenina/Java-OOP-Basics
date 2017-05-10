package animals;

import foods.Food;

public class Zebra extends Mammal
{

	public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
		super(animalName, animalType, animalWeight, livingRegion);
		
		this.makeSound();
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Zs");
		
	}

	public void eatFood(Food food) 
	{
		// Proverka! kak da vzema imeto na hranata?
		//if("Vegetable")
		//{	
				super.setFoodEaten(food.getQuantity());
		//}
		//else//throw new IllegalArgumentException(String.format("%s are not eating that type of food!", super.getAnimalType())
	}

	
}
