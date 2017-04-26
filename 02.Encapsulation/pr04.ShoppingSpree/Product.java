package pr04.ShoppingSpree;


public class Product 
{
	private String name;
	private double price;
	
	public Product(String name, double price) 
	{
		this.setName(name);
		this.setPrice(price);
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	private void setName(String name)
	{
		// checks if an empty string and the length after removing the white spaces
		if(name == null || name.trim().length() == 0)
		{
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}
	
	private void setPrice(double price)
	{
		if(price < 0)
		{
			throw new IllegalArgumentException("Money cannot be negative");	
		}
		this.price = price;
	}
	
}
