import java .util .*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is 9 + 10?\nA - 21\nB - 21\nC - 21\nD - 19");
		String answer = input.nextLine(); //User response to answer stored as string

		switch(answer.toUpperCase()) {

			case "A": System.out.println("Incorrect");
			break;//Various cases provided to check answer variable in order to provide response
			
			case "B": System.out.println("Incorrect");
			break;

			case "C": System.out.println("Incorrect");
			break;

			case "D": System.out.println("Correct");
			break; 

			default: System.out.println("Invalid choice");
			break; //Default set as invalid choice
		}
	}
}