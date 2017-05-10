package animals;

import foods.Food;

public class Tiger extends Felime
{

	public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) 
	{
		super(animalName, animalType, animalWeight, livingRegion);
		
		this.makeSound();
	}

	@Override
	public void makeSound()
	{
		System.out.println("ROAAR!!!");
	}

	@Override
	public void eatFood(Food food) 
	{
		if("Meat".equals(food.getClass().getSimpleName()))
		{
			super.setFoodEaten(food.getQuantity());
		}
		else
		{
			throw new IllegalArgumentException(String.format("%s is not eating that type of food!", super.getAnimalType()));
		}
	}


}
