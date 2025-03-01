package Day15_MethodOverLoading_Super_ThisKeywords;

public class Animal {

	String color="white";
	
	void eat()
	{
		System.out.println("eating....");
	}
	
	Animal()
	{
		System.out.println("This is Animal..");
	}
	
	Animal(String name)
	{
		System.out.println(name);
	}
}

class Dog extends Animal
{
		
	String color="black";
	
	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		//System.out.println("eating bread");
		super.eat();
	}
	
	Dog()
	{
		super(); // invoke parent class constructor
		//System.out.println("this is Dog..");
	}
	
	Dog(String name)
	{
		super(name);
	}
	
}
