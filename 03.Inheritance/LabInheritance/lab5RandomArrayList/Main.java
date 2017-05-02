package lab5RandomArrayList;

import java.util.Random;

public class Main 
{
	public static void main()
	{
		RandomArrayList ral = new RandomArrayList();
		ral.add(1);
		ral.add("Maggie");
		ral.add(2);
		ral.add(new RandomArrayList());
		
		System.out.println(ral.getRandomElement());
		System.out.println(ral.getRandomElement());
		System.out.println(ral.getRandomElement());
		System.out.println(ral.getRandomElement());
		
		
		
	}
}
