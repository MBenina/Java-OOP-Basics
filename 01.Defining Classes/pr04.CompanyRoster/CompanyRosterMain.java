package pr04.CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CompanyRosterMain {
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Double> departmentsSalary = new HashMap<>();
		HashMap<String,TreeSet<Employee>> departmentsEmployees = new HashMap<>();
		
		int n = Integer.valueOf(reader.readLine());
		for (int i = 0; i < n; i++) 
		{
			String[] params = reader.readLine().split("\\s+");
			String name = params[0];
			Double salary = Double.valueOf(params[1]);
			String position = params[2];
			String department = params[3];
			Employee employee = null;
			if (params.length ==4) 
			{
				employee = new Employee(name, salary, position, department);
			}
			else if(params.length ==5)
			{
				if(isNumber(params[4]))
				{
					int age = Integer.valueOf(params[4]);
					employee = new Employee(name, salary, position, department, age);
				}
				else
				{
					String email = params[4];
					employee = new Employee(name, salary, position, department, email);
				}
			}else 
			{
				int age = Integer.parseInt(params[5]);
				String email = params[4];
				employee = new Employee(name, salary, position, department, email, age);
			}
			if (!departmentsEmployees.containsKey(department)) 
			{
				departmentsEmployees.put(department, new TreeSet<>());
				departmentsSalary.put(department, 0.0);
			}
			departmentsEmployees.get(department).add(employee);
			departmentsSalary.put(department, departmentsSalary.get(department) + salary);
			
			
		}
		
		Map.Entry<String, TreeSet<Employee>> best = departmentsEmployees.entrySet().stream().sorted((emp1, emp2) -> 
				Double.compare(departmentsSalary.get(emp2.getKey()), departmentsSalary.get(emp1.getKey()))).
				findFirst().get();
		
	}
	private static boolean isNumber(String param)	
	{	
		try 
		{
			Integer.parseInt(param);
			return true;
		} catch (NumberFormatException exception) {
			return false;
		}
	}

}
