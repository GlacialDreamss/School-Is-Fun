import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int oddness = 0;
		while(true){

			System.out.println("Please enter your 5 digit number");
			String number = input.nextLine();

			if (number.length() != 5){

				System.out.println("Not 5 digits");
				break; //Program ends if number isn't 5 digits
			}

			for(int loop = 0; loop != 5; loop++){
			
				if (Character.getNumericValue(number.charAt(loop))%2 != 0 ){
					oddness++; //1 is added to counter for every odd number
				}
			}

			if (oddness == 5){
				System.out.println("That is a very odd number"); //Message is output based on how many odd numbers there are
			}
			else if (oddness != 0){
				System.out.println("That is not a very odd number");
			}

			System.out.println("Would you like to try again? (Y/N)");
			String choice = input.nextLine().toUpperCase();
			
			if (choice.equals("N")){ //If the user's response to the above question is to discontinue the program, it terminates
				break;
			}
		}
	

	}
}