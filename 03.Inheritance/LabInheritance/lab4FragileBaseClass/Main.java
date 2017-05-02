package lab4FragileBaseClass;

public class Main 
{
	public static void main() {
		
		Animal animal =new Animal();
		animal.eatAll(new Food[] {new Food(), new Food()});
		animal.eat(new Food());
		
		Predator predator = new Predator();
		predator.feedAll(new Food[] {new Food(), new Food()});
		predator.feed(new Food());
		System.out.println(); 

	}
}
 