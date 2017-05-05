package lab2MethodOverriding;

public class Rectangle 
{

	private Double sideA;
	private Double sideB;
	
	public Rectangle(Double sideA)
	{
		this.setSideA(sideA);
	}
	
	public Rectangle(Double sideA, Double sideB) 
	{
		this.setSideA(sideA);
		this.setSideB(sideB);
	}
	
	public Double getSideA()
	{
		return this.sideA;
	}
	
	protected void setSideA(Double sideA)
	{
		this.sideA = sideA;
	}
	
	public Double getSideB()
	{
		return this.sideB;
	}
	
	protected void setSideB(Double sideB)
	{
		this.sideB = sideB;
	}
	
	public Double calculatePerimeter()
	{
		return this.sideA * 2 + this.sideB * 2;
	}
	
	public Double calculateArea() 
	{
		return this.sideA * this.sideB;
	}

}
