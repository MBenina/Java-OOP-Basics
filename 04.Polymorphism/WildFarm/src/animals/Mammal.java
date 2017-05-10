package animals;

import java.text.DecimalFormat;

import foods.Food;

public abstract class Mammal extends Animal
{
	private String livingRegion;
	
	public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
		super(animalName, animalType, animalWeight);
		this.setLivingRegion(livingRegion);
	}

	@Override
	public void eatFood(Food food) 
	{
		if("Vegetable".equals(food.getClass().getSimpleName()))
		{
			super.setFoodEaten(food.getQuantity());
		}
		else
		{
			throw new IllegalArgumentException(String.format("%s is not eating that type of food!", super.getAnimalType()));
		}
	}
	
	
	protected String getLivingRegion() 
	{
		return this.livingRegion;
	}
	
	protected void setLivingRegion(String livingRegion) 
	{
		this.livingRegion = livingRegion;
	}
	
	private String formatPattern = "#.################";
	DecimalFormat myFormatter = new DecimalFormat(formatPattern);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), 
				myFormatter.format(super.getAnimalWeight()), this.getLivingRegion(), super.getFoodEaten());
	}
	
}
	