import java .util .*;
class Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
 
                System.out.println("Please enter your number:");
                int num1 = Integer.parseInt(input.nextLine());

		for (int loop = 0; loop!=4; loop++)
		{
			System.out.print(num1%10);
			num1 = num1/10;
		}
        }
}
