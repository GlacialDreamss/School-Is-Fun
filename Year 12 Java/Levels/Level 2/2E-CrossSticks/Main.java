import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter a 5 letter word: ");
    String word = kb.nextLine();
    String wordUpper = word.toUpperCase(); //User input converted to fully uppercase
    for(int n = 0; n < 5; n++){ //For loop runs at a maximum of 5 times
      System.out.println(wordUpper.charAt(n)); //The n variable from the for loop is used to print a character from the wordUpper variable
    }
  }
}