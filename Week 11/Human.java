package Life;

public class Human {

	public int personAge; 
	public String personName;
	public double personWealth;
	public boolean personHasVehicle;  
	public int personHungerLevel;
	public int personFoodAmount;

	public void eat() {
		if (personFoodAmount >0 ) 
		--personHungerLevel;
		else 
			System.out.print("Not enough. Please buy food.");
	}
	
	public void grow() {
		++personAge;
	}

	public void work() {
		if (personHungerLevel < 0)
			personWealth = personWealth + 100;
		else 
			System.out.print("Too hungry to work.");
	}

	public void buyFood() {
		if (personWealth > 20) {
			personWealth = personWealth - 15;
			personFoodAmount++;
		}
		else { 
			System.out.print("Not enough money. Please work.");
		}
	}
}
