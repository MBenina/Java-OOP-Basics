package pr3.Mainkind;

public class Worker extends Human
{
	private double weekSalary; 
	private int workHoursPerDay;
	
	public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay ) 
	{
		super(firstName, lastName);
		this.setWeekSalary(weekSalary);
		this.setWorkHoursPerDay(workHoursPerDay);
	}
	
	public double getWeekSalary()
	{
		return this.weekSalary;
	}
	
	private void setWeekSalary(double weekSalary)
	{
		this.weekSalary = weekSalary;
	}
	
	public double getWorkHoursPerDay()
	{
		return this.workHoursPerDay;
	}
	
	private void setWorkHoursPerDay(int workHoursPerDay)
	{
		this.workHoursPerDay = workHoursPerDay;
	}
	
	public double calculateSalaryPerHour(double weekSalary, int workHoursPerDay)
	{
		double salaryPerHour = weekSalary / workHoursPerDay;
		
		return salaryPerHour;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();		
		sb.append("First Name: ").append(this.getFirstName())
        .append(System.lineSeparator())
        .append("Last Name: ").append(this.getLastName())
        .append(System.lineSeparator())
        .append("Week Salary: ").append(this.getWeekSalary())
        .append(System.lineSeparator())
		.append("Hours per day: ").append(this.getWorkHoursPerDay())
		.append(System.lineSeparator())
		.append("Salary per hour: ").append(this.getWorkHoursPerDay())
		.append(System.lineSeparator());
return sb.toString();
	}

	
}
