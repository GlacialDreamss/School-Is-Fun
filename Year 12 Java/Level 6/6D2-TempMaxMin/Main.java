import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cities = new String[4];
		int[] maxArray = new int[4];
		int[] minArray = new int[4]; //Arrays are defined to store values input by the user

		int minIndex = 0;
		int maxIndex = 0;//The index values for the indexes for max and min are defined

		for(int loop = 0; loop != 4; loop++) //The loop iterates 4 times to collect data for 4 cities 
		{
			System.out.println("Enter city "+(loop+1));
			String city = input.nextLine();
			cities[loop] = city;
			
			System.out.println("Enter "+city+"'s min");
			int min = Integer.parseInt(input.nextLine());
			minArray[loop] = min;

			System.out.println("Enter "+city+"'s max");
			int max = Integer.parseInt(input.nextLine());
			maxArray[loop] = max;
		}

		for (int loop2 = 0; loop2 != 4; loop2++) //The loop goes through each city once
		{
			if (minArray[minIndex] > minArray[loop2]) //If the value after is less than the value before in the (array) the index for that value is stored
			{
				minIndex = loop2;
			}

			if (minArray[minIndex] < minArray[loop2]) //If the value after is more than the value before in the (array) the index for that value is stored
			{
				maxIndex = loop2;
			}
		}
		
		System.out.println("Minimum "+cities[minIndex]+" "+minArray[minIndex]);
		System.out.println("Maximum "+cities[maxIndex]+" "+maxArray[maxIndex]);


		System.out.println("Hello world!");
	}
}