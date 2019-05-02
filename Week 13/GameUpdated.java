package Life;

import java.util.Random;

public class Game {

	public static void main(String[] args) {
		Human personOne = new Human();
		Human personTwo = new Human();
		Human personThree = new Human("Sarah", 16);

		personTwo.setAge(5);
		personOne.setName("Adrian");
		personOne.setAge(14);
		personOne.eat();
		personOne.work();
		
		System.out.println("Age of Person One: " + personOne.getAge());
		System.out.println("Age of Person Two: " + personTwo.getAge());
		System.out.println("Age of Person Three: " + personThree.getAge());
		System.out.println(personOne);
		System.out.println(personTwo);
		System.out.println(personThree);

		int randomInt = (int)(Math.random()*20) + 1;
		System.out.print(randomInt);
		Random rn = new Random();
		int n = rn.nextInt(44);
		
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
