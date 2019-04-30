package Life;

public class Human {

	public int personAge;  //These are instance variables, they belong to the object.
	public String personName;
	public double personWealth;
	public boolean personHasVehicle;  
	public double personHungerLevel;
	public int personFoodAmount;
	public Vehicle[] vehicles; //An array of vehicles. 

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
