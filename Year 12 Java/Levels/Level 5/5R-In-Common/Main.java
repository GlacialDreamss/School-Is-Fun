import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Variable for letters to be checked against 
		boolean sentence1check = false;
		boolean sentence2check = false;//The conditions for a letter being in common are set to false 
 
		
		System.out.println("Enter sentence 1 ");
		String sentence1 = input.nextLine().toUpperCase();

		System.out.println("Enter sentence 2 ");
		String sentence2 = input.nextLine().toUpperCase();//User inputs sentences
		
		System.out.println("The letters in common are:");
		for(int loop = 0; loop != 26; loop++){ //First loop goes through each character in the alphabet Variable

			for(int sentence1loop = 0; sentence1loop != sentence1.length(); sentence1loop++){ //Loop compares each letter in sentence 1 to current letter in alphabet

				if (alphabet.charAt(loop) == sentence1.charAt(sentence1loop)){

					sentence1check = true; //If the letter is found then the flag is made true
				}
			}

			for(int sentence2loop = 0; sentence2loop != sentence2.length(); sentence2loop++){ //The same is repeated in these loops for sentence 2

				if (alphabet.charAt(loop) == sentence2.charAt(sentence2loop)){

					sentence2check = true; 
				}
			}
			if (sentence1check == true && sentence2check == true){ //If both sentneces have the letter it is output
				System.out.print(alphabet.charAt(loop)+" ");
			}
	
			sentence1check = false;
			sentence2check = false; //The flags are reset to false for the next loop


		}
	}
}