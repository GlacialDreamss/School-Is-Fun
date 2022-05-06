import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(true){ //Loop is infinite until user guesses magic word
			System.out.println("Please enter your name");
			String name = input.nextLine();	

			System.out.println("Please enter the number (1-7)"); //User inputs number 
			int num = Integer.parseInt(input.nextLine());
			
			for (int loop = 0; loop != num; loop++){ //Users number determines numbers of loops
				if ((loop % 2) == 0) {
					System.out.println(name.toUpperCase());
				}
				else {
					System.out.println(name.toLowerCase());
				}
			}

			System.out.println("What is the magic word?");
			String magicWord = input.nextLine();
			
			if (magicWord.equals("fishcake")){ //If user correctly guesses magic word loop ends
				System.out.println("Correct");
				break;
			}
			
			System.out.println("Wrong");
		}
	}
}