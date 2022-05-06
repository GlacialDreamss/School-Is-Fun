import java .util .*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System .out .println("Please enter a number between 1 and 10");
		int number = Integer .parseInt(input .nextLine()); //Input converted to integer for calculations

		if (number <= 10 && number >= 0 ) {
		System .out .println("Your binary is "+Integer.toBinaryString(number)); //Integer converted to binary string if condition of number being between 1 and 10 is met
		}
		else {
			System .out .println("Invalid number"); //Default output for invalid input
		}
	}
}