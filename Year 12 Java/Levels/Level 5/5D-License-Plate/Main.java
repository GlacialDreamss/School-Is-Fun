import java.util.*;
class Main {
	public static void main(String[] args) {
		int numMin = 0;
		int numMax = 9;
		int charMin = 65;
		int charMax = 90;
		int loop = 0;

		while(true) {
			loop++;

			if(loop < 3 || loop > 5){ //Placement of each character determined with statement
				int ranNum = charMin + (int) (Math.random() * (charMax - charMin + 1)); 
				char ranChar = (char)ranNum; //Random number assigned to character

				System.out.print(ranChar);
			}
			if (loop == 9){
				break; //Loop Breaks after duration of numberplate
			}
			if (4 < loop && loop <= 6) { //Placement of each number assigned with statement
				int ranNum = numMin + (int) (Math.random() * (numMax - numMin + 1));

				System.out.print(ranNum);		
			}
		}

	}
}