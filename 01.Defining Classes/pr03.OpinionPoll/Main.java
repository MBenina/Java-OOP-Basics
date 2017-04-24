package pr03.OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<Person> persons = new ArrayList<>();
		
		int lines = Integer.parseInt(input.readLine());
		for (int i = 0; i < lines; i++) 
		{
			String[] param = input.readLine().split("\\s+");
			persons.add(new Person(param[0], Integer.parseInt(param[1]))); 
		}
		
		//HashMap<String, Integer> personsOverThirty = new HashMap<>();
		List<Person> personsOverThirty = new ArrayList<>(); 
		
		for (int i = 0; i < persons.size(); i++) 
		{
			if(persons.get(i).getAge() > 30)
			{
				personsOverThirty.add(new Person(persons.get(i).getName(), persons.get(i).getAge()));
			}
		}
		
		Collections.sort(personsOverThirty, (p1, p2) -> Double.compare(p2.getName().charAt(0),p1.getName().charAt(0)));
		
		System.out.println("The people whose age is more than 30 years: ");
		for (int i = 0; i <personsOverThirty.size(); i++) 
		{
			Person currPerson = personsOverThirty.get(i);
			System.out.println(currPerson);
			
		}
		
	}

}
