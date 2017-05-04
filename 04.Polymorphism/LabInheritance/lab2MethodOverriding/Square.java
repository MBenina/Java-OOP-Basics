package lab2MethodOverriding;

public class Square extends Rectangle
{

	public Square(Double side) 
	{
		super(side);
	}
	
	@Override
	public Double calculatePerimeter()
	{
		return this.getSideA() * 4;
	}
	
	@Override
	public Double calculateArea()
	{
		return this.getSideA() * this.getSideA();
	}

}
