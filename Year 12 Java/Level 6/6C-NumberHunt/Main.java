import java.util.*;
class Main {
	public static void main(String[] args) {
		int min = 10;
		int max = 40;
		int[] boxes = new int[20];
		boolean nineteen = false; //Boolean flag determines whether or not 19 is printed

		for (int loop = 0; loop !=20; loop++)
		{
			int ranInt = min + (int) (Math.random() * (max - min + 1));
			boxes[loop] = ranInt; //Random number in range generated

			if (ranInt == 19)
			{
				nineteen = true; //If the generated integer is 19 then the flag becomes true
			}
			
			System.out.print(ranInt);
			if (loop != 19)
			{
				System.out.print(" - "); //Dashes not printed at the end of the array
		}	}

		if (nineteen == true)
		{
			System.out.println("\nThe array contains 19"); //If the flag is true the user is told that 19 is in the array
		}
	}
}