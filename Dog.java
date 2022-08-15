/*Class declaration
 * To define a class, its objects, instance variables and methods
*/

public class Dog
{
	/* Instance Variables 
	 * To instantiate objects of class Dog
	*/
	String name;
	String breed;
	int age;
	String color;

	/*Constructor Declaration of Class
	 * To initialize objects of a Dog.
	*/
	public Dog(String name, String breed,
				int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}//end Dog(...) constructor

	/* getName() method
	* To get name
	*/  
	public String getName()
	{
		return name;
	}//end getName() method

	/* getBreed() method
	* To get breed
	*/  
	public String getBreed()
	{
		return breed;
	}//end getBreed() method

	/* getAge() method
	* To get age
	*/  
	public int getAge()
	{
		return age;
	}//end getAge() method

	/* getColor() method
	* To get color
	*/  
	public String getColor()
	{
		return color;
	}//end getColor() method

	/* Overriding the toString() method, returns the desired output. 
	* toString() method to represent object(s) as a string.
	*/
	@Override
	public String toString()
	{
		return("Hi my name is "+ this.getName()+
			".\nMy breed, age and color are: " +
			this.getBreed()+", " + this.getAge()+
			", "+ this.getColor());
	}//end toString method

	/* This us the main class.
	 * It will run first before Dog class, and output what is in it.
	*/
	public static void main(String[] args)
	{
		//Dog object called 'spotty' is instantiated.
		Dog spotty = new Dog("Spotty","puppies", 3, "white and brown dot on the left eye.");
		//Printing instances of Dog object using .toString() method
		System.out.println(spotty.toString());
	}//end main method
}//end Dog class