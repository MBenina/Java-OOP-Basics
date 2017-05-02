package pr3.Mainkind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main() throws IOException
	{
		try
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));	
			int lines = Integer.parseInt(input.readLine());
			if(lines == 1)
			{
				String[] studentParam = input.readLine().split("\\s+");
				String firstName = studentParam[0];
				String lastName = studentParam[1];
				int facultyNumber = Integer.valueOf(studentParam[2]);
				
				Student student = new Student(firstName, lastName, facultyNumber);
				System.out.println(student.toString());
			}else
			{
				String[] workersParam = input.readLine().split("\\s+");
				String firstName = workersParam[0];
				String lastName = workersParam[1];
				Double weekSalary = Double.valueOf(workersParam[2]);
				int workHoursPerDay = Integer.valueOf(workersParam[3]);
				
				Worker worker = new Worker(firstName, lastName, weekSalary, workHoursPerDay);
				worker.calculateSalaryPerHour(weekSalary, workHoursPerDay);
				System.out.println(worker.toString());
			}
		}
		catch(IllegalArgumentException error) 
		{
	        System.out.println(error.getMessage());
	    }
		
			
		 
		
	}

}
