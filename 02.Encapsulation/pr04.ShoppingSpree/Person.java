package pr04.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person 
{
	private String name;
	private double money;
	private List<Product> products;
	
	public Person(String name, double money) 
	{
		this.setName(name);
		this.setMoney(money);
		this.products = new ArrayList<>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Iterable<Product> getProducts() 
	{
		return this.products;
	}
	
	public double getMoney()
	{
		return this.money;
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
	
	private void setMoney(double money)
	{
		if(money < 0)
		{
			throw new IllegalArgumentException("Money cannot be negative");	
		}
		this.money = money;
	}

	//Buy Products
	public void boughtProduct(Product product) 
	{
		if(this.money - product.getPrice() <0)
		{
			throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
		}
		this.money -= product.getPrice();
		this.products.add(product);
		
		//prints the products
		this.printSuccessfullyBought(product);
	}
	
	private void printSuccessfullyBought(Product product)
	{
		System.out.println(this.name + "bought" + this.getName());
	}
	

}
	
	
