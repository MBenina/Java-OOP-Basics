package pr02.CreatingConstructors;

public class Person 
{
	static final String DEFFAULT_NAME = "No name";
	
	String name;
	int age;
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	Person(int age)
	{
		this(DEFFAULT_NAME, age);
	}
	
	public Person() 
	{
		this(DEFFAULT_NAME, 1);
	}
}
