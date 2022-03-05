import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true){ //Loop only broken if user says so
			
			int[] nums = new int[5];
			int sum = 0; //Sum of numbers entered is needed to calculate average

			for(int loop = 0; loop != 5; loop++) //For loop is used to ask for numbers as only 5 are required
			{
				System.out.println("Please enter number "+(loop+1));
				int number = Integer.parseInt(input.nextLine());
				sum += number; //The number entered is added to the sum

			} 

			double avg = (double)(sum) / 5; //Average calculation is carried out as a double so decimal places can be accounted for
			System.out.println("The average is "+avg);

			System.out.println("Do you want to go again? (yes/no)");
			String choice = input.nextLine().toLowerCase();
			if (choice.equals("no")){ //If the user says no the program terminates
				break;
			}
		}
	}
}