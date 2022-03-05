import java.util.*;

class Main {
  	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

    		System .out .println ("How many characters do you need to store?");
		int number = Integer .parseInt (keyboard.nextLine()); //Answer stored as a variable for calculations

		if (number > 0 && number < 128) {
			System .out .println ("You  should use Basic ASCII"); //Range for Basic ASCII set in IF statement
		}
		else if (number >= 129 && number < 257 ) {
			System .out .println ("You should use Extended ASCII"); //Range for Extended ASCII set as another option in ELSE IF statement

		}
		else if (number >= 257) {
			System .out .println("You should use Unicode"); 
		}
		else {
			System .out .println ("Invalid number of characters"); //Invalid range set as the default using ELSE statement
		}
  	}
}