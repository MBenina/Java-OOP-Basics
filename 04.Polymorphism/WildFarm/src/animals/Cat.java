package animals;

import java.text.DecimalFormat;

import foods.Food;

public class Cat extends Felime
{
	private String breed;

	public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) 
	{
		super(animalName, animalType, animalWeight, livingRegion);
		this.setBreed(breed); 
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) { 
		this.breed = breed;
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Meowwww");
		
	}
	
	@Override
	public void eatFood(Food food) 
	{
			super.setFoodEaten(food.getQuantity());
	}

	private String formatPattern = "#.################";
	DecimalFormat myFormatter = new DecimalFormat(formatPattern);
	
	@Override
	public String toString() 
	{
		return String.format("%s[%s, %s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), this.getBreed(),
				myFormatter.format(super.getAnimalWeight()), super.getLivingRegion(), super.getFoodEaten());
	}

	
	
}
