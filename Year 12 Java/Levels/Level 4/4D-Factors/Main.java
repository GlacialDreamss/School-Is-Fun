import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int number = Integer.parseInt(input.nextLine());

		System.out.println("The factors of "+number+" are:");

		for (int loop = 0; loop <= number / 2; loop++) {
			double factor = number % (loop+1); //The remainder of the number divided by the loop is found to determine whether or not it is a factor

			if (factor == 0 ) { //If the remainder is anything other than 0 it isn't printed due to not being a factor
				System.out.print((loop+1)+", ");
			}
		}
	}
}