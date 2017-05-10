package foods;

public abstract class Food 
{
	private int quantity;
	
	public Food(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	protected void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
}
