import java.util.Scanner;
import java.util.Random;

class PromptBank {
	String [] questions;
	String [] statements;

	public PromptBank() {
		questions = new String[3]; 
		statements = new String[3]; 
	}

	public void populateStatementsArray(String thingOne, String thingTwo){
		statements[0] = "Let's discuss " + thingOne + " and " + thingTwo + ".";
		statements[1] = thingOne + " and " + thingTwo + " seem to be troubling you. Please tell me more.";
		statements[2] = "We should talk through why " + thingOne + " and " + thingTwo + " might be on your mind.";
	}

	public void populateQuestionsArray(String thingOne, String thingTwo){
		questions[0] = "What else can you tell me about " +  thingOne + " and " + thingTwo + "?";
		questions[1] = "How often do you think about " + thingOne + " and " + thingTwo + "?";
		questions[2] = "Why do you think " + thingOne + " btothers you? What about " + thingTwo + "?";
	}

	public String getRandomStatementTrunk(){
		Random randomNumber = new Random();
		int random = randomNumber.nextInt(3); 
		return statements[random]; 
	}

	public String getRandomQuestionTrunk(){
		Random randomNumber = new Random();
		int random = randomNumber.nextInt(3); 
		return statements[random]; 
	}
}

class ProjectEliza  {
	static Scanner scnr = new Scanner(System.in);

	static String wordOne;
	static String wordTwo;
	static boolean runSession = true;
	static PromptBank Eliza = new PromptBank(); 

	static public void sessionGreeting() {
		System.out.println("Hello, my name is Eliza. What is your name?");
		String userName = scnr.next(); 
		System.out.println("Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");
	}

	public static void elizaStatements(String userResponse) {
		String[] array = userResponse.split(" ");
		wordOne = array[0];
		wordTwo = array[array.length - 1];
		if ((wordTwo.endsWith(".") || wordOne.endsWith("!"))) {
			wordTwo = wordTwo.substring(0, wordTwo.length() - 1); 
		}
		Eliza.populateStatementsArray(wordOne, wordTwo);
		System.out.println(Eliza.getRandomStatementTrunk());
		userDialogue();
	}

	public static void elizaQuestions(String userResponse) {
		wordTwo = "";
		String[] array = userResponse.split(" "); 
		String wordOne = array[0];
		wordTwo = array[array.length - 1];
		wordTwo = wordTwo.substring(0, wordTwo.length() - 1); 
		Eliza.populateQuestionsArray(wordOne, wordTwo);
		System.out.println(Eliza.getRandomQuestionTrunk());
		userDialogue();
	}

	public static void userDialogue() {
		String userResponse = "";
		while (runSession = true) {
			userResponse = scnr.nextLine();
			if (userResponse.equalsIgnoreCase("Exit")) {
				exitSession();
			}
			else {
				if (userResponse.endsWith("?")) {
					elizaQuestions(userResponse);
				}
				else if (userResponse.endsWith("!")) {
					System.out.print("WOW! Dramatic!"); 
					elizaStatements(userResponse);
				}
				else if (userResponse.equalsIgnoreCase("EXIT")) {
					exitSession();
				}
				else {
					otherStatement(userResponse); 
				}
			}
		}
	}
	public static void exclamationStatments(String userIn) {
		String[] array; 
		array = userIn.split(" ");
		wordOne = array[0];
		wordTwo = array[array.length-1];
		if (wordTwo.endsWith(".") || wordTwo.endsWith("!"))
			wordTwo = wordTwo.substring(0, wordTwo.length()-1);
		System.out.print("WOW! Dramatic! ");
		Eliza.populateStatementsArray(wordOne, wordTwo);
	}
	
	public static void otherStatement(String userResponse) {
		if (userResponse.contentEquals("") || userResponse.contentEquals(" ")) {
			System.out.print("");
		}
		else {
			elizaStatements(userResponse);
		}
	}

	public static void exitSession() {
		String runAgain;
		System.out.println("Do you want to run the session again?");
		runAgain = scnr.next();
		if (runAgain.equals("no") || runAgain.equals("No") || runAgain.equals("NO") || runAgain.equals("nO)")) {
			System.out.println("Goodbye. See you next week.");
		}
		if (runAgain.equals("yes") || runAgain.equals("YES") || runAgain.equals("Yes")) {
			sessionGreeting();
		}
	}

	public static void main(String[] args) {
		sessionGreeting();
		userDialogue();
	}
}
