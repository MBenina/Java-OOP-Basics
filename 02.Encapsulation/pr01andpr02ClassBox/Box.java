package pr01.ClassBox;

public class Box 
{
	private double length;
	private double width;
	private double hight;
	
	public Box(double length, double width, double hight) 
	{
		this.setLength(length); 
		this.setWidth(width); 
		this.setHight(hight); 
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getHight()
	{
		return this.hight;
	}
	
	private void setLength(double length)
	{
		if(length <= 0)
		{
			throw new IllegalArgumentException("Length cannot be zero or negative.");
		}
		this.length = length;
	}
	
	
	private void setWidth(double width)
	{
		if(width <= 0)
		{
			throw new IllegalArgumentException("Width cannot be zero or negative.");
		}
		this.width = width;
	}
	
	private void setHight(double hight)
	{
		if (hight <= 0) 
		{
			throw new IllegalArgumentException("Hight cannot be zero or negative.");
		}
		this.hight = hight;
	}
	
	public double calculateSurfaceArea(double length, double width, double hight)
	{
		double surfaceArea = 2*this.length*this.width + 2*this.length*this.hight + 2*this.width*this.hight;
			
		return surfaceArea;
	}
	

	public double calculateLateralSurfaceArea(double length, double width, double hight)
	{
		double lateralSurfaceArea = 2*this.length*this.hight + 2*this.width*this.hight;
		return lateralSurfaceArea;
	}
	
	public double calculateVolume(double length, double width, double hight)
	{
		double volume = this.length*this.width*this.hight;
		return volume;
				
	}
	
	
}
