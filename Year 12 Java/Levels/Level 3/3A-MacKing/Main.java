import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("What would you like to order?:\nA - Veggie Delight\nB - Chicken Fusion\nC - Horse Burger\nD - Smoked Trout ");
    String choice = kb.nextLine(); //Input to question above stored as string
    if (choice.equals("A") || choice.equals("a")) {
      System.out.println("You chose the Veggie Delight\nThat'll be £1");
    } //If statement asks for the users selection then presents output based on it
      // || Used to stop case sensitivity
    else if (choice.equals("B") || choice.equals("b")) {
      System.out.println("You chose the Chicken Fusion\nThat'll be £1");
    } //Else if used to allow for other options
    else if (choice.equals("C") || choice.equals("c")) {
      System.out.println("You chose the Horse Burger\nThat'll be £1");
    } 
    else if (choice.equals("D") || choice.equals("d")) {
      System.out.println("You chose the Smoked Trout\nThat'll be £1");
    } 
    else {
      System.out.println("That isn't a menu option...");
    } //Else used if an incorrect option is selected
  }
}