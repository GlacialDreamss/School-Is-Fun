import java.util.*;
class Main {
	public static void main(String[] args) {
		LinkedList<String> words = new LinkedList<String>();

		Scanner input = new Scanner(System.in);

		boolean flag = true;

		while(flag){
			
			for(int wordCount = 0; wordCount !=5; wordCount++){ //The users words are input
				System.out.print("Please enter word "+(wordCount+1)+": ");
				String word = input.nextLine();
				words.add(word);
			}

			for(int index = 0; index != 5; index++){ //The words are bubble sorted in descending length

				for(int index2 = 0; index2 != 5; index2++){

					if(words.get(index).length() > words.get(index2).length()){
						
						String placeholder = words.get(index);
						words.set(index, words.get(index2));
						words.set(index2, placeholder);
					} 
				}
			}
		
			System.out.println("The longest word: "+words.get(0));//The words are output based on their length
			System.out.println("The shortest word: "+words.get(4));

			System.out.println("Would you like to try again? (Y/N)");
			String choice = input.nextLine();
			if(choice.equals("N")){ //The flag triggers if the user chooses not to continue
				flag = false;
			}

			
		}
	}
}