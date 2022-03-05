import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");
		int number = Integer.parseInt(input.nextLine());

		if (number % 2 == 0 ) { //Program checks if there is a remainder
			System.out.println("The next 3 even numbers are "+(number+2)+", "+(number+4)+" and "+(number+6)); //If there is no remainder 2, 4 and 6 are added as it is already even
		}
		else {
			System.out.println("The next 3 even numbers are "+(number+1)+", "+(number+3)+" and "+(number+5)); //If there is a remainder 1, 3 and 5 are added to make it even
		}
	}
}