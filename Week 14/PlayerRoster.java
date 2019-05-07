import java.util.Scanner;

public class PlayerRoster {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int[] playerNumber = new int[5];
		int[] playerRating = new int[5];
		int number;
		int rating;

		for (int i = 0; i <= playerNumber[5]; i++) {
			System.out.print("Enter player " + (i + 1)+ "'s jersey number: ");
			number = scnr.nextInt();
			playerNumber[i] = number;
			System.out.println();
			if (number > 99 || number < 0) {
				System.out.println("Jersey number not in range (0-99). Try again.");
				number = scnr.nextInt();
			}
		}

		for (int i = 0; i <= playerRating[5]; i++) {
			System.out.print("Enter player " + (i + 1)+ "'s rating: ");
			rating = scnr.nextInt();
			playerRating[i] = rating;
			System.out.println();
			System.out.println();
			if (rating > 99 || rating < 1) {
				System.out.println("Rating not in range (1-9). Try again.");
				rating = scnr.nextInt();
			}
		}

		boolean done = true;

		if (done == false) {
			System.out.println("MENU");
			System.out.println("o - Output roster");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("q - Quit");
			System.out.println("");
			System.out.println("Choose an option: ");
			String commandInstruction = "p"; 
			if (commandInstruction.equalsIgnoreCase("q")) {
				done = true;
				break;
			}

			else if (commandInstruction.equalsIgnoreCase("o")) {
				System.out.println("Roster");
				for (int i = 0; i <= playerRating[5]; i++) {
					System.out.println("Player " + (i + 1) + "--Jersey number: " + playerNumber[i] + "Rating: " + playerRating[i]);
				}
			}
		}
		else {
			break;
		}

		/*System.out.println("Enter player 1's jersey number: ");
		number = scnr.nextInt();
		System.out.println("Enter player 1's rating: ");
		rating = scnr.nextInt();

		System.out.println("Enter player 2's jersey number: ");
		number = scnr.nextInt();
		System.out.println("Enter player 2's rating: ");
		rating = scnr.nextInt();

		System.out.println("Enter player 3's jersey number: ");
		number = scnr.nextInt();
		System.out.println("Enter player 3's rating: ");
		rating = scnr.nextInt();

		System.out.println("Enter player 4's jersey number: ");
		number = scnr.nextInt();
		System.out.println("Enter player 4's rating: ");
		rating = scnr.nextInt();

		System.out.println("Enter player 5's jersey number: ");
		number = scnr.nextInt();
		System.out.println("Enter player 5's rating: ");
		rating = scnr.nextInt(); */

	}
}
