package pr3.Mainkind;

public class Student extends Human
{
	private int facultyNumber;
	
	public Student(String firstName, String lastName, int facultyNumber) 
	{
		super(firstName, lastName);
		this.setFacultyNumber(facultyNumber);		
	}
	
	public int getFacultyNumber()
	{
		return this.facultyNumber;
	}
	
	private void setFacultyNumber(int facultyNumber)
	{
		if(facultyNumber < 5 || facultyNumber >10 )
		{
			throw new IllegalArgumentException("Invalid faculty number");
		}
		this.facultyNumber = facultyNumber;
	}
	
	@Override
	public String toString() 
	{
		final StringBuilder sb = new StringBuilder();		
		sb.append("First Name: ").append(this.getFirstName())
        .append(System.lineSeparator())
        .append("Last Name: ").append(this.getLastName())
        .append(System.lineSeparator())
        .append("Faculty number: ").append(this.getFacultyNumber());
		return sb.toString();
	}
	
	
}
