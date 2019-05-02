package Life;

public class Human {
//We have achieved encapsulation by having our instance variable private
//We will then provide setters and getters to provide access

	private int personAge;  //These are instance variables, they belong to the object.
	private String personName;
	private double personWealth;
	private boolean personHasVehicle;  
	private double personHungerLevel;
	private int personFoodAmount;
	private Vehicle[] vehicles; //An array of vehicles. 

	public Human() { //Constructor: new Human();
		this.personAge = 0; //This refers to the object of instantiation of the class. 
		this.personName = "";
		this.personWealth = 0.0;
		this.personHasVehicle = false;
		this.personHungerLevel = 5.0;
		this.personFoodAmount = 5;
		this.vehicles = new Vehicle[100];
	}
	
	public Human(String personName, int personAge) { //Overloaded Constructor.
		this.personAge = personAge;
		this.personName = personName;
	}

	//Getter: Returns the values of instance variables
	public int getAge() {
		return this.personAge;
	}
	
	public String getName() {
		return this.personName;
	}
	
	//Setter: Changes the values of instance variables
	public void setAge(int age) {
		this.personAge = age;
	}
	
	public void setName(String name) {
		this.personName = name;
	}

	@Override 
	public String toString() {
		return "Human: [ name: " + getName() + ", age: " + getName() + ", wealth: " + this.personWealth + "$";
	}
	
	public int numberOfVehicles() {
		int total = 0;
		for(int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				total++;
			}
			else {
				break;
			}
		}
		return total++;
	}

	public void eat() {
		if (personFoodAmount > 0 ) { 
			personHungerLevel = personHungerLevel - 1 ;
			personFoodAmount = personFoodAmount - 5;
			System.out.println("Yummy! I ate it all! ");
		}
		else {
			System.out.println("Not enough. Please buy food.");
		}
	}

	public void eat(double food) { //Overloaded method
		personHungerLevel = personHungerLevel - (food / 4.5);
	}
	
	public void grow() {
		++personAge;
	}

	public void work() {
		if (personHungerLevel < 0) {
			personWealth = personWealth + 100;
			System.out.println("Woah, I worked a lot.");
		}
		else {
			System.out.println("Too hungry to work.");
		}
	}

	public void buyFood() {
		if (personWealth > 20) {
			personWealth = personWealth - 15;
			personFoodAmount++;
			System.out.println("Yoohoo! I bought some food!");
		}
		else { 
			System.out.println("Not enough money. Please work.");
		}
	}
}
