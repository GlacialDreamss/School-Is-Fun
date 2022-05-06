import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");
		int number = Integer.parseInt(input.nextLine());

		for (int loop = 0; loop < number; loop++) {

			for (int nestedLoop = 0; nestedLoop < number; nestedLoop++) { //Loop repeats the number of times stated
				System.out.print("X"); //Each X is printed on the same line 
			}
			System.out.print("\n"); //A new line is addeed for the next row
		}
	}
}