import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name");
		String name = input.nextLine(); //Users name is asked for

		while (true) //Loop repeats questions for the numbers until the user chooses otherwise
		{
			System.out.println("What is your first number?");
			int num1 = Integer.parseInt(input.nextLine()); 

			System .out .println("What is your second number?");
			int num2 = Integer.parseInt(input.nextLine());

			System .out .println("The sum is "+(num1+num2));

			System.out.println("Do you want to add more numbers (yes/no)");
			String choice = input.nextLine();  
			
			if (choice.toLowerCase().equals("no"))
			{
				break;	//When the user chooses something else the loop is exited
			}
		}

	}
}