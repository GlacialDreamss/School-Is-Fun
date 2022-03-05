import java.util.*;
class Main {
	public static void main(String[] args) {
		String[] countries = {"china", "england", "russia"};
		String[] capitals = {"beijing", "london", "moscow"}; //The capitals and countries are set into parallel arrays

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter capital city");
		String capital = input.nextLine().toLowerCase();//The user is asked for their input

		for(int loop = 0; loop != 3; loop++) {
			if(capital.equals(capitals[loop])) { //If the user's input is equal to a capital city in the arry the corresponding country is output
				System.out.println(capital+" is the capital city of "+countries[loop]);
				break;
			}
			if(loop == 2) { //If the loop does not find a matching country by the final iteration then there is no matching country
				System.out.println("No matching country");
			}
		}
	}
}