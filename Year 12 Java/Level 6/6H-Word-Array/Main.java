import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] words = new String[5];
		int[] wordLength = new int[5];

		int maxIndex = 0; 
		int minIndex = 0;
		
		while (true){
			for(int wordLoop = 0; wordLoop != 5; wordLoop++ ){ //words entered by the user are stored in the loop and the length of those words are calculated
				System.out.print("Enter word "+(wordLoop+1)+": ");
				words[wordLoop] = input.nextLine();
				wordLength[wordLoop] = words[wordLoop].length(); 

			}

			for(int loopIndex = 0; loopIndex != 5; loopIndex++){ //The maximum and minimum are calculated based on index values and an external variable that holds the overal maximum or minimum. If there are equal values, the latter one is taken

				if (wordLength[maxIndex] < wordLength[loopIndex]){
					maxIndex = loopIndex;
				}
				if (wordLength[maxIndex] == wordLength[loopIndex]){
					maxIndex = loopIndex;
				}

				if (wordLength[minIndex] > wordLength[loopIndex]){
					minIndex = loopIndex;
				}
				if (wordLength[minIndex] == wordLength[loopIndex]){
					minIndex = loopIndex;
				}				
			}

			System.out.println("The longest word is word "+(maxIndex+1)+":\n"+words[maxIndex]+"\nThe shortest word is word "+(minIndex+1)+":\n"+words[minIndex]+"\n\nWould you like to go again (yes/no)");
			String choice = input.nextLine().toLowerCase();
			
			if(choice.equals("no"));{//If user responds now program ends
				break;
			}
			
		}
	}
}