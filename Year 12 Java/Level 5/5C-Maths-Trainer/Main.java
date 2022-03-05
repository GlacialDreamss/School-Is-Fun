import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 

		int min = 1;
		int max = 15;

		while(true){
			int num1 = min + (int) (Math.random() * (max-min+1));
			int num2 = min + (int) (Math.random() * (max-min+1)); //Two numbers randomly generated

			System.out.println("What is "+num1+" + "+num2+"?");
			int response = Integer.parseInt(input.nextLine());

			if (response == num1 + num2){
				System.out.println("Correct");
			} 
			else{
				System.out.println("Incorrect");
			}	

			System.out.println("Would you like to go again? (Y/N)");
			String choice = input.nextLine();
			if (choice.equals("N")){
				break; //User can choose to exit or not
			}

		}




  }
}