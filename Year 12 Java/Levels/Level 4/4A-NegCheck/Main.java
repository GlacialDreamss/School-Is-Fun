import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int increment = 0;
		double average = 0;
	
		boolean flag = true;

		while (true) //while loop is infinite as unknown number of answers
		{
			System.out.print("Please enter a number: "); 
			int number1 = Integer.parseInt(input.nextLine());

			if (number1 >= 0 )
			{
				increment ++; //Number of times the while loop loops is needed for average calculation
				sum = sum + number1; //The input number is added to the sum IF positive 
			}	
			else
			{
				break; //The loop ends when negative is input
			}	
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+(double)(sum/increment));

	}
}