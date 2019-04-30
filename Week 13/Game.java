package Life;

public class Game {

	public static void main(String[] args) {
		Human personOne = new Human();
		Human personTwo = new Human();
		Human personThree = new Human("Sarah", 16);

		personTwo.personAge = 5;
		System.out.println("Age of Person One: " + personOne.personAge);
		System.out.println("Age of Person Two: " + personTwo.personAge);
		System.out.println("Age of Person Three: " + personThree.personAge);

		/*
		System.out.println("Hunger: " + personOne.personHungerLevel);
		System.out.println("Food: " + personOne.personFoodAmount);	

		System.out.println("Eating Command: ");
		personOne.eat();
		System.out.println("Eating Command: ");
		personOne.eat();
		System.out.println("Eating Command: ");
		personOne.eat();

		System.out.println("Hunger: " + personOne.personHungerLevel);
		System.out.println("Food: " + personOne.personFoodAmount);	

		System.out.println("Buying Food Command: ");
		personOne.buyFood();

		System.out.println("Working Command: ");

		System.out.println("Buying Food Command: ");
		personOne.buyFood();

		System.out.println("Working Command: ");
		personOne.work();
		System.out.println("Working Command: ");
		personOne.work();
		System.out.println("Eating Command: ");
		personOne.eat();
		System.out.println("Working Command: ");
		personOne.work();
		 */
	}
}
