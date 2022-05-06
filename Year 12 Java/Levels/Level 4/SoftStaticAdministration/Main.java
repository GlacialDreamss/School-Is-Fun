import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = Integer.parseInt(input.nextLine());
		System.out.println("Please enter the range:");
		int range = Integer.parseInt(input.nextLine());

		for (int out = 1; out <= range; out++)
		{
		for (int in = 1; in <= range; in++)
		{
			System.out.print((out*in)+"\n");
		}
		}
	}
}