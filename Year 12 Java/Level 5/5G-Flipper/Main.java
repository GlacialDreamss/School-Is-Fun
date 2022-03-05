import java.util.*;

class Main {
	public static void main(String[] args) {
		int loop =  0;
		int streak = 0;
		while(true){
			loop++;

        		int max = 2;
                	int min = 1;
                	int ranInt = min + (int) (Math.random() * (max - min + 1)); //50/50 Chance of either 1 or 2 being cchose			
			if (ranInt == 1){
				System.out.println(loop+". Heads");
				streak++; //If heads is flipped the streak continues
			}
			else{
				System.out.println(loop+". Tails");
				streak = 0; //If tails is flipped the streak resets
			}

			if (streak == 3){
				System.out.println("Three in a row");
				break; //If three heads are flipped in a row the loop ends
			}
		}

	}
}