import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter number 1:");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Please enter number 2:");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("Please enter number 3:");
		int num3 = Integer.parseInt(input.nextLine());

		if (num1 == (num2*num3))
		{
			System .out .println(num1+"^2 + "+num2+"^2 = "+num3+"^2");
		}
		else if (num2 == (num1*num3))
		{
			System .out .println(num2+"^2 + "+num1+"^2 = "+num3+"^2");
		}
		else if (num3 == (num1*num2))
		{
			System .out .println(num3+"^2 + "+num1+"^2 = "+num2+"^2");
		}
		else
		{
			System .out .println("This is not a pythagorean triple");
		}

	}
}