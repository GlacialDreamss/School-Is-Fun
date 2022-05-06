import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		FileWriter odd = new FileWriter("odd.txt");
		FileWriter even = new FileWriter("even.txt");
		Scanner input = new Scanner(System.in);
		
		for(int loop = 0; loop != 5; loop++){
			System.out.println("Please enter number "+(loop+1));
			int number = Integer.parseInt(input.nextLine());
			
			if ((number%2) == 0){ //If there is a remainder after dividing by 2 then it is written to the even file 
				even.write(number+"\n");
			} 
			else if ((number%2) != 0){ //If there is no remainder then it is written to the odd file
				odd.write(number+"\n");
			}
			else{
				System.out.println("Invalid");//If the user doesn't enter a valid number then invalid is printed
			}
		}

		odd.close();
		even.close();
		
	}
}