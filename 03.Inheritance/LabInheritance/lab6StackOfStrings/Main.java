package lab6StackOfStrings;

public class Main 
{
	public static void main()
	{
		StackOfStrings stOfStr = new StackOfStrings();
		stOfStr.push("Maggie");
		stOfStr.push("Misha");
		stOfStr.push("Masha");
		
		System.out.println(stOfStr.isEmpty());
		System.out.println(stOfStr.peek());
		
		System.out.println(stOfStr.pop());
		System.out.println(stOfStr.pop());
		System.out.println(stOfStr.pop());
		
		
		
	}
}
