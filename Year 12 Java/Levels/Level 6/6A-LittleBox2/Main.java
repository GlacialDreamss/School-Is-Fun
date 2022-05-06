import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] characters = new char[5];
		
		while (true) //Loop only terminates if user allows it to
		{
			for (int loop = 0; loop != 5; loop++) //Only 5 chars are added to list
			{
				System.out.println("Please enter character "+(loop+1));
				char character = input.nextLine().charAt(0);
				characters[loop] = character;

			}
			
			System.out.println("Here is your output");

			for (int output = 0; output != 5; output++)
			{
				System.out.print(characters[output]);
				if (output != 4) //The dash is only added inbetween characters with an upcoming character
				{
					System.out.print(" - "); 
				}
			}

			System.out.println("\nDo you want to go again? (yes/no)");
			String choice = input.nextLine().toLowerCase();
			if (choice.equals("no")){ //If the user says no the program terminates
				break;
			}
			
		} 

	}
}