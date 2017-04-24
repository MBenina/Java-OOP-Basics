package pr01.ClassPerson;
import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception 
	{
	    Class person = Person.class;
	    Field[] fields = person.getDeclaredFields();
	    System.out.println(fields.length); // prints the fields
	    
	    Person pesho = new Person();
	    pesho.setName("Pesho");
	    pesho.setAge(20);
	    
	    Person gosho = new Person();
	    gosho.setName("Gosho");
	    gosho.setAge(18);
	    
	    Person stamat = new Person();
	    stamat.setName("Stamat");
	    stamat.setAge(43);
	    
	   
	}
	   

}
