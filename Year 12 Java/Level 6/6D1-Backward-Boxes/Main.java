import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] chars = new char[8]; //Array to contain 8 characters created

		while(true)
		{
			for(int loop = 0; loop != 8; loop++)
			{
				System.out.println("Please enter character "+(loop+1));
				char c = input.nextLine().charAt(0);
				chars[loop] = c; //The entered character is saved to the array
			}

			for(int output = 0; output != 8; output++)
			{
				System.out.print(chars[(7-output)]); //The array is printed backwards through a looped integer being taken away from the last index, reversing the order
			}

			System.out.println("\nWould you like to do that again(yes/no)");
			String choice = input.nextLine().toLowerCase();
			if (choice.equals("no")){ //If the user says no the program terminates
				break;
			}

		}
	}
}