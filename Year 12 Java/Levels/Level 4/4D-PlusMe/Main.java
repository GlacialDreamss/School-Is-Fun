import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = 0+(int) (Math .random()*((10-0) +1));
		int num2 = 0+(int) (Math .random()*((10-0) +1));
		int num3 = 0+(int) (Math .random()*((10-0) +1)); //Three random numbers generated

		while (true) //While loop repeats the question for the numbers
		{
			System .out .println("Please enter the sum of "+num1+", "+num2+" and "+num3+": "); //Question is asked 
			int sum = Integer.parseInt(input.nextLine());

			if ((num1 + num2 + num3) == sum) //If user is correct the loop ends
			{
				System.out.println("Correct");
				break;
			}
			else
			{
				System.out.println("Wrong, try again"); //If user is incorrect the loop continues
			}
		}
	}
}