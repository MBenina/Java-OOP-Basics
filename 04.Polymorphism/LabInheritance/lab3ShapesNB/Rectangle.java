package lab3ShapesNB;

public class Rectangle extends Shape
{
	private Double height;
	private Double width;
	
	public Rectangle(Double height, Double width) 
	{
		this.height = height;
		this.width = width;
	}

	@Override
	public void calculatePerimeter() 
	{
		super.setPerimeter(2 * this.height + 2 * this.width);
	}

	@Override
	public void calculateArea() 
	{
		super.setArea(this.height * this.width);
	}
	
}
