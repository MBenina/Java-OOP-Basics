package lab2MethodOverriding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		List<Rectangle> listOfRectangles = new ArrayList<>();
		
		for (int i = 0; i < n; i++) 
		{
			String[] input = reader.readLine().split( " ");
			if(input.length == 1)
			{
				listOfRectangles.add(new Square(Double.parseDouble(input[0])));
			}
			else
			{ 
				listOfRectangles.add(new Rectangle(Double.parseDouble(input[0]), 
						Double.parseDouble(input[1])));
			}
		}
		
		for (Rectangle rectangle : listOfRectangles) 
		{
			System.out.println(rectangle.calculateArea());
			System.out.println(rectangle.calculatePerimeter());
		}
		
		/*Rectangle rect = new Rectangle(5.00, 3.00);
		Square sqare = new Square(4.00);
		
		Rectangle rectangle = new Square(8.00);
		
		System.out.println(rectangle.calculatePerimeter());
		System.out.println(sqare.calculateArea()); */	
	}

}
