package lab6StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings 
{
	private List<String> data;
	
	public StackOfStrings() 
	{	
		this.data = new ArrayList<>();
	}
	
	public boolean isEmpty()
	{
		return this.data.isEmpty();
	}
	
	public void push(String item) //adds an element
	{
		this.data.add(item);
	}
	
	public String pop() //removes the last element
	{
		return this.data.remove(this.data.size() - 1);
	}
	
	public String peek() // 
	{
		return this.data.get(this.data.size() - 1);
	}
}
