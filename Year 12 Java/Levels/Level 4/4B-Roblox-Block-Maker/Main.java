import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How big is the block?");
		int blockNum = Integer.parseInt(input.nextLine()); //User enters block size

		for (int top = 0; top != blockNum; top++)
		{
			System.out.print("X"); //X is printed according to input on a single line
		}

		for (int middle = 0; middle != blockNum-2; middle++)
		{
			System.out.print("\nX");

			for (int space = 0; space !=blockNum-2; space++)
			{
				System.out.print(" ");//Spaces are integrated between 2 Xs to make up the body
			}
			
			System.out.print("X");
			
		}

		System.out.print("\n");

		for (int bottom = 0; bottom != blockNum; bottom++)
		{
			System.out.print("X"); //The bottom Xs are printed using a for loop due to given number of loops
		}		
	}
}