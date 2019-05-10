
public class Animal {

	private String name;
	private int birthYear;
	private double weight;
	private char gender;

	public Animal() {
		this.name = "";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.gender = 'u';
	}

	public Animal(String name, int birthYear, double weight, char gender) {
		this.name = name;
		this.birthYear = birthYear;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			weight = 1.0;
			this.weight = weight;
		}
		else {
			this.weight = weight;
		}
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		if (this.gender != 'f' || this.gender!= 'm' || this.gender != 'u') {
			this.gender = 'u';
		}
		else {
			this.gender = gender;
		}
	}

	public int calculateAge(int currentYear) {
		if (birthYear > currentYear) {
			return -1;
		} 
		else {
			return currentYear - birthYear;
		}
	}

	public boolean isMale() {
		boolean male = false;
		if (this.gender == 'm') {
			male = true;
		}
		return male;
	}

	public boolean isFemale() {
		boolean female = false;
		if (this.gender == 'f') {
			female = true;
		}
		return female;
	}

	public void printDetails() {
		System.out.print("Name: " + name);
		System.out.print(" || Year of Birth: " + birthYear);
		System.out.print(" || Weight: " + weight);
		System.out.print(" || Gender: " + gender);
	}

	public void gainWeight() {
		this.weight = weight + weight;
	}

	public void gainWeight(double weight) {
		this.weight = weight + weight;
	}

	public void loseWeight() {
		this.weight = weight - weight;
	}

	public void loseWeight(double weight) {
		this.weight = weight + weight;
	}

}
