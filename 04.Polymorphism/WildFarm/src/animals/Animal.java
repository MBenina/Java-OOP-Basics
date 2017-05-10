package animals;

import foods.Food;

public abstract class Animal 
{
	private String animalName;
	private String animalType;
	private double animalWeight;
	
	private int foodEaten;
	
	public Animal(String animalName, String animalType, double animalWeight) 
	{
		this.animalName = animalName;
		this.animalType = animalType;
		this.animalWeight = animalWeight;
	}
	
	protected String getAnimalName() {
		return this.animalName;
	}
	protected String getAnimalType() {
		return this.animalType;
	}
	
	protected double getAnimalWeight() {
		return animalWeight;
	}
	
	protected int getFoodEaten() {
		return foodEaten;
	}
	
	protected void setFoodEaten(int foodEaten) {
		this.foodEaten += foodEaten;
	}
	
	public abstract void makeSound();
	public abstract void eatFood(Food food);
	
	
}
