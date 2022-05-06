import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System .in);

		System .out .println("How many inches?");
		int inches = Integer.parseInt(keyboard .nextLine());
		
		System .out .println("How many small bricks?");
		int smallBricks = Integer.parseInt(keyboard.nextLine());
		System .out .println("How many big bricks?");
		int bigBricks = Integer .parseInt(keyboard.nextLine());
		int combination = smallBricks + (bigBricks*5); //Combination determined to see if it will meet 22 before selection occurs

		if (combination != inches) {
			System.out.println("That combination will not fit into "+inches+" inches"); //Option for if it doesn't fit into the given inches
		}
		else {
			System.out.println("That combination will fit into "+inches+" inches"); //Option for if it fits into the given inches
		}
	}
}