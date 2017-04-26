package pr04.ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		/*
		Pesho=11;Gosho=4
		Bread=10;Milk=2;
		Pesho Bread
		Gosho Milk
		Gosho Milk
		Pesho Milk
		END
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Hash table and linked list implementation of the Map interface, with predictable iteration order.
		Map<String, Person> persons = new LinkedHashMap<>(); // every person in the order of appearance
		Map<String, Product> products = new LinkedHashMap<>(); //all products that he has bought also in order of appearance
		 
		try
		{
			String[] buyingPeople = reader.readLine().split(regex ";");
			for (String buyingPerson : buyingPeople) 
			{
				String[] param = 	buyingPerson.split(regex "=");
				String name = param[0];
				double money = double.parseDouble(param[1]);
				
				Person person = new Person(name, money);
				persons.putIfAbsent(person.getName(), person); 
				//If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
			}
			
			String[] boughtProducts = reader.readLine().split(regex ";");
			for (String boughtProduct : boughtProducts) 
			{
				String[] param = boughtProduct.split(regex "=");
				String name = param[0];
				double money = double.parseDouble(param[1]);
				
				Product product = new Product(name, money);
				products.putIfAbsent(product.getName(), product); 
			}
			String command = "";
			while((command = reader.readLine())!="End")
			{
				String[] commands = command.split(regex "\\s+");
				persons.get(commands[0]).boughtProduct(products.get(commands[1])); //gets the name
			}
			
		} 
		catch (IllegalArgumentException iae) 
		{
			System.out.println(iae.getMessage());
		}
		
		if(persons.size()!= 0 && products.size() !=0)
		{
			persons.entrySet().forEach(p -> {
				List<String> productsName = new ArrayList<>();
				if(p.getValue().getProducts().iterator().hasNext())
				{
					p.getValue().getProducts().foreach(pr -> productsName.add(pr.getName));
				}
				else 
				{
					productsName.add("Nothing bought");
				}
				System.out.println(p.getKey() + "-" + String.join(", ", productsName));
			});
		}
	}
}

