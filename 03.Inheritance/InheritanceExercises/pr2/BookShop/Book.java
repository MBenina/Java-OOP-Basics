package pr2.BookShop;

public class Book 
{
	protected String title;
	protected String author;
	protected double price;
	
	public Book(String author, String title, double price) 
	{    
	    this.setAuthor(author);
	    this.setTitle(title);
	    this.setPrice(price);
	}

	
	public String getAuthor()
	{
		return this.author;
	}
	
	protected void setAuthor(String author)
	{
		String[] authorFullname = author.split("\\s+");
		String lastName = authorFullname[1];
		if(lastName.contains("[0-9]"))
		{
			throw new IllegalArgumentException("Author not valid!");
		}
		
		this.author = author;
	}
	
	public String getTitle() 
	{
	    return this.title;
	}
	
	protected void setTitle(String title) {
	    if (title.length() < 3) 
	    {
	        throw new IllegalArgumentException("Title not valid!");
	        //return;
	    }

	    this.title = title;
	}
	
	public double getPrice() 
	{
	    return this.price;
	}

	private void setPrice(double price) 
	{
	    if (price < 1) 
	    {
	        throw new IllegalArgumentException("Price not valid!");
	        //return;
	    }

	    this.price = price;
	}

	@Override
	public String toString() {
	    final StringBuilder sb = new StringBuilder();
	    sb.append("Type: ").append(this.getClass().getSimpleName())
	            .append(System.lineSeparator())
	            .append("Title: ").append(this.getTitle())
	            .append(System.lineSeparator())
	            .append("Author: ").append(this.getAuthor())
	            .append(System.lineSeparator())
	            .append("Price: ").append(this.getPrice())
	            .append(System.lineSeparator());
	    return sb.toString();
	}

}
