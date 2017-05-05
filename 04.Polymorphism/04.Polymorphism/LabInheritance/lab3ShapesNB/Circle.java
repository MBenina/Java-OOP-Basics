package lab3ShapesNB;

public class Circle extends Shape
{
	private Double radius;
	
	public Circle(Double radius)  
	{
		this.radius = radius;
		this.calculateArea();
		this.calculatePerimeter();
	}

	@Override
	public void calculatePerimeter() 
	{
		super.setPerimeter(this.radius * 3.14 * 2);
	}

	@Override
	public void calculateArea() 
	{
		super.setArea(this.radius * this.radius * 3.14); 
	}
}
