import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the day");
		int day = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the month");
		int month = Integer.parseInt(input.nextLine());

		int dayTotal = ((month-1)*31)+day; //Number of total days is found 

		if ( 350 < dayTotal || dayTotal <= 74 ){ //Number of total days has to fit into a group for a season to be output
			System.out.println("Winter");
		} 
		else if (74 < dayTotal && dayTotal <= 166){
			System.out.println("Spring");
		}
		else if (166 < dayTotal && dayTotal <= 258){
			System.out.println("Summer");
		}
		else if (258 < dayTotal && dayTotal <= 349){
			System.out.println("Autumn");
		}
		else{
			System.out.println("Invalid");
		}
	}		
}