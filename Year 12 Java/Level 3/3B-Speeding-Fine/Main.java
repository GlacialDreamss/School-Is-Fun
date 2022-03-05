import java.util.*;
class Main {
  	public static void main(String[] args) {
   		Scanner keyboard = new Scanner(System.in);
    		System.out.println("Enter the motorcyclist speed:");
		int speed = Integer.parseInt(keyboard.nextLine()); //Answer converted to int for calculations
		if (0 <= speed && speed < 40) {
			System.out.println("They are not speeding");
		} //If speed is between 0 and 40 they are not speeding

		else if (40 <= speed && speed <= 44) {
			System.out.println("That is a fine of £90");
		} //If speed is between 40 and 44 they are given £90

		else if (speed > 44) {
			System.out.println("That is a fine of £"+((speed-44)*100));
		} //If speed is above 44 they are given a fine of £100 for every 1 above 44
		
		else {
			System.out.println("Invalid speed");
		} //If the value is too big, not a string or negative an error message is displayed
	}
  }