import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);
   System.out.println("Please enter a 10 letter word: "); 
   String word = kb.nextLine(); //User can reply to question
   System.out.println("Camelising your word");
   String wordUpper = word.toUpperCase(); //One string is the word all in upper case
   String wordLower = word.toLowerCase(); //The other string is the word all in lower case
   for (int n = 0; n < 10; n++){ //For loop that caps at 10 (for the number of characters allowed) created
     System.out.print(wordUpper.charAt(n)); //The uppercase letter is output
     n++; //1 is added to n to make the next letter the one to be printed
     System.out.print(wordLower.charAt(n)); //The next letter is printed as lowercase
   }
  }
}