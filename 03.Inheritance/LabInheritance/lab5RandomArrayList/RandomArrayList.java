package lab5RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList
{
	private Random rnd;
	
	public RandomArrayList() 
	{
		rnd = new Random();
	}
	public Object getRandomElement()
	{
		int index = rnd.nextInt(super.size()); //the size of the arrayList
		Object element = super.get(index);
		super.set(index, super.get(super.size() - 1)); // the last element replaces index
		super.remove(super.size() - 1); // removes the last element
		
		return element;
	}
	
}
